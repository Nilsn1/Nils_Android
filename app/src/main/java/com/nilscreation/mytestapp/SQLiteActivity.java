package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.nilscreation.mytestapp.Adapters.NotesAdapter;
import com.nilscreation.mytestapp.Models.NotesModel;

import java.util.ArrayList;

public class SQLiteActivity extends AppCompatActivity {

    FloatingActionButton btnAdd;
    RecyclerView recyclerview;
    ArrayList<NotesModel> noteslist;
    NotesAdapter adapter;

    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
        btnAdd = findViewById(R.id.btnAdd);
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        noteslist = new ArrayList<>();


        dbHandler = new DBHandler(this);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SQLiteActivity.this, SQLiteNotesDetailActivity.class));
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        noteslist = dbHandler.readData();
        adapter = new NotesAdapter(this, noteslist);
        recyclerview.setAdapter(adapter);
    }
}