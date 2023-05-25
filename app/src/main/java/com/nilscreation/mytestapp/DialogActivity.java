package com.nilscreation.mytestapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {

    Button single, two, three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        single = findViewById(R.id.single);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Single Button
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(DialogActivity.this);
                alertDialog.setTitle("Terms & Condition");
                alertDialog.setIcon(R.drawable.info);
                alertDialog.setMessage("Have you read all T & C");

                alertDialog.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();

                    }
                });

                alertDialog.show();

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Two Buttons
                AlertDialog.Builder delete = new AlertDialog.Builder(DialogActivity.this);
                delete.setTitle("Delete");
                delete.setIcon(R.drawable.info);
                delete.setMessage("Do you really want to delete this?");

                delete.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(DialogActivity.this, "Item Deleted", Toast.LENGTH_SHORT).show();
                    }
                });

                delete.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(DialogActivity.this, "Item not deleted", Toast.LENGTH_SHORT).show();
                    }
                });

                delete.show();

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Three Buttons
                AlertDialog.Builder exitdialog = new AlertDialog.Builder(DialogActivity.this);
                exitdialog.setTitle("Exit");
                exitdialog.setIcon(R.drawable.info);
                exitdialog.setMessage("Do you really want to exit?");

                exitdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }
                });

                exitdialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(DialogActivity.this, "You selected No", Toast.LENGTH_SHORT).show();

                    }
                });

                exitdialog.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DialogActivity.this, "cancelled", Toast.LENGTH_SHORT).show();
                    }
                });

                exitdialog.show();

            }
        });
    }
}