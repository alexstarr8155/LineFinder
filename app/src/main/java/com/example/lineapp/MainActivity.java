package com.example.lineapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.NotificationManager;
import androidx.core.app.NotificationCompat;
import android.view.View;
import android.content.Context;
import android.widget.ListView;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("test1");

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference ref = db.getReference("testpath");
        ref.setValue(list);

        mListView = (ListView) findViewById(R.id.listView);

        PlaceList.init();

        Collections.sort(PlaceList.places);
        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.activity_main, PlaceList.places);
        mListView.setAdapter(adapter);
    }

    public void sendNotification(View view) {
        //Get an instance of NotificationManager//
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.bamf1) // random icon
                        .setContentTitle("My notification")
                        .setContentText("please work");


        // Gets an instance of the NotificationManager service//
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        //NotificationManager.notify().
        //        mNotificationManager.notify(001, mBuilder.build());
    }
}
