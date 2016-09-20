package net.duohuo.dhroid.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.don.tools.Debug;
import com.don.tools.GeneratedClassUtils;

import net.duohuo.dhroid.util.LogUtil;
import net.duohuo.dhroid.util.ParamsContacts;
import net.duohuo.dhroid.view.ProgressWebView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import cn.hi028.android.highcommunity.R;
import cn.hi028.android.highcommunity.activity.BaseFragmentActivity;

@EActivity(resName = "activity_browse")
public class BrowseActivity extends BaseFragmentActivity {
	@ViewById(R.id.pw_browse)
	ProgressWebView webview;
	@ViewById(R.id.tv_secondtitle_name)
	TextView tv_title_name;
	@ViewById(R.id.img_back)
	ImageView img_back;
	private String url, title;

	public static void toBrowseActivity(Context activity, String title,
			String url) {
		Intent intent = new Intent(activity, GeneratedClassUtils.get(BrowseActivity.class));
		intent.putExtra(ParamsContacts.BROWSE_TITLE, title);
		intent.putExtra(ParamsContacts.BROWSE_URL, url);
		activity.startActivity(intent);
	}

	@AfterViews
	void onCreate() {

		//    	WebSettings mWebSettings = webview.getSettings();
		//    	mWebSettings.setTextZoom(75);//设置webview字体大小
		// 获取参数
		url = getIntent().getStringExtra(ParamsContacts.BROWSE_URL);
		title = getIntent().getStringExtra(ParamsContacts.BROWSE_TITLE);
		//        tv_title_name.setTextSize(size);
		tv_title_name.setText(title);
		img_back.setVisibility(View.VISIBLE);
		if (url=="http://d.alipay.com") {
			loadWeb2(url);
		}
		loadWeb(url);
		Debug.info("Browse url---->", url);
	}

	private void loadWeb2(String url2) {
		LogUtil.d("loadUrl------loadWeb2");
		webview.loadUrl(url2);
		//		webview.loadUrl(url);
		MyWebViewClient myWebViewClient = new MyWebViewClient();
		webview.setWebViewClient(myWebViewClient);
	}

	private void loadWeb(String url) {
		LogUtil.d("Browse url---->"+url);
		// ~~~ 绑定控件
		webview.setDownloadListener(new DownloadListener() {

			public void onDownloadStart(String url, String userAgent,
					String contentDisposition, String mimetype,
					long contentLength) {
				LogUtil.d("loadUrl------3");
				if (url != null && url.startsWith("http://"))
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
			}
		});
		webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
		WebSettings webSettings = webview.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
		// // 设置可以访问的文件
		// webSettings.setAllowFileAccess(true);
		// 设置支持缩放
		webSettings.setSupportZoom(true);
		webSettings.setBuiltInZoomControls(true);
		webSettings.setDomStorageEnabled(true);
		LogUtil.d("loadUrl------1"+url);

		webview.loadUrl(url);
		MyWebViewClient myWebViewClient = new MyWebViewClient();
		webview.setWebViewClient(myWebViewClient);
	}

	class MyWebViewClient extends WebViewClient {

		private HitTestResult hitTestResult;

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			LogUtil.d("loadUrl------2"+url);
			//			view.loadUrl(url);
			//			return true;
			return super.shouldOverrideUrlLoading(view, url);
		} 

	}





	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (KeyEvent.KEYCODE_BACK == keyCode && webview.canGoBack()) {
			webview.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	@Click(R.id.img_back)
	void back() {
		this.finish();
	}
	@Override
	public void onBackPressed() {
		back();
	}

}
