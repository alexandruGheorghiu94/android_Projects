package com.example.whackamole;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayLayoutActivity extends Activity {
	
	ImageView i;
	ImageView i2;
	ImageView i3;
	ImageView i4;
	ImageView i5;
	ImageView i6;
	ImageView i7;
	ImageView i8;
	ImageView i9;
	ImageView i10;
	ImageView i11;
	
	TextView timpRamas;
	TextView punctajScor;
	
	int score;
	
	Intent sistem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play_layout);
		
		final MediaPlayer melodie= MediaPlayer.create(this, R.raw.tf2ts);
		
		melodie.start();
		
		i=  (ImageView)findViewById(R.id.imageView1);
		i2= (ImageView)findViewById(R.id.imageView2);
		i3= (ImageView)findViewById(R.id.imageView3);
		i4= (ImageView)findViewById(R.id.imageView4);
		i5= (ImageView)findViewById(R.id.imageView5);
		i6= (ImageView)findViewById(R.id.imageView6);
		i7= (ImageView)findViewById(R.id.imageView7);
		i8= (ImageView)findViewById(R.id.imageView8);
		i9= (ImageView)findViewById(R.id.imageView9);
		i10=(ImageView)findViewById(R.id.imageView10);
		
		timpRamas = (TextView)findViewById(R.id.textView1);
		punctajScor = (TextView)findViewById(R.id.textView2);
		

	
	new CountDownTimer(30000, 1000) //primul parametru e cel de la care pleaca si al doilea este viteza de descrestere
	 {
		
		

	     public void onTick(long millisUntilFinished) 
			 {
	    	   
	    	 timpRamas.setText(""+millisUntilFinished / 1000); //afiseaza timpul ramas
	    	 punctajScor.setText(""+ score); 		//afiseaza scorul curent
	    	 
	    	 	
	    	 		if(millisUntilFinished <= 30000 && millisUntilFinished >= 27000){
	    	 			
	    	 			 i.setImageResource(R.drawable.cartita3);
	    	 			 i2.setImageResource(R.drawable.cartita3);
	    	 		}
	    	 		
	    	 		if(millisUntilFinished <= 27000 && millisUntilFinished >= 24000){
	    	 			
	    	 			 i3.setImageResource(R.drawable.cartita3);
	    	 			 i4.setImageResource(R.drawable.cartita3);
	    	 		}
	    	 		
	    	 		if(millisUntilFinished <= 24000 && millisUntilFinished >= 21000){
	    	 			
	    	 			 i5.setImageResource(R.drawable.cartita3);
	    	 			 i6.setImageResource(R.drawable.cartita3);
	    	 		}
	    	 		
	    	 		if(millisUntilFinished <= 21000 && millisUntilFinished >= 18000){
	    	 			
	    	 			 i7.setImageResource(R.drawable.cartita3);
	    	 			 i8.setImageResource(R.drawable.cartita3);
	    	 		}
	    	 		
	    	 		if(millisUntilFinished <= 18000 && millisUntilFinished >= 15000){
	    	 			
	    	 			 i9.setImageResource(R.drawable.cartita3);
	    	 			 i10.setImageResource(R.drawable.cartita3);
	    	 		}
	    	 		
	    	 		if(millisUntilFinished <= 15000 && millisUntilFinished >= 12000){
	    	 			
	    	 			 i10.setImageResource(R.drawable.cartita3);
	    	 			 i.setImageResource(R.drawable.cartita3);
	    	 		}
	    	 		
	    	 		if(millisUntilFinished <= 12000 && millisUntilFinished >= 9000){
	    	 			
	    	 			 i3.setImageResource(R.drawable.cartita3);
	    	 			 i4.setImageResource(R.drawable.cartita3);
	    	 		}
	    	 		
	    	 		if(millisUntilFinished <= 9000 && millisUntilFinished >= 6000){
	    	 			
	    	 			 i5.setImageResource(R.drawable.cartita3);
	    	 			 i.setImageResource(R.drawable.cartita3);
	    	 		}
	    	 		
	    	 		if(millisUntilFinished <= 6000 && millisUntilFinished >= 3000){
	    	 			
	    	 			 i9.setImageResource(R.drawable.cartita3);
	    	 			 i3.setImageResource(R.drawable.cartita3);
	    	 		}
	    	 		
	    	 		if(millisUntilFinished <= 3000 && millisUntilFinished >= 1000){
	    	 			
	    	 			timpRamas.setTextColor(Color.RED);
	    	 		
	    	 			 
	    	 			 i7.setImageResource(R.drawable.cartita3);
	    	 		}
	    	 	
	    	 	
	    	 		
	    	 		
			 }
		  public void onFinish() 
				 {
			  		  timpRamas.setText("0");
		    	 	 
					   i.setVisibility(View.VISIBLE);   //view.invisible sau view.gone
					  i2.setVisibility(View.VISIBLE);
					  i3.setVisibility(View.VISIBLE);
					  i4.setVisibility(View.VISIBLE);
					  i5.setVisibility(View.VISIBLE);
					  i6.setVisibility(View.VISIBLE);
					  i7.setVisibility(View.VISIBLE);
					  i8.setVisibility(View.VISIBLE);
					  i9.setVisibility(View.VISIBLE);
					 i10.setVisibility(View.VISIBLE);
					 
					 sistem = new Intent(PlayLayoutActivity.this, HightscoreLayoutActivity.class);	//portam scorul de la play layout la hightscore layout
					 sistem.putExtra("scor", score);
					 startActivity(sistem);
					 melodie.stop();
					 
					
					
					
				 }
	  }.start();
	  
	
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_layout, menu);
		return true;
	}
	
	public void imageOnClick   (View v) { score = score + 1 ; i.setImageResource(0);}
	public void imageOnClick2  (View v) { score = score + 1 ; i2.setImageResource(0);}
	public void imageOnClick3  (View v) { score = score + 1 ; i3.setImageResource(0);}
	public void imageOnClick4  (View v) { score = score + 1 ; i4.setImageResource(0);}
	public void imageOnClick5  (View v) { score = score + 1 ; i5.setImageResource(0);}
	public void imageOnClick6  (View v) { score = score + 1 ; i6.setImageResource(0);}
	public void imageOnClick7  (View v) { score = score + 1 ; i7.setImageResource(0);}
	public void imageOnClick8  (View v) { score = score + 1 ; i8.setImageResource(0);}
	public void imageOnClick9  (View v) { score = score + 1 ; i9.setImageResource(0);}
	public void imageOnClick10 (View v) { score = score + 1 ; i10.setImageResource(0);}
	
	
	
	
	

}

