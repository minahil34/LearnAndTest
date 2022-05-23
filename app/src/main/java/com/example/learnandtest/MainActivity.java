package com.example.learnandtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 =findViewById(R.id.learn);
        b1.setOnClickListener(v -> openActivity2());
        Button b2= findViewById(R.id.test);
        b2.setOnClickListener(v -> {
            Intent intent= new Intent(MainActivity.this,ActivityTest.class);
            startActivity(intent);
        });
        Button b3= findViewById(R.id.link);
        b3.setOnClickListener(v -> {
            Intent intent= new Intent(MainActivity.this,ActivityLink.class);
            startActivity(intent);
        });
    }
        public void openActivity2() {
            Intent intent= new Intent(this,MainActivity2.class);
            startActivity(intent);
        }


    }


