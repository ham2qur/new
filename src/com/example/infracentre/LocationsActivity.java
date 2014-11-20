package com.example.infracentre;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockActivity;

public class LocationsActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_locations);
		
		ListView listview = (ListView) findViewById(R.id.LocationActivitylistView);
		String[] listvalues = new String[]{"INFRA DHA", "INFRA Gulshan",
				"INFRA Saddar"
				};
		listview.setAdapter( new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listvalues) 
				);
		//listview.setBackgroundColor(Color.WHITE);
		//listview.setScrollBarStyle(style.Animation);
		listview.setOnItemClickListener(new OnItemClickListener() {
			 
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
					Intent intent;
				try {
					switch(position){
					
					case 0:
						intent = new Intent(LocationsActivity.this, LocationsActivity_DHA.class);
						startActivity(intent);
						break;
						
					case 1:
						intent = new Intent(LocationsActivity.this, LocationsActivity_DHA.class);
						startActivity(intent);
						break;
						
					case 2:
						intent = new Intent(LocationsActivity.this, LocationsActivity_DHA.class);
						startActivity(intent);
						break;
					
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					AlertDialog ad = new AlertDialog.Builder(LocationsActivity.this).create();
					ad.setMessage(e.getMessage());
					ad.show();
				}
				
			
			}
			
		});
	
	}

	

}
