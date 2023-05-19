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
    }
    public void openActivity2(View view) {
        // Récupérer l'identifiant du bouton cliqué
        int buttonId = view.getId();

        // Déterminer le message personnalisé en fonction du bouton cliqué
        String message;
        if (buttonId == R.id.canon) {
            message = "Votre demande de canon a ete prise en compte";
        } else if (buttonId == R.id.amx10rc) {
            message = "Votre demande de amx10rc a ete prise en compte";
        }else if (buttonId == R.id.milan) {
            message = "Votre demande de milan a ete prise en compte";
        }else if (buttonId == R.id.Tigre) {
            message = "Votre demande de Tigre a ete prise en compte";
        } else {
            message = "Message personnalisé par défaut";
        }

        // Ouvrir MainActivity2 en lui transmettant le message personnalisé
        Intent intent = new Intent(FranceActivity.this, QuantiteActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}







