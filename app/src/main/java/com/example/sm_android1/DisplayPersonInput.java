package com.example.sm_android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class DisplayPersonInput extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // Get the Intent that started this activity and extract the string
        Intent intentScreen1 = getIntent();

        MainActivity.setLifeCycleLogs(timeNow().toString()  + " : Screen2.onCreate\n");

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);

        String editName = intentScreen1.getStringExtra("editName");
        String editSurname = intentScreen1.getStringExtra("editSurname");
        String editDate = intentScreen1.getStringExtra("editDate");
        String editSwitch = intentScreen1.getStringExtra("editSwitch");
        String editInfo = intentScreen1.getStringExtra("editInfo");


        //textView.setText(EXTRA_MESSAGE + " " +message);
        textView.setText(editName + "\n");
        textView.append(editSurname + "\n");
        textView.append(editDate + "\n");
        textView.append(editSwitch + "\n");
        textView.append(editInfo + "\n");
    }

    public void viewCykleZycia(View view) {

        Intent intentCykleZycia = new Intent(this, CykleZycia.class);
        //intentCykleZycia.putExtra("lifeCycleLogs" ,MainActivity.getLifeCycleLogs());
        startActivity(intentCykleZycia);

    }

    @Override
    public void onPause() {
        super.onPause();
        MainActivity.setLifeCycleLogs(timeNow().toString()  + " : Screen2.onPause\n");
    }

    public static Date timeNow() {
        return Calendar.getInstance().getTime();
    }
}