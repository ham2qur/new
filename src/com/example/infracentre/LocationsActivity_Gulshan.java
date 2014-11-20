package com.example.infracentre;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

public class LocationsActivity_Gulshan extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_locations_activity__gulshan);
		
		
	
		WebView wv = (WebView) findViewById(R.id.gulshanWebView);
		try{
			//wv.loadUrl("file:///android_asset/gulshan.html");
			wv.loadUrl("www.google.com.au/maps/preview/@-15.623037,18.388672,8z");
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
