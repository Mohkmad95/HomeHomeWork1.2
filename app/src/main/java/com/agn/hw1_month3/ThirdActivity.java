package com.agn.hw1_month3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class ThirdActivity extends AppCompatActivity {
    private EditText age;
    private MaterialButton next;
    private TextView third;
    private TextView third2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        thirdID();
        thirdListener();
    }

    private void thirdID(){
        setContentView(R.layout.activity_third);
        age = findViewById(R.id.thirdAge);
        next = findViewById(R.id.thirdNext);
        third = findViewById(R.id.textViewThird);
        third2 = findViewById(R.id.textViewThird1);
        third.setText(getIntent().getStringExtra("surName"));
        third2.setText(getIntent().getStringExtra("name"));
    }

    private void thirdListener(){
        next.setOnClickListener(view -> {
            Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
            String age = ((EditText) findViewById(R.id.thirdAge)).getText().toString();
            String age2= ((TextView) findViewById(R.id.textViewThird)).getText().toString();
            String age3 = ((TextView) findViewById(R.id.textViewThird1)).getText().toString();
            intent.putExtra("age",age);
            intent.putExtra("third",age2);
            intent.putExtra("third2",age3);
            startActivity(intent);
        });
    }
}