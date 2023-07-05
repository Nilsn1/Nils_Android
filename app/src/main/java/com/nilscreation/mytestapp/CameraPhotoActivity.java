package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraPhotoActivity extends AppCompatActivity {

    private static final int CAMERA_REQ = 100;
    ImageView imgView;
    Button capturePhoto;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_photo);

        imgView = findViewById(R.id.imgview);
        capturePhoto = findViewById(R.id.capturePhoto);

        capturePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}