package com.whatever.myapplication.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.whatever.myapplication.R;


public class Show360V extends AppCompatActivity {


    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show360_v);

        webView = (WebView) findViewById(R.id.webview_show3dvision);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);

        webView.loadUrl("https://matheuspb95.github.io/panotour/Haus.html");




    }
}
