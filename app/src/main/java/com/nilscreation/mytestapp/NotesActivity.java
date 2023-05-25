package com.nilscreation.mytestapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class NotesActivity extends AppCompatActivity {

    EditText note;
    Button add;
    ListView listview;
    ArrayList<String> itemlist = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        note = findViewById(R.id.note);
        add = findViewById(R.id.add);
        listview = findViewById(R.id.listview);

        itemlist = FileHelper.readData(this);

        arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itemlist);

        listview.setAdapter(arrayAdapter);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (note.getText().toString().equals("")) {

                    Toast.makeText(NotesActivity.this, "Please enter note first", Toast.LENGTH_SHORT).show();
                } else {

                    String itemNote = note.getText().toString();
                    itemlist.add(itemNote);
                    note.setText("");

                    FileHelper.writeData(itemlist, getApplicationContext());
                    arrayAdapter.notifyDataSetChanged();
                }

            }
        });

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                AlertDialog.Builder alert = new AlertDialog.Builder(NotesActivity.this);
                alert.setTitle("Delete");
                alert.setMessage("Dou you really want to delete");
                alert.setCancelable(false);
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });

                alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        itemlist.remove(position);
                        arrayAdapter.notifyDataSetChanged();
                        FileHelper.writeData(itemlist, getApplicationContext());

                    }
                });
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
            }
        });

    }
}