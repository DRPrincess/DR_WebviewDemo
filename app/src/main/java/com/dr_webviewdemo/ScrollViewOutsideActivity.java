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
        mWebView.setWebViewClient(new WebViewClient()); //不设置此项，新链接会跳转都到浏览器
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.loadUrl(onlineUrl);

        //加载进度条

//        WebSettings webSettings = mWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setBuiltInZoomControls(false);
//        webSettings.setUseWideViewPort(true);
//        webSettings.setLoadWithOverviewMode(true);
//        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
//        mWebView.loadUrl(onlineUrl);
//        mWebView.setWebViewClient(new WebViewClient(){
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//                view.loadUrl(request.getUrl().toString());
//                return true;
//            }
//        });
//        mWebView.setWebViewClient(new WebViewClient(){
//
//        });


//
//        mWebView.setHapticFeedbackEnabled(false);
//
//        //把本类的一个实例添加到js的全局对象window中，
//        //这样就可以使用window.injs来调用它的方法
//        mWebView.getSettings().setJavaScriptEnabled(true);
//        mWebView.getSettings().setBlockNetworkImage(false);//解决图片不显示
//        mWebView.getSettings().setDomStorageEnabled(true);
//        mWebView.getSettings().setDatabaseEnabled(true);
//        mWebView.getSettings().setAppCacheEnabled(true);
//        mWebView.getSettings().setDefaultTextEncodingName("gbk");
//        //用户代理
//        mWebView.getSettings().setUserAgentString(mWebView.getSettings().getUserAgentString());
//
//
//        mWebView.setWebViewClient(new WebViewClient());
//
//        mWebView.loadUrl(onlineUrl);


    }
}
