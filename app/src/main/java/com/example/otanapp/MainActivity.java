package com.example.otanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView  ID = (TextView) findViewById(R.id.ID);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton login = (MaterialButton) findViewById(R.id.login);

        //ID : userA et password : alibaba123

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (ID.getText().toString().equals("userA") && password.getText().toString().equals("alibaba123")) {
                    //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this, "LOGIN UNSUCCESSFULL", Toast.LENGTH_SHORT).show();
            }
        });

    }
}