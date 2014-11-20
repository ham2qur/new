package com.example.infracentre;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.SubMenu;

public class MainActivity extends SherlockActivity {

	Intent intent;
	private ProgressDialog pd;
	private Context context;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        context = this;
        GridView gridview = (GridView)findViewById(R.id.gridView1);
        gridview.setAdapter(new ImageAdapter(this));
        gridview.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	            switch(position){
	            case 0:
		            Intent intent = new Intent(MainActivity.this, CourseActivity.class);
		            startActivity(intent);
		            break;
		            
	            case 1:
		            Intent intent0 = new Intent(MainActivity.this, LocationsActivity.class);
		            startActivity(intent0);
		            break;
		            
	            case 2:
	            	Intent intent1 = new Intent(MainActivity.this, GalleryActivity.class);
					startActivity(intent1);
					break;
		            
	            case 3:
	            	Intent intent2 = new Intent(MainActivity.this, WhyInfraActivity.class);
		            startActivity(intent2);
		            break;
		            
	            case 4:
	            	Intent intent3 = new Intent(MainActivity.this, ContactUsActivity.class);
		            startActivity(intent3);
		            break;
		            
	            case 5:
	            	Intent intent4 = new Intent(MainActivity.this, AboutUsActivity.class);
		            startActivity(intent4);
		            break;
		        
	            }
	        }
        }
	  );
    }

	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
	
		 SubMenu sub = menu.addSubMenu("More");
		 sub.getItem().setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		 sub.getItem().setIcon(android.R.drawable.ic_menu_more);
		 

		getSherlock().getMenuInflater().inflate(R.menu.menu, sub);
		return super.onCreateOptionsMenu(menu);
	}

	
	
	
	@Override
	public boolean onMenuItemSelected(int featureId,com.actionbarsherlock.view.MenuItem item) {
		Dialog d;
		
		
		switch (item.getItemId()) {
		case R.id.MenuApplyNow:
			
			//d = new Dialog(MainActivity.this);
			//d.setContentView(R.layout.applynow);
			
			LayoutInflater inflater = LayoutInflater.from(this);
			View promptview  = inflater.inflate(R.layout.applynow, null);
			
			final EditText Applytext1 = (EditText) findViewById(R.id.ApplynowNameText);
			EditText Applytext2 = (EditText) findViewById(R.id.ApplynowNameText);
			
			
			AlertDialog.Builder builder = new Builder(MainActivity.this);
			builder.setView(promptview);
			builder.setCancelable(false);
			
			
			builder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
				
				@Override
				
				public void onClick(DialogInterface view, int arg1) {
					
					AsyncTask<Void, Void, Void> task = new AsyncTask<Void, Void, Void>() {
						
						@Override
						protected void onPreExecute() {
							pd = new ProgressDialog(context);
							pd.setTitle("Processing...");
							pd.setMessage("Sending Text.");
							pd.setCancelable(false);
							pd.setIndeterminate(true);
							pd.show();
						}
							
						@Override
						protected Void doInBackground(Void... arg0) {
							try {
								SmsManager sm = SmsManager.getDefault();
								sm.sendTextMessage("03132905165", null, "Text" , null, null);
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							return null;
						}
						
						@Override
						protected void onPostExecute(Void result) {
							if (pd!=null) {
								pd.dismiss();
								//b.setEnabled(true);
							}
						}
							
					};
					task.execute((Void[])null);
					
						
					
				}
			});
			
			builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface view, int arg1) {
					view.cancel();
				}
			});
			
			AlertDialog alert = builder.create();
			alert.show();
			/*
			d.setTitle("INFRA PROFESSIONAL INSTITUTE");
			d.setCancelable(true);
			d.show();
			
			Button b  = (Button) findViewById(R.id.applynowSendBTN);
			b.setOnClickListener(new OnClickListener() {
					
					
				@Override
				public void onClick(View arg0) {
					
					
						
					}
				});
			*/
			break;
			
		case R.id.MenuShare:
			intent = new Intent(Intent.ACTION_SEND);
			intent.setType("text/*");
			intent.putExtra(Intent.EXTRA_TEXT, "It is a fantastic for students. Download it from " +
					"market://details?id=com.cubeactive.qnotelistfree");
			startActivity(Intent.createChooser(intent, "Share Using"));
			break;
			
		case R.id.Menulike:
			
			try{
				intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("https://m.facebook.com/ham2qur"));
				startActivity(intent);
			}catch(ExceptionInInitializerError ex){
				Toast.makeText(MainActivity.this, "Could not open Android market, please install the market app.", Toast.LENGTH_SHORT).show();
			}
			break;
		
		case R.id.Menurate:
			
			try{
				intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("market://details?id=com.cubeactive.qnotelistfree"));
				startActivity(intent);
			}catch(Exception e){
				try{
				intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.cubeactive.qnotelistfree"));
				}catch(ExceptionInInitializerError ex){
				Toast.makeText(MainActivity.this, "Could not open Android market, please install the market app.", Toast.LENGTH_SHORT).show();
				}
			}
		
			
			break;
		case R.id.MenuHelp:
			d = new Dialog(MainActivity.this);
			d.setContentView(R.layout.activity_why_infra);
			d.setTitle("INFRA PROFESSIONAL INSTITUTE");
			d.setCancelable(true);
			d.show();
			break;
			
		case R.id.MenuAbout:
			d = new Dialog(MainActivity.this);
			d.setContentView(R.layout.activity_about_us);
			d.setTitle("Help.");
			d.setCancelable(true);
			d.show();
			break;
		}
		
		return super.onMenuItemSelected(featureId, item);
	}

	
	 
    
    
    
}
