package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class TablayoutActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        ViewPagerMessengerAdapter adapter = new ViewPagerMessengerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);



    }
}