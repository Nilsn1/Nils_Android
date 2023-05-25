package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView lifeCycle, radioButton, cardView, tableLayout, animations, dialog, customDialog, listview,
            notification, bundlePassing, tabLayout, navigation, bottomNavigationView, clipBoard,
            sharedPreferences, notesapp, calculatorApp, demoActivity, fireBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifeCycle = findViewById(R.id.lifeCycle);
        radioButton = findViewById(R.id.radioButton);
        cardView = findViewById(R.id.cardview);
        tableLayout = findViewById(R.id.tableLayout);
        animations = findViewById(R.id.animations);
        dialog = findViewById(R.id.dialog);
        customDialog = findViewById(R.id.customDialog);
        listview = findViewById(R.id.listview);
        notification = findViewById(R.id.notification);
        tabLayout = findViewById(R.id.tablayout);
        navigation = findViewById(R.id.navigation);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        clipBoard = findViewById(R.id.clipboard);
        bundlePassing = findViewById(R.id.bundlepassing);
        sharedPreferences = findViewById(R.id.sharedpreferences);
        notesapp = findViewById(R.id.notesapp);
        calculatorApp = findViewById(R.id.calculatorapp);
        demoActivity = findViewById(R.id.demoactivity);
        fireBase = findViewById(R.id.fireBase);


        lifeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, LifeCycleActivity.class);
                startActivity(intent);

            }
        });

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                startActivity(intent);

            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CardviewActivity.class);
                startActivity(intent);

            }
        });

        tableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(intent);

            }
        });

        animations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AnimationsActivity.class);
                startActivity(intent);

            }
        });

        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);

            }
        });

        customDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CustomDialogActivity.class);
                startActivity(intent);

            }
        });

        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ListviewActivity.class);
                startActivity(intent);

            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(intent);

            }
        });

        tabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TablayoutActivity.class);
                startActivity(intent);
            }
        });

        navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, NavigationActivity.class);
                startActivity(intent);

            }
        });

        bottomNavigationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, BottomNavigationActivity.class);
                startActivity(intent);

            }
        });

        clipBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ClipboardActivity.class);
                startActivity(intent);
            }
        });

        bundlePassing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ActivitytoFragment.class);
                startActivity(intent);

            }
        });

        sharedPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SharedpreferencesActivity.class);
                startActivity(intent);
            }
        });

        notesapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intent);
            }
        });

        calculatorApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });

        demoActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DemoActivity.class);
                startActivity(intent);
            }
        });

        fireBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity(FirebaseActivity.class);
            }
        });

    }

    private void changeActivity(Class<?> activity) {
        Intent intent = new Intent(MainActivity.this, activity);
        startActivity(intent);
    }
}