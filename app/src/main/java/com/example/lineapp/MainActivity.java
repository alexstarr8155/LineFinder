package com.example.lineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        //FeedbackNotification notification = new FeedbackNotification();
        FeedbackNotification.notify(this, "Text", 1);

        mListView = (ListView) findViewById(R.id.listView);

        PlaceList.init();

        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_main, PlaceList.places);
        mListView.setAdapter(adapter);
    }
}
