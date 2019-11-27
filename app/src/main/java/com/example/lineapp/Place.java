package com.example.lineapp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Place {

    public static int WAIT_TIME_AVG = 5;

    private String location;
    private String name;
    private ArrayList<String> timeList;
    private String imgUrl;

    public Place (String url, String n, String l){

        this.imgUrl = url;
        this.name = n;
        this.location = l;
        timeList = new ArrayList<>();


    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getList() {
        return this.timeList;
    }

    public void setList(ArrayList<String> list) {
        this.timeList = list;
    }

    public void addWaitTime (String time) {
        this.timeList.add(time);
    }

    public ArrayList<String> getRecentElements (int numElements) {
        int actual = numElements > this.getList().size()? 0 : this.getList().size() - numElements;
        ArrayList<String> temp = new ArrayList<>();
        for (int i = this.getList().size() - 1; i >= actual; i--) {
            temp.add(this.getList().get(i));
        }
         return temp;
    }

    public float avgWaitTime (int numToCount) {
        ArrayList<String> temp = getRecentElements(numToCount);
        double sum = 0;
        for (int i = 0; i < temp.size(); i++) {
            sum += Integer.parseInt(temp.get(i));
        }
        return (float) (sum) / (float) numToCount;
    }

    public void removeOldData (int numToRemove) {
        int actual = (numToRemove > this.getList().size())? this.getList().size() : numToRemove;
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < actual; i++) {
            this.getList().remove(i);
        }

    }

    public Card toCard(){

        return new Card(this.imgUrl, this.name, this.location, this.avgWaitTime(WAIT_TIME_AVG));

    }

}

