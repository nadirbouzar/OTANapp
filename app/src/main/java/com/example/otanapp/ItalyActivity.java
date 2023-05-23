package com.example.otanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ItalyActivity extends AppCompatActivity {
    private Button mamba;
    private Button stinger;
    private Button berreta;
    private Button berreta1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.italy_activity);


        Button button1 = findViewById(R.id.mamba);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItalyActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le premier bouton
                // Ajoutez votre code ici
            }
        });

        Button button2 = findViewById(R.id.stinger);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItalyActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le deuxième bouton
                // Ajoutez votre code ici
            }
        });

        Button button3 = findViewById(R.id.berreta);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItalyActivity.this, QuantiteActivity.class);
                startActivity(intent);
                // Action pour le troisième bouton
                // Ajoutez votre code ici
            }
        });


    /*public void openActivity2(View view) {
        // Récupérer l'identifiant du bouton cliqué
        int buttonId = view.getId();

        // Déterminer le message personnalisé en fonction du bouton cliqué
        String message;
        if (buttonId == R.id.mamba) {
            message = "Votre demande de mamba a ete prise en compte";
            Intent intent = new Intent(ItalyActivity.this, QuantiteActivity.class);
            intent.putExtra("message", message);
            startActivity(intent);
        } else if (buttonId == R.id.stinger) {
            message = "Votre demande de stinger a ete prise en compte";
            Intent intent = new Intent(ItalyActivity.this, QuantiteActivity.class);
            intent.putExtra("message", message);
            startActivity(intent);
        }else if (buttonId == R.id.berreta) {
            message = "Votre demande de berreta a ete prise en compte";
            Intent intent = new Intent(ItalyActivity.this, QuantiteActivity.class);
            intent.putExtra("message", message);
            startActivity(intent);
        }else {
            message = "Message personnalisé par défaut";
            Intent intent = new Intent(ItalyActivity.this, QuantiteActivity.class);
            intent.putExtra("message", message);
            startActivity(intent);
        }

        // Ouvrir MainActivity2 en lui transmettant le message personnalisé



    }*/
    }
}
