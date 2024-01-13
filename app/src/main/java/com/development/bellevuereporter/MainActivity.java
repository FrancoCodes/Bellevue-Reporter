package com.development.bellevuereporter;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the WebView component from the layout
        WebView webView = findViewById(R.id.webView);

        // Enable JavaScript (if the website requires it)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Set a WebViewClient to handle internal navigation
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // Load the clicked URL within the WebView
                view.loadUrl(url);
                return true;
            }
        });

        // Load the website in the WebView
        webView.loadUrl("https://www.bellevuereporter.com/");
    }
}
