package com.moringaschool.countriescapitalscities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // we will be taken to them main activity after the splashscreen loads
                Intent intent=new Intent(Splashscreen.this, MainActivity.class);
                // start activity
                startActivity(intent);
                //close the activity
                finish();


            }
        },5000);






    }
}