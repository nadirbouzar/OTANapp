package com.example.otanapp;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
//import com.example.mygooglemapacticity.databinding.ActivityMapsBinding;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback{
    private GoogleMap myMap;
    //private ActivityMapsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        /*binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());*/

        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        myMap = googleMap;
        LatLng ukraine = new LatLng(48.379889,31.168139);
        myMap.moveCamera(CameraUpdateFactory.newLatLng(ukraine));
    }
}
