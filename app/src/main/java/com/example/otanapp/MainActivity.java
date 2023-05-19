package com.example.otanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import android.widget.Button;
import android.content.Intent;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView  ID = (TextView) findViewById(R.id.ID);
        TextView password = (TextView) findViewById(R.id.password);

         login =  findViewById(R.id.login);

        //ID : userA et password : alibaba123

        login.setOnClickListener(new View.OnClickListener(){
            Button login = findViewById(R.id.login);
            @Override
            public void onClick(View v) {
                if (ID.getText().toString().equals("France") && password.getText().toString().equals("france12")||ID.getText().toString().equals("EU") && password.getText().toString().equals("eu34")||ID.getText().toString().equals("Allemagne") && password.getText().toString().equals("allemagne56")||ID.getText().toString().equals("UK") && password.getText().toString().equals("uk78")||ID.getText().toString().equals("Italie") && password.getText().toString().equals("italie90")||ID.getText().toString().equals("Ukraine") && password.getText().toString().equals("ukraine99")) {
                    //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);

                }//else
                    //incorrect
                    //Toast.makeText(MainActivity.this, "LOGIN UNSUCCESSFULL", Toast.LENGTH_SHORT).show();
            }



        });


    }
}