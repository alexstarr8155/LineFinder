package com.example.lineapp;

import android.location.Location;
import android.util.Log;

import java.util.ArrayList;

public class PlaceList {
    public static double threshold = 0.01;
    public static ArrayList<Place> places = new ArrayList<>();

    public static void init(){
        places.add(new Place("drawable://" + R.drawable.foggy_iceland, "Foggy Iceland1", "50.8464176 -114.0127622"));
        places.add(new Place("drawable://" + R.drawable.havasu_falls, "Havasu Falls2", "51.8464176 -114.0127622"));
        places.add(new Place("drawable://" + R.drawable.hawaii_rainforest, "Hawaii Rainforest3", "52.8464176 -114.0127622"));
        places.add(new Place("drawable://" + R.drawable.newfoundland_ice, "Newfoundland Ice4", "53.8464176 -114.0127622"));
        places.add(new Place("drawable://" + R.drawable.oregon_greens, "Oregon Greens5", "54.8464176 -114.0127622"));
        places.add(new Place("drawable://" + R.drawable.tim_hortons_logo, "STC Tim Hortons6", "55.8464176 -114.0127622"));
        places.add(new Place("drawable://" + R.drawable.yosemite, "Yosemite7", "56.8464176 -114.0127622"));
        //places.add(new Place("@drawable/arizona_desert", "Desert", "" + 987654));
        places.add(new Place("drawable://" + R.drawable.bamf1, "Banff8", "57.8464176 -114.0127622"));
        places.add(new Place("drawable://" + R.drawable.colorado_mountains, "Colorado Mountains9", "58.8464176 -114.0127622"));
        places.add(new Place("drawable://" + R.drawable.cork, "Cork10", "59.8464176 -114.0127622"));
        places.add(new Place("drawable://" + R.drawable.davenport_california, "DavenPort California11", "40.8464176 -114.0127622"));
        places.add(new Place("drawable://" + R.drawable.denmark_austrailia, "Denmark Austrailia12", "41.8464176 -114.0127622"));

    }

    public static Place isNearbyOne(String phoneLocation) {
        String[] currLoc = phoneLocation.split(MainActivity.standardDelimiter);
        for (Place p : places) {
            String[] temp = p.getLocation().split(MainActivity.standardDelimiter);
            if (Math.abs(Double.parseDouble(temp[0]) - Double.parseDouble(currLoc[0])) < threshold
                && Math.abs(Double.parseDouble(temp[1]) - Double.parseDouble(currLoc[1])) < threshold) {
                //Log.e("tag", p.getName());
                return p;
            }
        }
        return null;
    }


}
