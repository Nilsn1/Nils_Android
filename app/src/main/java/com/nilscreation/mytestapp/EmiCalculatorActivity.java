package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Locale;

public class EmiCalculatorActivity extends AppCompatActivity {

    SeekBar sbAmount, sbInterest, sbYears;

    EditText txtAmount, txtInterest, txtYears;

    TextView textViewEMI, textViewPrincipalAmount, textViewTotalInterest, textViewTotalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi_calculator);
        sbAmount = findViewById(R.id.sbAmount);
        sbInterest = findViewById(R.id.sbInterest);
        sbYears = findViewById(R.id.sbYears);

        txtAmount = findViewById(R.id.txtAmount);
        txtInterest = findViewById(R.id.txtInterest);
        txtYears = findViewById(R.id.txtYears);

        textViewEMI = findViewById(R.id.fMonthlyEmi);
        textViewPrincipalAmount = findViewById(R.id.fPrincipleAmount);
        textViewTotalInterest = findViewById(R.id.fTotalInterest);
        textViewTotalAmount = findViewById(R.id.fTotalAmount);

        calculateEMI();

        sbAmount.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtAmount.setText("" + i);
                calculateEMI();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbInterest.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtInterest.setText("" + i);
                calculateEMI();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbYears.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtYears.setText("" + i);
                calculateEMI();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void calculateEMI() {

        if (!txtAmount.getText().toString().isEmpty() && (!txtInterest.getText().toString().isEmpty()) && (!txtYears.getText().toString().isEmpty())) {

            String principalText = txtAmount.getText().toString().trim();
            String interestRateText = txtInterest.getText().toString().trim();
            String loanTermText = txtYears.getText().toString().trim();

            double principal = Double.parseDouble(principalText);
            double interestRate = Double.parseDouble(interestRateText);
            int loanTermYears = Integer.parseInt(loanTermText);

            int loanTermMonths = loanTermYears * 12;

            double monthlyInterestRate = interestRate / 100 / 12;
            double emi = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTermMonths)) / (Math.pow(1 + monthlyInterestRate, loanTermMonths) - 1);
            double totalAmount = emi * loanTermMonths;
            double totalInterest = totalAmount - principal;

            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String emiFormatted = decimalFormat.format(emi);
            String principalAmountFormatted = decimalFormat.format(principal);
            String totalInterestFormatted = decimalFormat.format(totalInterest);
            String totalAmountFormatted = decimalFormat.format(totalAmount);

            textViewEMI.setText(emiFormatted + " ₹");
            textViewPrincipalAmount.setText(principalAmountFormatted + " ₹");
            textViewTotalInterest.setText(totalInterestFormatted + " ₹");
            textViewTotalAmount.setText(totalAmountFormatted + " ₹");
        }
    }

}