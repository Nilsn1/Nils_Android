package com.nilscreation.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.nilscreation.mytestapp.Adapters.BloggerApiService;
import com.nilscreation.mytestapp.Models.BloggerModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DemoActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        imageView = findViewById(R.id.imageView);

        // Initialize Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.googleapis.com/blogger/v3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        BloggerApiService apiService = retrofit.create(BloggerApiService.class);

        // Make API call to fetch posts
        Call<BloggerModel> call = apiService.getBlogPosts();

        call.enqueue(new Callback<BloggerModel>() {
            @Override
            public void onResponse(Call<BloggerModel> call, Response<BloggerModel> response) {

                BloggerModel mylist = response.body();

                List<String> imagelist = extractImageUrls(mylist.getContent());
                Toast.makeText(DemoActivity.this, "" + imagelist.get(0), Toast.LENGTH_SHORT).show();
                Glide.with(DemoActivity.this).load(imagelist.get(1)).into(imageView);
            }

            @Override
            public void onFailure(Call<BloggerModel> call, Throwable t) {

            }
        });
    }

    public static List<String> extractImageUrls(String htmlContent) {
        List<String> imageUrls = new ArrayList<>();
        Document doc = Jsoup.parse(htmlContent);
        Elements imgElements = doc.select("img[src]"); // Select all <img> tags with src attribute

        for (Element imgElement : imgElements) {
            String imageUrl = imgElement.attr("src");
            imageUrls.add(imageUrl);
        }

        return imageUrls;
    }
}