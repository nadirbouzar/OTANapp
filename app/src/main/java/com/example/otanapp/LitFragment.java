package com.example.otanapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class LitFragment extends Fragment {
    private Button eu;
    private Button italie;
    private Button uk;
    private Button france;
    private Button allemagne;


    //private Button logout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_lit, container, false);

        Button italieButton = rootView.findViewById(R.id.italie);
        italieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action à effectuer lorsque "nav_logout" est sélectionné
                Intent intent = new Intent(getActivity(), ItalyActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }


}
