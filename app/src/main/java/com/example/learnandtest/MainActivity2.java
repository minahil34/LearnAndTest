package com.example.learnandtest;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b1,b2,b3,b4,b5,b6,b7,b8;
        b1=findViewById(R.id.A);

        b2=findViewById(R.id.B);
        b3=findViewById(R.id.C);
        b4=findViewById(R.id.D);
        b5=findViewById(R.id.E);
        b6=findViewById(R.id.F);
        b7=findViewById(R.id.G);
        b8=findViewById(R.id.H);
        b1.setOnClickListener(v -> {
            Intent intent= new Intent(MainActivity2.this, ActivityA.class);
            startActivity(intent);
        });
        b2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this,ActivityB.class);
            startActivity(intent);
        });
        b2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this,ActivityB.class);
            startActivity(intent);
        });
        b3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this,ActivityC.class);
            startActivity(intent);
        });
        b4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this,ActivityD.class);
            startActivity(intent);
        });
        b5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this,ActivityE.class);
            startActivity(intent);
        });
        b6.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this,ActivityF.class);
            startActivity(intent);
        });
        b7.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this,ActivityG.class);
            startActivity(intent);
        });
        b8.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this,ActivityH.class);
            startActivity(intent);
        });



    }


}