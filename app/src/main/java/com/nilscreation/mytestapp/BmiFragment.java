package com.nilscreation.mytestapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BmiFragment extends Fragment {

    TextView result;

    public BmiFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bmi, container, false);

        result = view.findViewById(R.id.result);

        Bundle bundle = getArguments();
        int userweight = bundle.getInt("weight");
        int userheight = bundle.getInt("height");

//        double bmi = (userweight * 1000) / (userheight * userheight);
//        result.setText("Your BMI is: " + bmi);

        float weight = Float.parseFloat(String.valueOf(userweight));
        float height = Float.parseFloat(String.valueOf(userheight)) / 100; // Convert cm to meters

        float bmi = weight / (height * height);

        String bmiLabel;
        if (bmi < 18.5) {
            bmiLabel = "Underweight";
        } else if (bmi < 24.9) {
            bmiLabel = "Normal weight";
        } else if (bmi < 29.9) {
            bmiLabel = "Overweight";
        } else {
            bmiLabel = "Obese";
        }

        result.setText("BMI: " + bmi + "\n" + "Category: " + bmiLabel);

        return view;
    }
}