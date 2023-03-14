package com.agn.hw1_month3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {

    private EditText surName;
    private MaterialButton next;
    public TextView second;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        secondID();
        secondListener();
    }

    private void secondID(){
        setContentView(R.layout.activity_second);
        surName = findViewById(R.id.secondSurName);
        next = findViewById(R.id.secondNext);
        second = findViewById(R.id.textViewSecond);
        second.setText(getIntent().getStringExtra("name"));
    }

    private void secondListener() {
        next.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            String surName = ((EditText) findViewById(R.id.secondSurName)).getText().toString();
            String surName2 = ((TextView) findViewById(R.id.textViewSecond)).getText().toString();
            intent.putExtra("name", surName2);
            intent.putExtra("surName", surName);
            startActivity(intent);
        });
    }
}