package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listView = findViewById(R.id.listview);
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Kotlin");
        languages.add("C");
        languages.add("C#");
        languages.add("C++");
        languages.add("PHP");
        languages.add("Javascript");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListviewActivity.this, android.R.layout.simple_list_item_1, languages);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = adapter.getItem(position);
                Toast.makeText(ListviewActivity.this, "You Selected " + value, Toast.LENGTH_SHORT).show();

            }
        });

    }
}