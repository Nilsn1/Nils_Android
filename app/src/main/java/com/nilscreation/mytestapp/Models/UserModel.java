package com.nilscreation.mytestapp.Models;

public class UserModel {

    int userid;
    String username;
    String country;

    public UserModel(int userid, String username, String country) {
        this.userid = userid;
        this.username = username;
        this.country = country;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
