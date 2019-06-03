package com.example.android_tv_webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URL;

public class MainActivity extends Activity {

    public static final String EXTRA_URL = "http://bhavitechnologies.com/";
    WebView myWebview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebview = (WebView) this.findViewById(R.id.webz);
        myWebview.getSettings().setJavaScriptEnabled(true);
        myWebview.setWebViewClient(new WebViewClient());
        myWebview.loadUrl(EXTRA_URL);

    }
}
