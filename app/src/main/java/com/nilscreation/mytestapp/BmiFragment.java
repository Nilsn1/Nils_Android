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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bmi, container, false);

        result = view.findViewById(R.id.result);
        Bundle bundle = getArguments();
        int userweight = bundle.getInt("weight");
        int userheight = bundle.getInt("height");

        double bmi = (userheight * 1000) / (userheight * userheight);
        result.setText("Your BMI is: " + bmi);

        return view;
    }
}