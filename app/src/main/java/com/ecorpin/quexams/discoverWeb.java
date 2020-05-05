package com.ecorpin.quexams;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class discoverWeb extends AppCompatActivity {
    String url;
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_web);

        myWebView = (WebView) findViewById(R.id.web_view);

        url = getIntent().getExtras().getString("url");

        //myWebView.loadUrl("https://my.quantumuniversity.edu.in");

        myWebView.setWebViewClient(new MyWebViewClient());

        myWebView.loadUrl(url);

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setSupportMultipleWindows(true);
        //webSettings.setBuiltInZoomControls(true);         //
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setAppCachePath("");
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setSaveFormData(false);
        webSettings.setSavePassword(false);
        webSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);

        // my settings
        //webSettings.setJavaScriptEnabled(true);

    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            /*
            if(url.indexOf(url) > -1)
                return false;
            return true;
            */
            return !url.contains(url);
        }
    }

    @Override
    public void onBackPressed()
    {
        if(myWebView.canGoBack()){
            myWebView.goBack();
        }else{
            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.ic_warning)
                    .setTitle("Exit!")
                    .setMessage("Are you sure you want to close?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();
        }
    }


}
