package com.example.otanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button login ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //TextView  ID = (TextView) findViewById(R.id.ID);
        //TextView password = (TextView) findViewById(R.id.password);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            Button login = findViewById(R.id.login);

            public void onClick(View v) {
                // Navigate to the second activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}


   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView  ID = (TextView) findViewById(R.id.ID);
        TextView password = (TextView) findViewById(R.id.password);

        Button login = findViewById(R.id.login);

        //ID : userA et password : alibaba123


        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //if (ID.getText().toString().equals("userA") && password.getText().toString().equals("alibaba123")) {
                    //correct
                    //Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                //}else
                    //incorrect
                    //Toast.makeText(MainActivity.this, "LOGIN UNSUCCESSFULL", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(MainActivity.this, HomeFragment.class);
                //startActivity(intent);
            }
        });

    }
}*/
