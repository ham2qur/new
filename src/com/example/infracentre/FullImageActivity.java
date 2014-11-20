package com.example.infracentre;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockActivity;

public class FullImageActivity extends SherlockActivity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.full_image);
		
		
		
		
		Intent i = getIntent();
		
	    int position = i.getExtras().getInt("id");
        //ImageAdapter imageAdapter = new ImageAdapter(this);
 
        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(Gallery_ImageAdapter.mThumbsIds[position]);
	}
	
}
