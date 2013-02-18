package edu.drake.cs188assignd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ClaytonActivity extends Activity {

private static final String TAG = "MainActivity";
	
	Button buttonAdam;
	Button buttonRoss;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clayton);
		
		buttonAdam = (Button)findViewById(R.id.button1);
		buttonAdam.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.v(TAG, "button pressed");
				Intent intent = new Intent(v.getContext(), MainActivity.class);
				startActivity(intent);
			}
		});
		
		//change this button when Ross uploads his Activity
		buttonRoss = (Button)findViewById(R.id.button2);
		buttonRoss.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.v(TAG, "third pressed");
				//change MainActivity to Ross's Activity
				Intent intent = new Intent(v.getContext(), MainActivity.class);
				startActivity(intent);
			}
		});
	}

}
