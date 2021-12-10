package com.priscilla.compose.base

import android.app.Application
import com.priscilla.compose.utils.ObjectBox
import com.priscilla.compose.utils.DataManager

/**
 * name：priscilla
 * time：2021年6月29日17:05:09
 * info：Application
 */
class MyApp : Application() {
    //401 未登录 200 已登录
    override fun onCreate() {
        super.onCreate()
        myApp = this
        myApp?.let {
            ObjectBox.init(this)
            DataManager.createData()
        }
    }

    companion object {
        var myApp: MyApp? = null
    }
}