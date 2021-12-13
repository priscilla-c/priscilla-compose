package com.priscilla.compose.ui.view

import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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