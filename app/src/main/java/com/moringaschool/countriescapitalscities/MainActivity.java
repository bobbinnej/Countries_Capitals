package com.moringaschool.countriescapitalscities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import android.widget.AdapterView.OnItemSelectedListener;
import butterknife.BindView;


public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {
    //spinner element using butterknife
//    @BindView(R.id.searchSpinner) Spinner searchSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String message=parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}