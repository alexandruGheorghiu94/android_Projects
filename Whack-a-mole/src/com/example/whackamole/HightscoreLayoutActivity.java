package com.example.whackamole;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;


import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HightscoreLayoutActivity extends ListActivity {
	
	ListView lista;
	String valoare;
	TextView scorCurent;
	
	static final String STATE_SCORE = "playerScore";
	public static final String PREFS_NAME = "MyPrefsFile";
	static ArrayList<String> castigatori = new ArrayList<String>();
	ArrayAdapter<String> adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hightscore_layout);
		
		scorCurent = (TextView) findViewById(R.id.textViewScor);
 
		// Restore preferences
	     SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
	     String string_castigatori = settings.getString("string", null);
	     if(string_castigatori != null && !string_castigatori.equals(""))
	     {
	    	System.out.println("String:" + string_castigatori);
	     	parseString(string_castigatori);
	     }
 
		 adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, castigatori);
 
		//Primire date din activitatea precedenta
		Bundle b = new Bundle();
		b = getIntent().getExtras();
		if(b!=null)
		{
		Integer score = b.getInt("scor");
		castigatori.add(score.toString());
		scorCurent.setText("Your score:"+score);
		scorCurent.setTextColor(Color.YELLOW);
		}
 
	
		//String castigator = score.toString();
		//castigatori.add(castigator);
 
		setListAdapter(adapter);
 
	}
 
	@Override
	    protected void onStop(){
	       super.onStop();
 
	       String string_castigatori = createString();
 
	      // We need an Editor object to make preference changes.
	      // All objects are from android.context.Context
	      SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
	      SharedPreferences.Editor editor = settings.edit();
	      editor.putString("string", string_castigatori);
 
	      // Commit the edits!
	      editor.commit();
	    }
 
	private String createString() {
		// TODO Auto-generated method stub
		String string_castigatori = "";
		ArrayList<String> castig = new ArrayList<String>();
		for(int i = 0; i<castigatori.size();i++)
			castig.add(castigatori.get(i));
		while(!castig.isEmpty())
		{
			string_castigatori += castig.get(0);
			string_castigatori += "/";
			castig.remove(0);
 
		}
		return string_castigatori;
	}
 
	 private void parseString(String string_castigatori) {
		// TODO Auto-generated method stub
		 castigatori.clear();
		String[] elemente = string_castigatori.split("/");
		for(int i = 0; i < elemente.length; i++)
		{
			System.out.println("element:" + elemente[i]);
			castigatori.add(elemente[i]);
		}
	}

	
	public void fereastraPlay (View v) //metoda care o linkuim la butonul care ne duce in fereastra cu activitate
	{
		Intent i = new Intent(HightscoreLayoutActivity.this,PlayLayoutActivity.class);
		startActivity(i);
	}
	
	public void fereastraHome (View v) //metoda care o linkuim la butonul care ne duce in fereastra cu activitate
	{
		Intent i = new Intent(HightscoreLayoutActivity.this,HomeLayoutActivity.class);
		startActivity(i);
	}
	
	public void stergeLista (View v)
	{
		castigatori.clear();
		adapter.notifyDataSetChanged();
	}
	
	
	
	
}
	
		
	
	
		
	
	
