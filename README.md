# Android Webview Injection Example

This is an example of how to add AIML Score Frontend as a Webview to your Android application.

1. Internet Permissions

```xml
<uses-permission android:name="android.permission.INTERNET" />
```

This allows your app to access the internet, which is needed for the WebView to load web pages.

2. Add Webview to Main Activity

```xml
<WebView
    android:id="@+id/webview"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

3. Setting up the Webview in Activity.kt

```kt
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val webView: WebView = findViewById(R.id.webview)

    // Ensures links open in the WebView instead of a browser
    webView.webViewClient = WebViewClient()

    val webSettings: WebSettings = webView.settings
    webSettings.javaScriptEnabled = true  // Enable JavaScript if needed

    // Enable persistent cookies
    val cookieManager = CookieManager.getInstance()
    cookieManager.setAcceptCookie(true)
    cookieManager.setAcceptThirdPartyCookies(webView, true)

    // This enables persistent storage of cookies across sessions
    CookieManager.getInstance().flush()

    // Exchange the URL here for your client Frontend URL.
    webView.loadUrl("https://www.example.com")
}
```

