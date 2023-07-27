package com.nilscreation.mytestapp.Models;

public class NotesModel {

    String title;
    String Description;
    String Time;

    public NotesModel(String title, String description, String time) {
        this.title = title;
        Description = description;
        Time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
