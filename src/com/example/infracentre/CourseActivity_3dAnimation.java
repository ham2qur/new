package com.example.infracentre;

import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings.ZoomDensity;
import android.webkit.WebView;

import com.actionbarsherlock.app.SherlockActivity;

public class CourseActivity_3dAnimation extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course_activity_3d_animation);
	
		WebView webView = (WebView) findViewById(R.id.webview);
		try{
		webView.loadUrl("file:///android_asset/animation.html");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		webView.getSettings().getJavaScriptEnabled();
		webView.getSettings().setBuiltInZoomControls(true);
		webView.getSettings().setDefaultZoom(ZoomDensity.MEDIUM);
		webView.getSettings().setLoadWithOverviewMode(true);
		webView.getSettings().setUseWideViewPort(true);
	}

	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
		getSherlock().getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
