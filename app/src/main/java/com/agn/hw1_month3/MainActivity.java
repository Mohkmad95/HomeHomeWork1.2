package com.agn.hw1_month3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.agn.homework12.R;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private MaterialButton next;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initID();
        initListener();
    }

    private void initListener() {
        next.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            String name1 = ((EditText) findViewById(R.id.mainName)).getText().toString();
            intent.putExtra("name", name1);
            startActivity(intent);
        });
    }

    private void initID() {
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.mainNext);
    }
}
