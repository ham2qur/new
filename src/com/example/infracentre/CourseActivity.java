package com.example.infracentre;

import com.actionbarsherlock.app.SherlockActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class CourseActivity extends SherlockActivity {
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course);
		
		TabHost tabhost = (TabHost) findViewById(R.id.tabhost);
		tabhost.setup();
		tabhost.getTabWidget().setBackgroundColor(Color.parseColor("#000000"));
		//tabhost.getTabWidget().getFocusedChild().setBackgroundColor("#0000AA");
		
		TabSpec spec = tabhost.newTabSpec("tag1");
		spec.setContent(R.id.tab1);
		spec.setIndicator("Courses");
		tabhost.addTab(spec);
		spec = tabhost.newTabSpec("tag2");
		spec.setContent(R.id.tab2);
		spec.setIndicator("More Courses");
		tabhost.addTab(spec);
		
		GridView gridview = (GridView) findViewById(R.id.Tab1gridView1);
		gridview.setAdapter(new ImageAdapter2(this));
		gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view , int position,
					long arg3) {
				// TODO Auto-generated method stub
				
				switch(position){
				case 0:
					intent = new Intent(CourseActivity.this, CourseActivity_Adit.class);
					startActivity(intent);
					break;
				case 1:
					intent = new Intent(CourseActivity.this, CourseActivity_Advmobile.class);
					startActivity(intent);
					break;
				case 2:
					intent = new Intent(CourseActivity.this, CourseActivity_AndroidApp.class);
					startActivity(intent);
					break;
				case 3:
					intent = new Intent(CourseActivity.this, CourseActivity_3dAnimation.class);
					startActivity(intent);
					break;
				case 4:
					
					intent = new Intent(CourseActivity.this, CourseActivity_AutoCAD.class);
					startActivity(intent);
					break;
				case 5:
					intent = new Intent(CourseActivity.this, CourseActivity_cctv.class);
					startActivity(intent);
					break;
				case 6:
					intent = new Intent(CourseActivity.this, CourseActivity_ComputerRepairing.class);
					startActivity(intent);
					break;
				case 7:
					intent = new Intent(CourseActivity.this, CourseActivity_cit.class);
					startActivity(intent);
					break;
				case 8:
					intent = new Intent(CourseActivity.this, CourseActivity_ComputerizedAcounting.class);
					startActivity(intent);
					break;
				case 9:
					intent = new Intent(CourseActivity.this, CourseActivity_ecommerce.class);
					startActivity(intent);
					break;
				
				
				}
		
		
				
			}
		});
		
		GridView gridview2 = (GridView) findViewById(R.id.Tab2gridView);
		gridview2.setAdapter(new ImageAdapter3(this));
		gridview2.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long arg3) {
				switch (position) {
				case 0:
					intent = new Intent(CourseActivity.this, CourseActivity_Forex.class);
					startActivity(intent);
					break;
				case 1:
					intent = new Intent(CourseActivity.this, CourseActivity_GraphicsDesigning.class);
					startActivity(intent);
					break;
				case 2:
					intent = new Intent(CourseActivity.this, CourseActivity_LaptopRepairing.class);
					startActivity(intent);
					break;
				case 3:
					intent = new Intent(CourseActivity.this, CourseActivity_MobileRepair.class);
					startActivity(intent);
					break;
				case 4:
					intent = new Intent(CourseActivity.this, CourseActivity_MsOffice.class);
					startActivity(intent);
					break;
				case 5:
					intent = new Intent(CourseActivity.this, CourseActivity_seo.class);
					startActivity(intent);
					break;
				case 6:
					intent = new Intent(CourseActivity.this, CourseActivity_SmartPhone.class);
					startActivity(intent);
					break;
				case 7:
					intent = new Intent(CourseActivity.this, CourseActivity_StockX.class);
					startActivity(intent);
					break;
				case 8:
					intent = new Intent(CourseActivity.this, CourseActivity_UPSRepairing.class);
					startActivity(intent);
					break;
				case 9:
					intent = new Intent(CourseActivity.this, CourseActivity_webdevelop.class);
					startActivity(intent);
					break;
				case 10:
					intent = new Intent(CourseActivity.this, CourseActivity_wordpress.class);
					startActivity(intent);
					break;
				
				default:
					break;
				}	
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		getSherlock().getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
