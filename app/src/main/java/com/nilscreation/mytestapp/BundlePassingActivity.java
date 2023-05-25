package com.nilscreation.mytestapp;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BundlePassingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_passing);

        EditText name, place, rollno;
        Button submit;

        name = findViewById(R.id.name);
        place = findViewById(R.id.place);
        rollno = findViewById(R.id.rollno);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (name.getText().toString().equals("") || place.getText().toString().equals("") || rollno.getText().toString().equals("")) {

                    Toast.makeText(BundlePassingActivity.this, "Fields Required", Toast.LENGTH_SHORT).show();

                } else {

                    String mname = name.getText().toString();
                    String mplace = place.getText().toString();
                    int finalroll = Integer.parseInt(rollno.getText().toString());

                    Intent intent = new Intent(BundlePassingActivity.this, SecondActivity.class);
                    intent.putExtra("Name", mname);
                    intent.putExtra("Place", mplace);
                    intent.putExtra("Roll no", finalroll);
                    startActivity(intent);
                }
            }
        });
    }
}