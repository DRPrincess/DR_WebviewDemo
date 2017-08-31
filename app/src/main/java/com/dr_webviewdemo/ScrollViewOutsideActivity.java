package com.dr_webviewdemo;

import android.annotation.TargetApi;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 *  外层嵌套 ScrollView
 */
@TargetApi(21)
public class ScrollViewOutsideActivity extends AppCompatActivity {

    private static final String TAG = "ScrollViewOutsideActivi";
    WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_outside);

        mWebView = (WebView) findViewById(R.id.webview);


        String baiduUrl = "https://www.baidu.com/";
        String chaomaoUrl = "https://test.365eche.net/wap/index.php?app=estimateprice&noheader=1";
        String onlineUrl = "http://testreallycarm.365eche.net/ocert";


        //基本属性设置
        mWebView.getSettings().setJavaScriptEnabled(true); //格式会乱掉
        mWebView.getSettings().setDomStorageEnabled(true); //有些功能会失效
        mWebView.setWebViewClient(new WebViewClient()); //不设置此项，新链接会跳转到浏览器
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.loadUrl(baiduUrl);




    }
}
