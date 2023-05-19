package com.example.otanapp;

import android.os.Bundle;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import android.widget.Button;
import android.content.Intent;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ValidationActivity  extends AppCompatActivity {
    private Button accueil;
    private Button revenir;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
    }

    public void openActivity2(View view) {
        // Récupérer l'identifiant du bouton cliqué
        int buttonId = view.getId();

        // Déterminer le message personnalisé en fonction du bouton cliqué
        String message;
        if (buttonId == R.id.accueil) {
            Intent intent = new Intent(ValidationActivity.this, MainActivity2.class);
            startActivity(intent);
        } else if (buttonId == R.id.revenir) {
            Intent intent = new Intent(ValidationActivity.this, ListFragment.class);
            startActivity(intent);
        }
    }
}
