package edu.drake.cs188assignd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RossActivity extends Activity {
	
	private static final String TAG = "ClaytonActivity";
	
	Button buttonClay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ross);
		
		buttonClay = (Button)findViewById(R.id.button1);
		buttonClay.setOnClickListener(new OnClickListener() {
			@Override
			//Should go back to Clayton's "middle" activity.
			public void onClick(View v) {
				Log.v(TAG, "button pressed");
				Intent intent = new Intent(v.getContext(), ClaytonActivity.class);
				startActivity(intent);
			}
		});
	}


