package com.example.android_01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.android_01.MESSAGE";
	

	/** Called when the user clicks the Send button */
	public void sendMessage1(View view) {
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText = (EditText) findViewById(R.id.edit_message1);
		String message = editText.getText().toString();
		//int letters_count = editText.getText().length();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
		// Do something in response to button
	}

	public void sendMessage2(View view) {
		Intent intent = new Intent(this, DisplayMessageActivity1.class);
		EditText editText = (EditText) findViewById(R.id.edit_message1);
		String message = "Button #2 was clicked";
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
