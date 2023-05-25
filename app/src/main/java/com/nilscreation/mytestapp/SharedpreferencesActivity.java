package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SharedpreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedpreferences);
        EditText name, place, rollno;
        Button submit, loaddata;

        name = findViewById(R.id.name);
        place = findViewById(R.id.place);
        rollno = findViewById(R.id.rollno);
        submit = findViewById(R.id.submit);
        loaddata = findViewById(R.id.loaddata);

        loaddata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("mypref", MODE_PRIVATE);
                String n1 = pref.getString("name", "");
                String n2 = pref.getString("place", "");
                int a = pref.getInt("rollno", 0);

                name.setText(n1);
                place.setText(n2);
                rollno.setText(String.valueOf(a));

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (name.getText().toString().equals("") || place.getText().toString().equals("") || rollno.getText().toString().equals("")) {

                    Toast.makeText(SharedpreferencesActivity.this, "Fields Required", Toast.LENGTH_SHORT).show();

                } else {

                    String mname = name.getText().toString();
                    String mplace = place.getText().toString();
                    String mrollno = rollno.getText().toString();
                    int finalroll = Integer.parseInt(mrollno);

                    SharedPreferences pref = getSharedPreferences("mypref", MODE_PRIVATE);
                    SharedPreferences.Editor myEdit = pref.edit();

                    myEdit.putString("name", mname);
                    myEdit.putString("place", mplace);
                    myEdit.putInt("rollno", finalroll);
                    myEdit.apply();
                }
            }
        });
    }
}