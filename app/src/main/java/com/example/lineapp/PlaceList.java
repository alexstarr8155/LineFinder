package com.example.lineapp;

import java.util.ArrayList;

public class PlaceList {

    public static ArrayList<Place> places = new ArrayList<>();

    public static void init(){
        places.add(new Place("drawable://" + R.drawable.foggy_iceland, "Foggy Iceland", "09467"));
        places.add(new Place("drawable://" + R.drawable.havasu_falls, "Havasu Falls", "09467"));
        places.add(new Place("drawable://" + R.drawable.hawaii_rainforest, "Hawaii Rainforest", "09467"));
        places.add(new Place("drawable://" + R.drawable.newfoundland_ice, "Newfoundland Ice", "09467"));
        places.add(new Place("drawable://" + R.drawable.oregon_greens, "Oregon Greens", "09467"));
        places.add(new Place("drawable://" + R.drawable.tim_hortons_logo, "STC Tim Hortons", "09467"));
        places.add(new Place("drawable://" + R.drawable.yosemite, "Yosemite", "09467"));
        places.add(new Place("@drawable/arizona_desert", "Desert", "" + 987654));
        places.add(new Place("drawable://" + R.drawable.bamf1, "Banff", "456"));
        places.add(new Place("drawable://" + R.drawable.colorado_mountains, "Colorado Mountains", "37898"));
        places.add(new Place("drawable://" + R.drawable.cork, "Cork", "93687"));
        places.add(new Place("drawable://" + R.drawable.davenport_california, "DavenPort California", "09467"));
        places.add(new Place("drawable://" + R.drawable.denmark_austrailia, "Denmark Austrailia", "09467"));

    }


}
