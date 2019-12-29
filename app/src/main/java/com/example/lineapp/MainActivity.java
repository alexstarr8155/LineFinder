package com.example.lineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.app.NotificationManager;
import androidx.core.app.NotificationCompat;
import android.view.View;
import android.content.Context;
import android.widget.ListView;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    // GPS
    private LocationManager locationManager=null;
    private LocationListener locationListener=null;

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

        //locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        //locationManager.requestLocationUpdates(LocationManager
          //      .GPS_PROVIDER, 5000, 10,locationListener);
        //locationListener = new MyLocationListener();
    }

    private void showNotification(String message){

        Intent notifIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notifIntent, 0);


        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"default")
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Notification Title")
                .setContentText(message)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(contentIntent);

        NotificationManager notificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            builder.setChannelId("YOUR_PACKAGE_NAME");
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    "YOUR_PACKAGE_NAME",
                    "YOUR_APP_NAME",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(channel);
            }
        }
        notificationManager.notify(0 , builder.build());
    }
}
