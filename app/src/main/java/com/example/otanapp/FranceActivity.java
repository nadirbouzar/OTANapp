package com.example.otanapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FranceActivity extends AppCompatActivity {
    private Button canon;
    private Button amx10rc;
    private Button Tigre;
    private Button milan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.france_activity);


        Button button1 = findViewById(R.id.canon);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FranceActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le premier bouton
                // Ajoutez votre code ici
            }
        });

        Button button2 = findViewById(R.id.amx10rc);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FranceActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le deuxième bouton
                // Ajoutez votre code ici
            }
        });

        Button button3 = findViewById(R.id.tigre);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FranceActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le troisième bouton
                // Ajoutez votre code ici
            }
        });

        Button button4 = findViewById(R.id.milan);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FranceActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le troisième bouton
                // Ajoutez votre code ici
            }
        });
    }
}