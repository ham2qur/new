package com.example.infracentre;

import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

import com.actionbarsherlock.app.SherlockActivity;

public class CourseActivity_wordpress extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course_activity_wordpress);
		
		WebView wv = (WebView) findViewById(R.id.WordPressWebView);
		try{
			wv.loadUrl("file:///android_asset/wordpress.html");
			}catch(Exception ex){
				ex.printStackTrace();
			}
		wv.getSettings().getJavaScriptEnabled();
		wv.getSettings().setBuiltInZoomControls(true);
		wv.getSettings().setLoadWithOverviewMode(true);
		//wv.getSettings().setTextZoom(125);
		wv.getSettings().setUseWideViewPort(true);
	}

	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getSherlock().getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
