package com.example.aimlscorewebviewinjection

import android.os.Bundle
import android.webkit.CookieManager
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webview)

        // Ensures links open in the WebView instead of a browser
        webView.webViewClient = WebViewClient()

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        // Enable persistent cookies
        val cookieManager = CookieManager.getInstance()
        cookieManager.setAcceptCookie(true)
        cookieManager.setAcceptThirdPartyCookies(webView, true)

        // This enables persistent storage of cookies across sessions
        CookieManager.getInstance().flush()

        // Exchange the URL here for your client Frontend URL.
        webView.loadUrl("https://www.example.com/")
    }
}
