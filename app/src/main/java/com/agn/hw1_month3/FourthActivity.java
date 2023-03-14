package com.agn.hw1_month3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class FourthActivity extends AppCompatActivity {
    public TextView result;
    private TextView resultCenter;
    private TextView resultBottom;
    private MaterialButton end;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fourthID();
        end.setOnClickListener(view -> finishAffinity());
    }
    private void fourthID(){
        setContentView(R.layout.activity_fough);
        result = findViewById(R.id.fourthResult);
        end = findViewById(R.id.fourthEnd);
        resultCenter = findViewById(R.id.fourthCenter);
        resultBottom = findViewById(R.id.fourthBottom);
        result.setText(getIntent().getStringExtra("third"));
        resultCenter.setText(getIntent().getStringExtra("third2"));
        resultBottom.setText(getIntent().getStringExtra("age"));
    }
}