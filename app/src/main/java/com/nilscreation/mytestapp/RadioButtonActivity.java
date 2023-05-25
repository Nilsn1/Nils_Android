package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioButtonActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton btnOrange, btnBlue, btnGreen, btnRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        ConstraintLayout constraintLayout = findViewById(R.id.constraint_Layout);
        radioGroup = findViewById(R.id.radioGroup);

        btnOrange = findViewById(R.id.btnOrange);
        btnBlue = findViewById(R.id.btnBlue);
        btnGreen = findViewById(R.id.btnGreen);
        btnRed = findViewById(R.id.btnRed);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.btnOrange:
                        constraintLayout.setBackgroundColor(ContextCompat.getColor(RadioButtonActivity.this,R.color.orange));
                        break;

                    case R.id.btnBlue:
                        constraintLayout.setBackgroundColor(ContextCompat.getColor(RadioButtonActivity.this,R.color.primary));
                        break;

                    case R.id.btnGreen:
                        constraintLayout.setBackgroundColor(ContextCompat.getColor(RadioButtonActivity.this,R.color.green));
                        break;

                    case R.id.btnRed:
                        constraintLayout.setBackgroundColor(ContextCompat.getColor(RadioButtonActivity.this,R.color.red));

                }
            }
        });
    }
}