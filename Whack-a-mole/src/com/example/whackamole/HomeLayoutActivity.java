package com.example.whackamole;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class HomeLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_layout, menu);
		return true;
	}
	
	public void fereastraTutorial (View v) //clasa care face trasferul
	{
		Intent i = new Intent(HomeLayoutActivity.this,TutorialActivityLayout.class);
		startActivity(i);
	}
	
	public void fereastraPlay (View v) //clasa care face trasferul
	{
		Intent i = new Intent(HomeLayoutActivity.this,PlayLayoutActivity.class);
		startActivity(i);
	}
	
	public void fereastraHightscore (View v) //clasa care face trasferul
	{
		Intent sistem = new Intent(HomeLayoutActivity.this,HightscoreLayoutActivity.class);
		startActivity(sistem);
	}
	
	public void fereastraCredit (View v) //clasa care face trasferul
	{
		Intent i = new Intent(HomeLayoutActivity.this,CreditLayoutActivity.class);
		startActivity(i);
	}

}
