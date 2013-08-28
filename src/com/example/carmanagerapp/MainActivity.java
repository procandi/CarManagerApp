package com.example.carmanagerapp;

//載入模組
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;


public class MainActivity extends Activity {
	//app啟動時會執行的function
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		//開啟校園僺車場管理系統的伺服器網址
		Intent intent = new Intent(Intent.ACTION_VIEW);  
		intent.setData(Uri.parse("http://49.158.27.131:4567/"));  
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
