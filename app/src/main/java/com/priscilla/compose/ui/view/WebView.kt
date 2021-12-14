package com.priscilla.compose.ui.view

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView


/**
 * Created by Priscilla Cheung on 2021年12月13日16:22:28
 */

@Composable
fun webView(url:String) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            val webView = android.webkit.WebView(context)
            webView.settings.javaScriptEnabled = true
            webView.settings.javaScriptCanOpenWindowsAutomatically = true
            webView.settings.domStorageEnabled = true
            webView.settings.loadsImagesAutomatically = true
            webView.settings.mediaPlaybackRequiresUserGesture = false
            webView.webViewClient = WebViewClient()
            webView.loadUrl(url)
            webView
        })
}
fun openBrowser(context: Context, url: String?) {
    val intent = Intent()
    intent.action = Intent.ACTION_VIEW
    intent.data = Uri.parse(url)
    // 注意此处的判断intent.resolveActivity()可以返回显示该Intent的Activity对应的组件名
    // 官方解释 : Name of the component implementing an activity that can display the intent
    if (intent.resolveActivity(context.packageManager) != null) {
        val componentName = intent.resolveActivity(context.packageManager)
        context.startActivity(Intent.createChooser(intent, "请选择浏览器"))
    }
}