package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class SnackBarActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);

        constraintLayout = findViewById(R.id.constraint_layout);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(constraintLayout, "This is simple Snackbar", Snackbar.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                constraintLayout.setBackgroundColor(getResources().getColor(R.color.card_background2));

                Snackbar.make(constraintLayout, "Background Color Changed", Snackbar.LENGTH_INDEFINITE).setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                constraintLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.primary))
                        .setTextColor(Color.parseColor("#FFFFFF"))
                        .show();

            }
        });
    }
}