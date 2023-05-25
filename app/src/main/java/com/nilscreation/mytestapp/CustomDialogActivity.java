package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);

        Dialog dialog = new Dialog(CustomDialogActivity.this);
        dialog.setContentView(R.layout.custom_dialog);
//        dialog.setCancelable(true);

        Button btnOk = dialog.findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}