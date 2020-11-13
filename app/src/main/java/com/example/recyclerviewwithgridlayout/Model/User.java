package com.example.recyclerviewwithgridlayout.Model;

public class User {
    private int imgSource;
    private String userName;

    public User(int imgSource, String userName) {
        this.imgSource = imgSource;
        this.userName = userName;
    }

    public int getImgSource() {
        return imgSource;
    }

    public void setImgSource(int imgSource) {
        this.imgSource = imgSource;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
