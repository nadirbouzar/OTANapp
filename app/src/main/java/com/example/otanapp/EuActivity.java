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
    }
    public void openActivity2(View view) {
        // Récupérer l'identifiant du bouton cliqué
        int buttonId = view.getId();

        // Déterminer le message personnalisé en fonction du bouton cliqué
        String message;
        if (buttonId == R.id.f35) {
            Toast.makeText(EuActivity.this, "Votre demande de f35 a ete prise en compte", Toast.LENGTH_SHORT).show();
        } else if (buttonId == R.id.himars) {
            Toast.makeText(EuActivity.this, "Votre demande de himars a ete prise en compte", Toast.LENGTH_SHORT).show();
        }else if (buttonId == R.id.stryker) {
            Toast.makeText(EuActivity.this, "Votre demande de stryker a ete prise en compte", Toast.LENGTH_SHORT).show();
        }else if (buttonId == R.id.predator) {
            Toast.makeText(EuActivity.this, "Votre demande de predator a ete prise en compte", Toast.LENGTH_SHORT).show();
        } else {
            message = "Message personnalisé par défaut";
        }

        // Ouvrir MainActivity2 en lui transmettant le message personnalisé
        Intent intent = new Intent(EuActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}







