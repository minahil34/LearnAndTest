package com.example.learnandtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class GoOn2 extends AppCompatActivity implements View.OnClickListener {
    RadioButton r1, r2, r3;
    Button v1,n,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        r1 = findViewById(R.id.op1);
        r1.setOnClickListener(this);
        r2 = findViewById(R.id.op2);
        r2.setOnClickListener(this);
        r3 = findViewById(R.id.op3);
        r3.setOnClickListener(this);
        v1=findViewById(R.id.textV);
        b=findViewById(R.id.back);
        b.setOnClickListener(view -> {
            Intent intent= new Intent(GoOn2.this,ActivityPlay.class);
            startActivity(intent);
        });
    }



    public void onClick(View v)
    {
        switch(v.getId()){
            case R.id.op1:
                if(r1.isChecked()) {
                    v1.setText("wrong");
                }
                break;
            case R.id.op2:
                if(r2.isChecked())
                    v1.setText("correct");
                break;

            case R.id.op3:
                if(r3.isChecked())
                    v1.setText("wrong");
        }

    }
}
