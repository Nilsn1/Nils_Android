package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LifeCycleActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Toast.makeText(LifeCycleActivity.this, "onCreate", Toast.LENGTH_SHORT).show();

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LifeCycleActivity.this, MainActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        Toast.makeText(LifeCycleActivity.this, "onStart", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Toast.makeText(LifeCycleActivity.this, "onResume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(LifeCycleActivity.this, "onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(LifeCycleActivity.this, "onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(LifeCycleActivity.this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(LifeCycleActivity.this, "onRestart", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }
}