package com.example.aimlscorewebviewinjection

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Set your layout here

        val webView: WebView = findViewById(R.id.webview)
        webView.webViewClient = WebViewClient()  // Ensures links open in the WebView instead of a browser

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true  // Enable JavaScript if needed

        // Exchange the URL here for your client Frontend URL.
        webView.loadUrl("https://www.example.com/")
    }
}