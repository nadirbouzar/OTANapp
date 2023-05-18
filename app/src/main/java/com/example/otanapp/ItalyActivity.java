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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.italy_activity);
    }
    public void openActivity2(View view) {
        // Récupérer l'identifiant du bouton cliqué
        int buttonId = view.getId();

        // Déterminer le message personnalisé en fonction du bouton cliqué
        String message;
        if (buttonId == R.id.mamba) {
            message = "Votre demande de mamba a ete prise en compte";
        } else if (buttonId == R.id.stinger) {
            message = "Votre demande de stinger a ete prise en compte";
        }else if (buttonId == R.id.berreta) {
            message = "Votre demande de berreta a ete prise en compte";
        }else {
            message = "Message personnalisé par défaut";
        }

        // Ouvrir MainActivity2 en lui transmettant le message personnalisé

        Intent intent = new Intent(ItalyActivity.this, MainActivity2.class);
        intent.putExtra("message", message);
        startActivity(intent);


    }
}

