package com.example.infracentre;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

public class LocationsActivity_Saddar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_locations_activity__saddar);
	
		WebView wv = (WebView) findViewById(R.id.saddarWebview);
		try{
			wv.loadUrl("file:///android_asset/saddar.html");
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
