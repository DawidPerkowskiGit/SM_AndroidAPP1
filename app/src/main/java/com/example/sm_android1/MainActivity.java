package com.example.sm_android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public static String lifeCycleLogs = "";

    public static String getLifeCycleLogs() {
        return lifeCycleLogs;
    }

    public static void setLifeCycleLogs(String input) {
        lifeCycleLogs += input;
    }

    public static Date timeNow() {
        return Calendar.getInstance().getTime();
    }



    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayPersonInput.class);
        EditText editName = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText editSurname = (EditText) findViewById(R.id.editTextTextPersonSurname);
        EditText editDate = (EditText) findViewById(R.id.editTextDate);
        EditText editInfo = (EditText) findViewById(R.id.editTextTextPersonOpis);
        Switch editSwitch = (Switch) findViewById(R.id.switch2);

        intent.putExtra("lifeCycleLogs" , this.lifeCycleLogs);
        intent.putExtra("editName", editName.getText().toString());
        intent.putExtra("editSurname", editSurname.getText().toString());
        intent.putExtra("editDate", editDate.getText().toString());
        intent.putExtra("editInfo", editInfo.getText().toString());
        if (editSwitch.isChecked()) {
            intent.putExtra("editSwitch", "Przypomnij : TAK");
        }
        else {
            intent.putExtra("editSwitch", "Przypomnij : NIE");
        }

        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setLifeCycleLogs(timeNow().toString()  + " : Screen1.onCreate\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        setLifeCycleLogs(timeNow().toString()  + " : Screen1.onPause\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setLifeCycleLogs(timeNow().toString()  + " : Screen1.onStop\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        setLifeCycleLogs(timeNow().toString()  + " : Screen1.onStart\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        setLifeCycleLogs(timeNow().toString()  + " : Screen1.onResume\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setLifeCycleLogs(timeNow().toString()  + " : Screen1.onDestroy\n");
    }
}