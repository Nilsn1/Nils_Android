package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.GsonBuilder;
import com.nilscreation.mytestapp.Adapters.UserAdapter;
import com.nilscreation.mytestapp.Models.UserModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitLibActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<UserModel> userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_lib);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://raw.githubusercontent.com/Nilsn1/nilscreation/main/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitApi retrofitApi = retrofit.create(RetrofitApi.class);

        Call<List<UserModel>> call = retrofitApi.userlist();

        call.enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {

                userlist = response.body();
                UserAdapter adapter = new UserAdapter(RetrofitLibActivity.this, userlist);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {
                Toast.makeText(RetrofitLibActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}