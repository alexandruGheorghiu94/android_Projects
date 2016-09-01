package com.tonydicola.bletest.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alexi.anduino.app.R;


public class Lista_tutoriale extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tutoriale);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }



    public void peIntro(View v)
    {
        startActivity(new Intent(getApplicationContext(),Introduction.class));
    }
    public void peDigital(View v)
    {
       startActivity(new Intent(getApplicationContext(),Digital.class));
    }
    public void peAnalog(View v)
    {
        startActivity(new Intent(getApplicationContext(),Analog.class));
    }

    public void peBlink(View v)
    {

        startActivity(new Intent(getApplicationContext(),Blink.class));
    }

    public void peFade(View v)
    {
        startActivity(new Intent(getApplicationContext(),Fade.class));
    }




}
