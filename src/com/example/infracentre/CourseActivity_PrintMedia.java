package com.example.infracentre;

import android.os.Bundle;
import android.view.Menu;

import com.actionbarsherlock.app.SherlockActivity;

public class CourseActivity_PrintMedia extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course_activity__print_media);
	}

	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getSherlock().getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
