package com.demo.jamesandroidactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private Button singletop , hello;
	private String TAG = getClass().getCanonicalName() ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(TAG, "onCreate()") ;
		intiViews() ;
		bindListener() ;
	}
	
	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		Log.d(TAG, "onNewIntent()") ;
	}
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, " onRestart()") ;
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "onStart()") ;
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "onResume()") ;
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d(TAG, "onSaveInstanceState()") ;
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, " onPause()") ;
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "onStop()") ;

	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy()") ;

	}

	
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.d(TAG, "onRestoreInstanceState()") ;
	}
	
	private void intiViews() {
		singletop = (Button) findViewById(R.id.btn1) ;
		hello =  (Button) findViewById(R.id.btn2) ;
	}
	private void bindListener() {
		singletop.setOnClickListener(this) ;
		hello.setOnClickListener(this) ;
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn1:
			Intent intent1 = new Intent(this, DemoActivity.class) ;
			intent1.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP) ;
			startActivity(intent1) ;
			break;
		case R.id.btn2:
			Intent intent2 = new Intent(this, DemoActivity.class) ;
			startActivity(intent2) ;
		default:
			break;
		}
	}

}
