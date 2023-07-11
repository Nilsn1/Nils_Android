package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationsActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnMove, btnAlpha, btnRotate, btnScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);

        imageView = findViewById(R.id.imageView);
        btnMove = findViewById(R.id.btnMove);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnRotate = findViewById(R.id.btnRotate);
        btnScale = findViewById(R.id.btnScale);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation move = AnimationUtils.loadAnimation(AnimationsActivity.this, R.anim.move);
                imageView.startAnimation(move);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation alpha = AnimationUtils.loadAnimation(AnimationsActivity.this, R.anim.alpha);
                imageView.startAnimation(alpha);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotation = AnimationUtils.loadAnimation(AnimationsActivity.this, R.anim.rotation);
                imageView.startAnimation(rotation);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation scale = AnimationUtils.loadAnimation(AnimationsActivity.this, R.anim.scale);
                imageView.startAnimation(scale);
            }
        });

    }
}