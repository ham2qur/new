package com.example.infracentre;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	private Bitmap bmp  ;
	
	public ImageAdapter(Context c) {
        mContext = c;
    }

	@Override
	public int getCount() {
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int arg0) {
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public int getItemViewType(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(110,110));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
          
        } else {
            imageView = (ImageView) convertView;
        }
       
        imageView.setImageResource(mThumbIds[position]);
        
        return imageView;
    }

    private Integer[] mThumbIds = {
            R.drawable.coursescopy, 
            R.drawable.locationcopy,
            R.drawable.videogallerycopy, 
            R.drawable.aboutuscopy,
            R.drawable.contactuscopy, 
            R.drawable.helpcopy,
            
      };
	}


