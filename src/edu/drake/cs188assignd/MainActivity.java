package edu.drake.cs188assignd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button buttonClayton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		buttonClayton = (Button)findViewById(R.id.button1);
		buttonClayton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), ClaytonActivity.class);
				startActivity(intent);
			}
		});
	
	}

}
