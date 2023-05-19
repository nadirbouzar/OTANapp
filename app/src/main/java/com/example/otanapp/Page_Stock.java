package com.example.otanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class Page_Stock extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_stock);
        button1 = (Button) findViewById(R.id.button_france);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page_Stock.this, FranceActivity.class);
                startActivity(intent);

            }
        });
        button2 = (Button) findViewById(R.id.button_etatunis);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page_Stock.this, EuActivity.class);
                startActivity(intent);

            }
        });
        button3 = (Button) findViewById(R.id.button_uk);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page_Stock.this, UkActivity.class);
                startActivity(intent);

            }
        });
        button4 = (Button) findViewById(R.id.button_allemagne);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page_Stock.this, AllemagneActivity.class);
                startActivity(intent);

            }
        });


    }
}