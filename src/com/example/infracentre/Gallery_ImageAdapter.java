package com.example.infracentre;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Gallery_ImageAdapter extends BaseAdapter {
	
	Context icontext;
	
	public Gallery_ImageAdapter(Context c){
		icontext = c;
		
	}
	
	public static Integer[] mThumbsIds = {
			R.drawable.galleryimage1,
			R.drawable.galleryimage2,
			R.drawable.galleryimage3,
			R.drawable.galleryimage4,
			R.drawable.galleryimage5,
			R.drawable.galleryimage6,
			R.drawable.galleryimage7,
			R.drawable.galleryimage8,
			R.drawable.galleryimage9,
			R.drawable.galleryimage10,
			R.drawable.galleryimage11,
			R.drawable.galleryimage12,
			
	};		
	
	public int getCount() {
		// TODO Auto-generated method stub
		return mThumbsIds.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mThumbsIds[position];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		// TODO Auto-generated method stub
		ImageView imageview = new ImageView(icontext);
		imageview.setImageResource(mThumbsIds[position]);
		imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
		imageview.setLayoutParams(new GridView.LayoutParams(125, 150));
		
		return imageview;
	}

	
}
