package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseActivity extends AppCompatActivity {

    EditText editText,editText2;
    Button submit;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference().child("Employee");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String key = editText.getText().toString();
                String value = editText2.getText().toString();

                reference.child(key).setValue(value);

            }
        });

    }
}