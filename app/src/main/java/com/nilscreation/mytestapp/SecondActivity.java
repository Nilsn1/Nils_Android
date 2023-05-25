package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView name, place, rollno;

        name = findViewById(R.id.Name);
        place = findViewById(R.id.Place);
        rollno = findViewById(R.id.Rollno);

        Intent getData = getIntent();
        String Name = getData.getStringExtra("Name");
        String Place = getData.getStringExtra("Place");
        int Rollno = getData.getIntExtra("Roll no",0);

        name.setText("Name: " + Name);
        place.setText("Place: " + Place);
        rollno.setText("Roll no: " + Rollno);
    }
}