package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView lifeCycle, onBoarding, snackBar, radioButton, spinner, autoCompleteTextView, tableLayout, animations, dialog,
            customDialog, listview, recyclerView, notification, bundlePassing, tabLayout, optionMenu, customToolbar,
            navigation, bottomNavigationView, clipBoard, sharedPreferences, notesapp, calculator, bmiCalculator, emiCalculator, demoActivity,
            retrofitLibrary, firebaseRealtime, firebaseAuthentication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifeCycle = findViewById(R.id.lifeCycle);
        onBoarding = findViewById(R.id.onBoarding);
        snackBar = findViewById(R.id.snackBar);
        radioButton = findViewById(R.id.radioButton);
        spinner = findViewById(R.id.spinner);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        tableLayout = findViewById(R.id.tableLayout);
        animations = findViewById(R.id.animations);
        dialog = findViewById(R.id.dialog);
        customDialog = findViewById(R.id.customDialog);
        listview = findViewById(R.id.listview);
        recyclerView = findViewById(R.id.recyclerView);
        notification = findViewById(R.id.notification);
        tabLayout = findViewById(R.id.tablayout);
        optionMenu = findViewById(R.id.optionMenu);
        customToolbar = findViewById(R.id.customToolbar);
        navigation = findViewById(R.id.navigation);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        clipBoard = findViewById(R.id.clipboard);
        bundlePassing = findViewById(R.id.bundlepassing);
        sharedPreferences = findViewById(R.id.sharedpreferences);
        notesapp = findViewById(R.id.notesapp);
        calculator = findViewById(R.id.calculatorapp);
        bmiCalculator = findViewById(R.id.bmiCalculator);
        emiCalculator = findViewById(R.id.emiCalculator);
        demoActivity = findViewById(R.id.demoactivity);
        retrofitLibrary = findViewById(R.id.retrofitLibrary);
        firebaseRealtime = findViewById(R.id.firebaseRealtime);
        firebaseAuthentication = findViewById(R.id.firebaseAuth);


        lifeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LifeCycleActivity.class);
                startActivity(intent);
            }
        });

        onBoarding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OnBoardingActivity.class);
                startActivity(intent);
            }
        });

        snackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SnackBarActivity.class);
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

        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(intent);
            }
        });

        autoCompleteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AutoCompleteTextViewActivity.class);
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

        optionMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OptionMenuActivity.class);
                startActivity(intent);
            }
        });

        customToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomToolbarActivity.class);
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

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
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

                Intent intent = new Intent(MainActivity.this, BundlePassingActivity.class);
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

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });
        bmiCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BmiCalculatorActivity.class);
                startActivity(intent);
            }
        });
        emiCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EmiCalculatorActivity.class);
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
        retrofitLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RetrofitLibActivity.class);
                startActivity(intent);
            }
        });

        firebaseRealtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirebaseRealtimeActivity.class);
                startActivity(intent);
            }
        });

        firebaseAuthentication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirebaseSignupActivity.class);
                startActivity(intent);
            }
        });

    }

    private void changeActivity(Class<?> activity) {
        Intent intent = new Intent(MainActivity.this, activity);
        startActivity(intent);
    }
}