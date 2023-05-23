package com.example.otanapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public class MapFragment extends Fragment implements OnMapReadyCallback{

    private GoogleMap myMap;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map, container, false);

    }
    @Override
    public void onMapReady(GoogleMap googleMap) {

        myMap = googleMap;
        //Ukraine
        LatLng ukraine = new LatLng(48.379889,31.168139);
        myMap.addMarker(new MarkerOptions().position(ukraine).title("Marker in ukraine"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(ukraine));
        //Kiev
        LatLng kiev = new LatLng(50.4501,30.5234);
        myMap.moveCamera(CameraUpdateFactory.newLatLng(kiev));
    }
}