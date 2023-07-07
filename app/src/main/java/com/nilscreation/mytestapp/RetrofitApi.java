package com.nilscreation.mytestapp;

import com.nilscreation.mytestapp.Models.UserModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApi {

    @GET("demo.json")
    Call<List<UserModel>> userlist();

}
