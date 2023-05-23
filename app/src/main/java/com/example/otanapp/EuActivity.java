package com.example.otanapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EuActivity extends AppCompatActivity {
    private Button f35;
    private Button himars;
    private Button stryker;
    private Button predator;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eu_activity);

        Button button1 = findViewById(R.id.f35);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EuActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le premier bouton
                // Ajoutez votre code ici
            }
        });

        Button button2 = findViewById(R.id.himars);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EuActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le deuxième bouton
                // Ajoutez votre code ici
            }
        });

        Button button3 = findViewById(R.id.stryker);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EuActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le troisième bouton
                // Ajoutez votre code ici
            }
        });

        Button button4 = findViewById(R.id.predator);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EuActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le troisième bouton
                // Ajoutez votre code ici
            }
        });
    }
}