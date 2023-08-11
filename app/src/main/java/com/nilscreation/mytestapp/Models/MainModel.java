package com.nilscreation.mytestapp.Models;

import android.app.Activity;

public class MainModel {

    String title;
    Activity activity;

    public MainModel(String title, Activity activity) {
        this.title = title;
        this.activity = activity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
