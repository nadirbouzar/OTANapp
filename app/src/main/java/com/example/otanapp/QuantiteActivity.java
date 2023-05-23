package com.example.otanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QuantiteActivity extends AppCompatActivity {
    private Button quantite;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualite);



        Button button1 = findViewById(R.id.quantite);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuantiteActivity.this, ValidationActivity.class);
                startActivity(intent);
                // Action pour le premier bouton
                // Ajoutez votre code ici
            }
        });
    }}