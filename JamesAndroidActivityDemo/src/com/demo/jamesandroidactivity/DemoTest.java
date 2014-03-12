package com.demo.jamesandroidactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class DemoTest extends Activity{

	private String TAG = getClass().getCanonicalName() ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(TAG, "onCreate()") ;
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

}
