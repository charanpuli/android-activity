package com.example.charanpuli.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class activity2 extends AppCompatActivity {
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Intent i=getIntent();
        String x=Integer.toString(i.getIntExtra("sb",0));
        String y=Float.toString(i.getFloatExtra("rb",0));
        e1=(EditText)findViewById(R.id.editText2);
        e2=(EditText)findViewById(R.id.editText);
        e2.setText(x);
        e1.setText(y);

    }
}