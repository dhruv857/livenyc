package com.example.dhruv.livenyc1;

import com.example.dhruv.livenyc1.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class Feed extends Activity{

    public int interval;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        Intent intent = getIntent();
        String address = intent.getExtras().getString("loc");

        interval = 1000;
        if(  getIntent().getExtras() != null && getIntent().getExtras().getInt("interval") != 0)
            interval = getIntent().getExtras().getInt("interval");
        if ( getIntent().getExtras() != null && getIntent().getExtras().getString("address") != null)
            address = getIntent().getExtras().getString("address");

        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<script type=\"text/javascript\">\n" +
                "\n" +
                "function onload(){\n" +
                "\n" +
                "\tdocument.getElementById(\"myPic\").src = '"+address+"'+'?math='+Math.random();\n" +
                "\tsetTimeout(\"onload()\","+interval+");\n" +
                "}\n" +
                "\n" +
                "</script>\n" +
                "</head>\n" +
                "<body onload=\"onload()\">\n" +
                "<center>\n" +
                "\n" +
                "<img id=\"myPic\"  />\n" +
                "\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>";
        WebView mWebView;


        mWebView = (WebView) findViewById(R.id.webView);
        mWebView.getSettings().setJavaScriptEnabled(true);



        
        mWebView.loadData(html, "text/html", null);
        final String address1 = address;

        Button setting = (Button)findViewById(R.id.setting);

        setting.setOnClickListener(
                new View.OnClickListener() {

            public void onClick(View v) {
                Intent se = new Intent(Feed.this, Settings.class);
                se.putExtra("interval",interval);
                se.putExtra("loc",address1);
                startActivity(se);

            }
        });

    }







    }





