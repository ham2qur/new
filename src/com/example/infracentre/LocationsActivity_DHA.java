package com.example.infracentre;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

public class LocationsActivity_DHA extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_locations_activity__dh);
		
		 
		
		WebView wv = (WebView) findViewById(R.id.defenceWebview);
		try{
			wv.loadUrl("file:///android_asset/defence.html");
			}catch(Exception ex){
				ex.printStackTrace();
			}
			wv.getSettings().getJavaScriptEnabled();
			wv.getSettings().setLoadWithOverviewMode(true);
			wv.getSettings().setBuiltInZoomControls(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
