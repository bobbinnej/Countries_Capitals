package com.moringaschool.countriescapitalscities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // this intent will take as to the homepage immediately the spalshscreen is done loading
                Intent i = new Intent(Splashscreen.this,MainActivity.class);
                startActivity(i);
                //close the activity
                finish();
            }
        },3000);

    }
}