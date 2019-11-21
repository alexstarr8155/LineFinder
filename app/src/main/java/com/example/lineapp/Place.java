package com.example.lineapp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Place {

    private String location;
    private String name;
    private ArrayList<String> list;

    public Place (String l, String n){

        location = l;
        name = n;
        list = new ArrayList<>();

        list.add("text");
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
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}

