package com.example.intenttest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Button useless_button = findViewById(R.id.button);

        useless_button.setOnClickListener(v -> {
            Intent intent = new Intent(NewsActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
