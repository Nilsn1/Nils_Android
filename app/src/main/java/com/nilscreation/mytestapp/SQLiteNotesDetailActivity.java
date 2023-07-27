package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nilscreation.mytestapp.Models.NotesModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class SQLiteNotesDetailActivity extends AppCompatActivity {

    private EditText notesTitle, notesDescription;
    private TextView notesTime, btnSave;
    private DBHandler dbHandler;

    ArrayList<NotesModel> noteslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_notes_detail);
        notesTitle = findViewById(R.id.notesTitle);
        notesDescription = findViewById(R.id.notesDescription);
        notesTime = findViewById(R.id.notesTime);
        btnSave = findViewById(R.id.btnSave);

        dbHandler = new DBHandler(this);

        DateFormat df = new SimpleDateFormat("HH:mm, dd/MM/yyyy");
        String Time = df.format(Calendar.getInstance().getTime());
        notesTime.setText(Time);

        Intent intent = getIntent();
        String title = intent.getStringExtra("Title");
        String description = intent.getStringExtra("Description");
        String time = intent.getStringExtra("Time");

        if (title != null || description != null) {
            notesTitle.setText(title);
            notesDescription.setText(description);
            notesTime.setText(time);
        } else {
//            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
        }

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mTitle = notesTitle.getText().toString();
                String mDescription = notesDescription.getText().toString();
                DateFormat df = new SimpleDateFormat("HH:mm, dd/MM/yyyy");
                String mDate = df.format(Calendar.getInstance().getTime());

                noteslist = new ArrayList<>();
                noteslist = dbHandler.readData();

                dbHandler.deleteandAdd(mTitle, mDescription, mDate);

                Toast.makeText(SQLiteNotesDetailActivity.this, "Note Saved Successfully", Toast.LENGTH_SHORT).show();

            }
        });


    }
}