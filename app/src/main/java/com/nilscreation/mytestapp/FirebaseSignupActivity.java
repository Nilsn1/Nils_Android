package com.nilscreation.mytestapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class FirebaseSignupActivity extends AppCompatActivity {

    EditText signupEmail, signupPassword;
    Button signupBtn;
    TextView login;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_signup);

        signupEmail = findViewById(R.id.signupEmail);
        signupPassword = findViewById(R.id.signupPassword);
        signupBtn = findViewById(R.id.signupBtn);
        login = findViewById(R.id.login);

        auth = FirebaseAuth.getInstance();

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userEmail = signupEmail.getText().toString();
                String userPasword = signupPassword.getText().toString();

                if (userEmail.isEmpty()) {
                    signupEmail.setError("Email Cannot be Empty");
                }
                if (userPasword.isEmpty()) {
                    signupPassword.setError("Password Cannot be Empty");
                } else {
                    auth.createUserWithEmailAndPassword(userEmail, userPasword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()) {
                                Toast.makeText(FirebaseSignupActivity.this, "Signup Successfull", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(FirebaseSignupActivity.this, MainActivity.class);
                                startActivity(intent);

                            } else {
                                Toast.makeText(FirebaseSignupActivity.this, "Signup Fail: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirebaseSignupActivity.this, FirebaseLoginActivity.class);
                startActivity(intent);
            }
        });

    }
}