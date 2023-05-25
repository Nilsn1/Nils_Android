package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivitytoFragment extends AppCompatActivity {

    EditText weight, height;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityto_fragment);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                int userweight = Integer.parseInt(weight.getText().toString());
                int userheight = Integer.parseInt(height.getText().toString());

                bundle.putInt("weight", userheight);
                bundle.putInt("height", userheight);

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BmiFragment bmiFragment = new BmiFragment();

                bmiFragment.setArguments(bundle);
                fragmentTransaction.add(R.id.container,bmiFragment);
                fragmentTransaction.commit();

            }
        });
    }
}