package com.example.otanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UkActivity extends AppCompatActivity {
    private Button challenger2;
    private Button munitions;
    private Button m270mlrs;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uk_activity);

        Button button1 = findViewById(R.id.challenger2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UkActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le premier bouton
                // Ajoutez votre code ici
            }
        });

        Button button2 = findViewById(R.id.munitions);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UkActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le deuxième bouton
                // Ajoutez votre code ici
            }
        });

        Button button3 = findViewById(R.id.m270mlrs);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UkActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le troisième bouton
                // Ajoutez votre code ici
            }
        });

        Button button4 = findViewById(R.id.seaking);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UkActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le troisième bouton
                // Ajoutez votre code ici
            }
        });
    }
}