package com.example.otanapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AllemagneActivity extends AppCompatActivity {
    private Button fennek;
    private Button patriot;
    private Button sidewinder;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allemagne_activity);
        Button button1 = findViewById(R.id.fennek);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllemagneActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le premier bouton
                // Ajoutez votre code ici
            }
        });

        Button button2 = findViewById(R.id.patriot);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllemagneActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le deuxième bouton
                // Ajoutez votre code ici
            }
        });

        Button button3 = findViewById(R.id.sidewinder);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllemagneActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le troisième bouton
                // Ajoutez votre code ici
            }
        });

        Button button4 = findViewById(R.id.marder);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AllemagneActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le troisième bouton
                // Ajoutez votre code ici
            }
        });
    }
}