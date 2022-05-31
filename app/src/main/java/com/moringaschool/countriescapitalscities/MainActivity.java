package com.moringaschool.countriescapitalscities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import android.widget.AdapterView.OnItemSelectedListener;
import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity  {
    //spinner element using butterknife
    @BindView(R.id.allCountriesButton)Button getStarted;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, AllCountries.class);
                Toast.makeText(MainActivity.this, "Proudly African", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


    }


}