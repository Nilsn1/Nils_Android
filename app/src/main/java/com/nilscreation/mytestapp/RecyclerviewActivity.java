package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class RecyclerviewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<rv_model> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList = new ArrayList<>();
        arrayList.add(new rv_model("John", R.drawable.person));
        arrayList.add(new rv_model("Rock", R.drawable.person));
        arrayList.add(new rv_model("Matt", R.drawable.person));
        arrayList.add(new rv_model("Brat", R.drawable.person));

        rv_adapter adapter = new rv_adapter(this, arrayList);
        recyclerView.setAdapter(adapter);


    }
}