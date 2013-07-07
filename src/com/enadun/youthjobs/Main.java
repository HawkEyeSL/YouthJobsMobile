package com.enadun.youthjobs;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	//When login button clicked, this will called
	public void toLoginView(View v){
		startActivity(new Intent(Main.this, Login.class));
	}
	
	//When jobs button clicked, this will called
	public void toJobsView(View v){
		startActivity(new Intent(Main.this, Jobs.class));
	}
	
	//When PTJobs button clicked, this will called
	public void toPTJobsView(View v){
		startActivity(new Intent(Main.this, PTJobs.class));		
	}

}
