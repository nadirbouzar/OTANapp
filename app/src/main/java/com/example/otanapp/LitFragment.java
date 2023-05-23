package com.example.otanapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class LitFragment extends Fragment {
    private Button etatsUnis;
    private Button italie;
    private Button royaumeUnis;
    private Button france;
    private Button allemagne;
    private Button berreta;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_lit, container, false);

        Button italieButton = rootView.findViewById(R.id.italie);
        italieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ItalyActivity.class);
                startActivity(intent);
            }
        });

        Button euButton = rootView.findViewById(R.id.etatsUnis);
        euButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EuActivity.class);
                startActivity(intent);
            }
        });

        Button ukButton = rootView.findViewById(R.id.royaumeUnis);
        ukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), UkActivity.class);
                startActivity(intent);
            }
        });

        Button franceButton = rootView.findViewById(R.id.france);
        franceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FranceActivity.class);
                startActivity(intent);
            }
        });

        Button allemagneButton = rootView.findViewById(R.id.allemagne);
        allemagneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AllemagneActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
