package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SICSRActivity extends Activity {
	private static final String TAG = "Activity LIFE CYCLE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sicsr);
        Log.i(TAG,"inside OnCreate");
    
    }

protected void onStart()
{
	super.onStart();
	Log.e(TAG,"inside onStart");
}
protected void onRestart()
{
	super.onRestart();
	Log.w(TAG,"inside onRestart");
}
protected void onResume()
{
	super.onResume();
	Log.d(TAG,"inside onResume");
}  
protected void onPause()
{
	super.onPause();
	Log.v(TAG,"inside onPause");
}  
protected void onStop()
{
	super.onStop();
	Log.i(TAG,"inside onStop");
}  
protected void onDestroy()
{
	super.onDestroy();
	Log.i(TAG,"inside onDestroy");
}  

	
}
    
    

