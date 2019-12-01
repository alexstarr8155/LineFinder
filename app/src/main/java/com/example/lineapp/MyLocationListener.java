package com.example.lineapp;

private class MyLocationListener implements LocationListener {
    @Override
    public void onLocationChanged(Location loc) {

        editLocation.setText("");
        pb.setVisibility(View.INVISIBLE);
        Toast.makeText(getBaseContext(),"Location changed : Lat: " +
                        loc.getLatitude()+ " Lng: " + loc.getLongitude(),
                Toast.LENGTH_SHORT).show();
        String longitude = "Longitude: " +loc.getLongitude();
        Log.v(TAG, longitude);
        String latitude = "Latitude: " +loc.getLatitude();
        Log.v(TAG, latitude);