package com.example.sm_android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class CykleZycia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cykle_zycia);


        Intent intentScreen2 = getIntent();
        MainActivity.setLifeCycleLogs(timeNow().toString()  + " : Screen3.onCreate\n");


        TextView textViewCykleZycia = findViewById(R.id.textViewCykleZycia);
        textViewCykleZycia.setText(MainActivity.getLifeCycleLogs());
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.setLifeCycleLogs(timeNow().toString()  + " : Screen3.onPause\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        MainActivity.setLifeCycleLogs(timeNow().toString()  + " : Screen3.onStop\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        MainActivity.setLifeCycleLogs(timeNow().toString()  + " : Screen3.onStart\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainActivity.setLifeCycleLogs(timeNow().toString()  + " : Screen3.onResume\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MainActivity.setLifeCycleLogs(timeNow().toString()  + " : Screen3.onDestroy\n");
    }

    public static Date timeNow() {
        return Calendar.getInstance().getTime();
    }
}