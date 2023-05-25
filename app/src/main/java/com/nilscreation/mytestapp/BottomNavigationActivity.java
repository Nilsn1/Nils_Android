package com.nilscreation.mytestapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomNavigationActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                if (id == R.id.home) {
                    Toast.makeText(BottomNavigationActivity.this, "Home", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.settings) {
                    Toast.makeText(BottomNavigationActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(BottomNavigationActivity.this, "About", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }
}