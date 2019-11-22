package com.example.lineapp;

public class Card {

    private String imgURL;
    private String title;

    private String field1;
    private String field2;

    public Card(String imgURL, String title) {
        this.imgURL = imgURL;
        this.title = title;
        this.field1 = "Field";
        this.field2 = "Text";
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public Card(String imgURL, String title, String field1, String field2){

        this.imgURL = imgURL;
        this.title = title;
        this.field1 = field1;
        this.field2 = field2;

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
