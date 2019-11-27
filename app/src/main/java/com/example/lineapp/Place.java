package com.example.lineapp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Place {

    private String location;
    private String name;
    private ArrayList<String> timeList;



    public Place (String l, String n){

        this.location = l;
        this.name = n;
        timeList = new ArrayList<>();

    }


    /*

    ;; Place
    * String, Nat, (listof Str)

    (define-struct (Place location name list)

    (make-place "test" 7 (list "t" "s"))


     */

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

}

