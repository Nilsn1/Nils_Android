package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Toast.makeText(LifeCycleActivity.this,"onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        Toast.makeText(LifeCycleActivity.this,"onStart",Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Toast.makeText(LifeCycleActivity.this,"onResume",Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(LifeCycleActivity.this,"onPause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(LifeCycleActivity.this,"onStop",Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(LifeCycleActivity.this,"onDestroy",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(LifeCycleActivity.this,"onRestart",Toast.LENGTH_SHORT).show();
        super.onRestart();
    }
}