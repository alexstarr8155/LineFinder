package com.example.lineapp;

import android.app.AlertDialog;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Database {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    String output = "";

    //@Override
    public void make_test(){
        DatabaseReference ref = database.getReference("something");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                output = value;
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                output = "Failed to read value." + error.toException();
            }
        });
        ref.setValue("this is an update?");
    }

    public String getOutput() {
        return output;
    }
}
