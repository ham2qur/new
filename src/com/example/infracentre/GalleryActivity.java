package com.example.infracentre;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.actionbarsherlock.app.SherlockActivity;

public class GalleryActivity extends SherlockActivity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gallery);
		
		GridView gridview = (GridView) findViewById(R.id.grid_view);
		
		gridview.setAdapter(new Gallery_ImageAdapter(GalleryActivity.this));
		
		gridview.setOnItemClickListener(new OnItemClickListener() {

			
			@Override
			public void onItemClick(AdapterView<?> parent, View v, int position,
					long id) {
				
				Intent i = new Intent(getApplicationContext(),FullImageActivity.class);
				i.putExtra("id", position);
				
				if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN) {
					Bundle b = null;
					Bitmap bitmap = Bitmap.createBitmap(v.getWidth(), v.getHeight(),Bitmap.Config.ARGB_4444);
					//bitmap.eraseColor(position);
					//b= ActivityOptions.makeScaleUpAnimation(v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
					b= ActivityOptions.makeThumbnailScaleUpAnimation(v, bitmap, 0, 0).toBundle();
					startActivity(i, b);
				}else{
					
					startActivity(i);
				}
			}
			
		});
	}

	

}
