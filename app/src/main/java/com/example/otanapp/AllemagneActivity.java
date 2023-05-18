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
    private Button marder;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allemagne_activity);
    }
    public void openActivity2(View view) {
        // Récupérer l'identifiant du bouton cliqué
        int buttonId = view.getId();

        // Déterminer le message personnalisé en fonction du bouton cliqué
        String message;
        if (buttonId == R.id.fennek) {
            Toast.makeText(AllemagneActivity.this, "Votre demande de fennek a ete prise en compte", Toast.LENGTH_SHORT).show();

        } else if (buttonId == R.id.patriot) {
            Toast.makeText(AllemagneActivity.this, "Votre demande de patriot a ete prise en compte", Toast.LENGTH_SHORT).show();

        }else if (buttonId == R.id.sidewinder) {
            Toast.makeText(AllemagneActivity.this, "Votre demande de sidewinder a ete prise en compte", Toast.LENGTH_SHORT).show();
        }else if (buttonId == R.id.marder) {
            Toast.makeText(AllemagneActivity.this, "Votre demande de marder a ete prise en compte", Toast.LENGTH_SHORT).show();
        } else {
            message = "Message personnalisé par défaut";
        }

        // Ouvrir MainActivity2 en lui transmettant le message personnalisé

        Intent intent = new Intent(AllemagneActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}





