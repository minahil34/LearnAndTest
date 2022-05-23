package com.example.learnandtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);
        Button b1=findViewById(R.id.repo);
        b1.setOnClickListener(view -> {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/minahil34/MC_SE_F19"));
            startActivity(myIntent);
        });
    }
}