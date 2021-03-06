package com.priscilla.compose.utils
import android.app.Fragment
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.view.*
import android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
import android.view.WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 *
 * Created by Priscilla on 2021/9/25.
 * 使用:
 *  statusBar {
 *       uiFullScreen()
 *       windowFullScreen()
 *       setScreen(resources.getColor(R.color.purple_500,null),isExtend = true)
 *  }
 *
 *  设置多个以最后设置的为准
 */

fun ComponentActivity.statusBar(component: (Immerse.() -> Unit)) {
    component(Immerse.get())
}

fun Fragment.statusBar(component: (Immerse.() -> Unit)) {
    component(Immerse.get())
}

/**
 * 获取导航栏高
 * @author Priscilla
 */
private var result = -1
fun Context.getStatusBarHeight(): Int {
    if (result == -1) {
        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            result = resources.getDimensionPixelSize(resourceId)
        }
    }
    return result
}

class Immerse private constructor() {

    companion object {

        private val instant by lazy { Immerse() }

        fun get() = instant

    }

    /**
     * 延伸至导航栏
     * @author Priscilla
     * @param lightColor 字体颜色 true白色 false黑色 默认白色
     */
    fun ComponentActivity.uiFullScreen(lightColor: Boolean = true) {
        updateStatusBarLayout(lightColor)
        updateContentViewFitSystem()
    }

    /**
     * 隐藏导航栏,全屏
     * @author Priscilla
     */
    @RequiresApi(Build.VERSION_CODES.R)
    fun ComponentActivity.windowFullScreen() {
        val up30 = Build.VERSION.SDK_INT >= 30
        if (up30) {
            hideStatusBarUp30()
        } else {
            hideStatusBarUnder30()
        }
        fitCutout()
        lifecycle.addObserver(object : LifecycleObserver {
            @RequiresApi(Build.VERSION_CODES.R)
            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            fun onResume() {
                if (up30) {
                    hideStatusBarUp30()
                } else {
                    hideStatusBarUnder30()
                }
            }
        })
    }

    /**
     * 这是一个自由的导航栏
     * @author Priscilla
     * @param color 导航栏颜色
     * @param lightColor 字体颜色 true白色 false黑色 默认白色
     * @param isExtend 是否延伸至导航栏 ture延伸 false不延伸 默认不延伸
     */
    fun ComponentActivity.setScreen(
        lightColor: Boolean = true,
        color: Int = 0,
        isExtend: Boolean = false,
    ) {
        val decorView = window.decorView
        val option = if (isExtend) View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or if (lightColor)
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE else View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        else if (lightColor)
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE else View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        decorView.systemUiVisibility = option
        decorView.fitsSystemWindows = false
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        if(color != 0)
        window.statusBarColor = color
    }


     fun ComponentActivity.updateStatusBarLayout(lightColor: Boolean = true) {
        if (Build.VERSION.SDK_INT >= 30) {
            uiScreenUp30(lightColor)
        } else {
            uiScreenUnder30(lightColor)
        }

    }

    private fun ComponentActivity.updateContentViewFitSystem() {
        val contentView = findViewById<ViewGroup>(Window.ID_ANDROID_CONTENT)
        val childView = contentView.getChildAt(0)
        if (childView != null) {
            childView.fitsSystemWindows = false
        }
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun ComponentActivity.hideStatusBarUp30() {
        val controller = window.insetsController
        controller?.apply {
            hide(WindowInsets.Type.statusBars())
            hide(WindowInsets.Type.displayCutout())
            systemBarsBehavior = BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }

    private fun ComponentActivity.hideStatusBarUnder30() {
        val decorView = window.decorView
        val option = View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        decorView.systemUiVisibility = option
        decorView.fitsSystemWindows = false
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.TRANSPARENT
    }

    private fun ComponentActivity.fitCutout() {
        val lp = window.attributes
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            lp.layoutInDisplayCutoutMode =
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
            window.attributes = lp
        }
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun ComponentActivity.uiScreenUp30(lightColor: Boolean) {
        val controller = window.insetsController
        controller?.apply {
            show(WindowInsets.Type.statusBars())
            setSystemBarsAppearance(
                if (lightColor) {
                    0
                } else {
                    APPEARANCE_LIGHT_STATUS_BARS
                }, APPEARANCE_LIGHT_STATUS_BARS
            )
        }
        window.statusBarColor = Color.TRANSPARENT
        window.setDecorFitsSystemWindows(false)
    }

    private fun ComponentActivity.uiScreenUnder30(lightColor: Boolean) {
        val decorView = window.decorView

        val option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or if (lightColor) {
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        } else {
            View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
        decorView.systemUiVisibility = option
        decorView.fitsSystemWindows = false
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.TRANSPARENT
    }



}