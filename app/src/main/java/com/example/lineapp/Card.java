package com.example.lineapp;

public class Card {

    private String imgURL;
    private String title;

    private String location;
    private String time;

    public Card(String imgURL, String title) {
        this.imgURL = imgURL;
        this.title = title;
        this.location = "Field";
        this.time = "Text";
    }

    public String getLocation() {
        return location;
    }

    public String getWaitTime() {
        return time;
    }

    public Card(String imgURL, String title, String location, float time){

        this.imgURL = imgURL;
        this.title = title;
        this.location = location;
        this.time = "" + time;

    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
