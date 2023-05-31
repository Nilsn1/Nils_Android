package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        String[] languages = {"Java", "Kotlin", "PHP", "Html", "Css", "Javascript", "C", "C#", "C++", "SQL", "Swift", "Python"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, languages);
        autoCompleteTextView.setAdapter(arrayAdapter);

    }
}