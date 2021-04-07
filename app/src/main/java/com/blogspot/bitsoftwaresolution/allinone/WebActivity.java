package com.blogspot.bitsoftwaresolution.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebActivity extends AppCompatActivity {

    WebView web;
    String url="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        web=findViewById(R.id.webView);
        WebSettings webSettings=web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new WebActivity.Callback());
        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString("epuzzle");
        web.loadUrl(easyPuzzle);
        url=web.getUrl().toString();
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        url=web.getUrl().toString();
//        System.out.println(url);
        if(web!= null && web.canGoBack())
            web.goBack();// if there is previous page open it

            if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
                Intent i = new Intent(WebActivity.this, MenuActivity.class);
                startActivity(i);

                return;
            } else {
                Toast.makeText(getBaseContext(), "Click two times to go to Home", Toast.LENGTH_SHORT).show();
            }

        mBackPressed = System.currentTimeMillis();
//        else
//            super.onBackPressed();//if there is no previous page, close app
//        Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();
//        new Handler().postDelayed(new Runnable() {
//
//            @Override
//            public void run() {
//
//            }
//        }, 2000);
    }
    private static final int TIME_INTERVAL = 2000;
    private long mBackPressed;
//    @Override
//    public void onBackPressed() {
//        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
//            super.onBackPressed();
//            return;
//        } else {
//            Toast.makeText(getBaseContext(), "Click two times to close an activity", Toast.LENGTH_SHORT).show(); }
//        mBackPressed = System.currentTimeMillis();
//    }

}