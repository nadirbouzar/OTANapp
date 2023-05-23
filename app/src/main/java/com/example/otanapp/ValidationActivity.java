package com.example.otanapp;



import android.os.Bundle;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



import android.widget.Button;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.content.Intent;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class ValidationActivity  extends AppCompatActivity {
    private Button accueil;
    private Button revenir;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);


        Button button1 = findViewById(R.id.accueil);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ValidationActivity.this, MainActivity2.class);
                startActivity(intent);
                // Action pour le premier bouton
                // Ajoutez votre code ici
            }
        });

        Button button2 = findViewById(R.id.revenir);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ValidationActivity.this,ItalyActivity.class);
                startActivity(intent);
                // Action pour le premier bouton
                // Ajoutez votre code ici
            }
        });


    }
}