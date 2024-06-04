package com.example.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameTextView = findViewById(R.id.nama);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        nameTextView.setText("Nama: " + name);
    }
}