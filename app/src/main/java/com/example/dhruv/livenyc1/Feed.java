package com.example.dhruv.livenyc1;

import com.example.dhruv.livenyc1.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


public class Feed extends Activity implements View.OnClickListener{

    public int interval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        Intent intent = getIntent();
        String address = intent.getExtras().getString("loc");
        interval = 100;

        private String html="<!DOCTYPE html><html><head><script type=\"text/javascript\">" +
                "function onload(){"  +
                "document.getElementById(\"myPic\").src = \"" + address +
                "'+'?math='+Math.random()\";setInterval(\"onload()\","+interval+");}" +
                "</script></head><body onload=\"onload()\"><img id=\"myPic\"  /></body></html>";
        private WebView mWebView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mWebView = (WebView) findViewById(R.id.webview);
            mWebView.getSettings().setJavaScriptEnabled(true);

            //mWebView.loadUrl(URL);
            mWebView.loadData(html, "text/html",null);
            findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    refreshWebView();
                }
            });
        }

        private void refreshWebView() {
            mWebView.loadUrl("http://www.google.com");
        }

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub

        }



    }



    }

