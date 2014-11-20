package com.example.infracentre;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter3 extends BaseAdapter{
	
	Context context;
	
	public ImageAdapter3(Context c){
		context = c;
		
	}

	private Integer[] mThumbsIds={
		R.drawable.forex,
		R.drawable.graphics,
		R.drawable.laptop,
		R.drawable.mobilerepairing,
		R.drawable.office, 
		R.drawable.seo, 
		R.drawable.smartphone,
		R.drawable.stock, 
		R.drawable.ups, 
		R.drawable.webdev,
		R.drawable.wordpress
	};
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		ImageView imageview;
		if(convertView == null){
		imageview = new ImageView(context);
		imageview.setLayoutParams(new GridView.LayoutParams(110, 110));
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
