package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nilscreation.mytestapp.Adapters.MainAdapter;
import com.nilscreation.mytestapp.Models.MainModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView myrecyclerView;
    ArrayList<MainModel> mainlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myrecyclerView = findViewById(R.id.myRecyclerview);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainlist = new ArrayList<>();

        mainlist.add(new MainModel("Activity LifeCycle", new LifeCycleActivity()));
        mainlist.add(new MainModel("OnBoarding", new OnBoardingActivity()));
        mainlist.add(new MainModel("SnackBar", new SnackBarActivity()));
        mainlist.add(new MainModel("RadioButton", new RadioButtonActivity()));
        mainlist.add(new MainModel("Spinner", new SpinnerActivity()));
        mainlist.add(new MainModel("AutoComplete TextView", new AutoCompleteTextViewActivity()));
        mainlist.add(new MainModel("TableLayout", new TableLayoutActivity()));
        mainlist.add(new MainModel("Option Menu", new OptionMenuActivity()));
        mainlist.add(new MainModel("Custom Toolbar", new CustomToolbarActivity()));
        mainlist.add(new MainModel("Navigation Drawer", new NavigationActivity()));
        mainlist.add(new MainModel("Bottom Navigation View", new BottomNavigationActivity()));
        mainlist.add(new MainModel("Animations", new AnimationsActivity()));
        mainlist.add(new MainModel("Dialog", new DialogActivity()));
        mainlist.add(new MainModel("CustomDialog", new CustomDialogActivity()));
        mainlist.add(new MainModel("ListView", new ListviewActivity()));
        mainlist.add(new MainModel("RecyclerView", new RecyclerViewActivity()));
        mainlist.add(new MainModel("Notifications", new NotificationActivity()));
        mainlist.add(new MainModel("TabLayout", new TablayoutActivity()));
        mainlist.add(new MainModel("ClipBoard", new ClipboardActivity()));
        mainlist.add(new MainModel("Bundle Data Passing", new BundlePassingActivity()));
        mainlist.add(new MainModel("Shared Preferences", new SharedpreferencesActivity()));
        mainlist.add(new MainModel("Notes App", new NotesActivity()));
        mainlist.add(new MainModel("SQLite DB", new SQLiteActivity()));
        mainlist.add(new MainModel("Simple Calculator", new CalculatorActivity()));
        mainlist.add(new MainModel("BMI Calculator", new BmiCalculatorActivity()));
        mainlist.add(new MainModel("EMI Calculator", new EmiCalculatorActivity()));
        mainlist.add(new MainModel("Volley Library", new VolleyLibActivity()));
        mainlist.add(new MainModel("Retrofit Library", new RetrofitLibActivity()));
        mainlist.add(new MainModel("Firebase Realtime DB", new FirebaseRealtimeActivity()));
        mainlist.add(new MainModel("Firebase Authentication", new FirebaseSignupActivity()));

        MainAdapter adapter = new MainAdapter(this, mainlist);
        myrecyclerView.setAdapter(adapter);
    }
}