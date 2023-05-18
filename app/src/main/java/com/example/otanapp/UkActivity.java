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
    private Button seaking;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uk_activity);
    }
        public void openActivity2(View view) {
            // Récupérer l'identifiant du bouton cliqué
            int buttonId = view.getId();

            // Déterminer le message personnalisé en fonction du bouton cliqué
            String message;
            if (buttonId == R.id.challenger2) {
                message = "Votre demande de challenger2 a ete prise en compte";
            } else if (buttonId == R.id.seaking) {
                message = "Votre demande de seaking a ete prise en compte";
            }else if (buttonId == R.id.munitions) {
                message = "Votre demande de munitions a ete prise en compte";
            }else if (buttonId == R.id.m270mlrs) {
                message = "Votre demande de m270mlrs a ete prise en compte";
            } else {
                message = "Message personnalisé par défaut";
            }

            // Ouvrir MainActivity2 en lui transmettant le message personnalisé
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("message", message);
            startActivity(intent);
        }
    }





