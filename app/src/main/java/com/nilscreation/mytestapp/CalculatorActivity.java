package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    TextView textViewHistory, textViewResult;

    Button btnAC, btnDelete, btnDivide, btnMultiply, btnMinus, btnAdd, btnResult,
    btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot;

    float mvalueOne, mvalueTwo, temp;


    boolean doAdd, doMinus, doMultiply, doDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        textViewHistory = findViewById(R.id.textviewHistory);
        textViewResult = findViewById(R.id.textviewResult);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnDot = findViewById(R.id.btnDot);
        btnResult = findViewById(R.id.btnResult);
        btnAC = findViewById(R.id.btnAC);
        btnDelete = findViewById(R.id.btnDEL);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnAdd = findViewById(R.id.btnAdd);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewHistory.setText(textViewHistory.getText() + "1");
                doCalculation();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewHistory.setText(textViewHistory.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewHistory.setText(textViewHistory.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewHistory.setText(textViewHistory.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewHistory.setText(textViewHistory.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewHistory.setText(textViewHistory.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewHistory.setText(textViewHistory.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewHistory.setText(textViewHistory.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewHistory.setText(textViewHistory.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewHistory.setText(textViewHistory.getText() + "0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewHistory.setText(textViewHistory.getText() + ".");
            }
        });

        //
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textViewHistory == null){


                }else{
                    mvalueOne = Float.parseFloat(textViewHistory.getText() + "");
                    doAdd = true;
                    textViewHistory.setText(null);

                }

            }
        });



    }

    private void doCalculation() {

        mvalueOne = Float.parseFloat(textViewHistory.getText() + "");

        if (doAdd = true){
            textViewHistory.setText(mvalueOne + mvalueTwo + "");
        }

    }
}