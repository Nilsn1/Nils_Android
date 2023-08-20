package com.nilscreation.mytestapp.Adapters;

import com.nilscreation.mytestapp.Models.BloggerModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BloggerApiService {
    @GET("blogs/3174392454774953694/posts/3916499526728621855?key=AIzaSyB2NXeFloFkHIxuO3BlleBtUMLh97uW52I")
    Call<BloggerModel> getBlogPosts();

    @GET("blogs/3174392454774953694/posts/{postId}/?key=AIzaSyB2NXeFloFkHIxuO3BlleBtUMLh97uW52I")
    Call<BloggerModel> getBlogPosts(@Path("postId") String postId);
}
