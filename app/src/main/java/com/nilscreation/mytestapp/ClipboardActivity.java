package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ClipboardActivity extends AppCompatActivity {
    Button copyButton;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clipboard);
        copyButton = findViewById(R.id.copybutton);
        inputText = findViewById(R.id.inputText);

        copyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = inputText.getText().toString();

                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("simple text",text);
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(ClipboardActivity.this, "Text copied", Toast.LENGTH_SHORT).show();

            }
        });
    }
}