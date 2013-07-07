package com.enadun.youthjobs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
	}
	
	//When register text clicked, this will called
	public void toRegisterView(View v){
		startActivity(new Intent(Login.this, Register.class));
	}
}
