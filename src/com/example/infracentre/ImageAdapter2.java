package com.example.infracentre;

import android.R.layout;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter2 extends BaseAdapter{
	
	Context context;
	
	public ImageAdapter2(Context c){
		context = c;
		
	}

	private Integer[] mThumbsIds={
		R.drawable.adit, 
		R.drawable.advancemobile,
		R.drawable.androidapps,
		R.drawable.animation,
		R.drawable.autocad,
		R.drawable.cctv,
		R.drawable.chn,
		R.drawable.cit,
		R.drawable.computerized, 
		R.drawable.ecommerce,
		
	};
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		ImageView imageview;
		if(convertView == null){
		imageview = new ImageView(context);
		imageview.setLayoutParams(new GridView.LayoutParams(120,120));
		imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
		
		imageview.setPadding(8, 8, 8, 8);
		}else{
		imageview = (ImageView) convertView;
		}
		
		imageview.setImageResource(mThumbsIds[position]);
		
		return imageview;
	}
	
	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
	
		return mThumbsIds.length;
	}

}
