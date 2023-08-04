package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.nilscreation.mytestapp.Adapters.UserAdapter;
import com.nilscreation.mytestapp.Models.UserModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class VolleyLibActivity extends AppCompatActivity {

    RecyclerView recyclerview;

    ArrayList<UserModel> userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley_lib);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        userlist = new ArrayList<>();

        loadData();

    }

    private void loadData() {
        String url = "https://nilsn1.github.io/nilscreation/demo.json";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);
                        int userId = jsonObject.getInt("userid");
                        String userName = jsonObject.getString("username");
                        String country = jsonObject.getString("country");

                        UserModel userModel = new UserModel(userId, userName, country);
                        userlist.add(userModel);

                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                    UserAdapter adapter = new UserAdapter(VolleyLibActivity.this, userlist);
                    recyclerview.setAdapter(adapter);
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(VolleyLibActivity.this, "Error: " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(VolleyLibActivity.this);
        requestQueue.add(jsonArrayRequest);

    }
}