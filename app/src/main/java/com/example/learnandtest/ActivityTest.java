package com.example.learnandtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Button b= findViewById(R.id.play);
        b.setOnClickListener(view ->
        {
            Intent intent=new Intent(ActivityTest.this,ActivityPlay.class);
            startActivity(intent);
        });

    }
}