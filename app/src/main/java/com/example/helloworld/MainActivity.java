package com.example.helloworld;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        TextView textView = new TextView(this);
        textView.setText("Hello World");
        textView.setTextSize(24f);
        textView.setPadding(32, 32, 32, 32);

        setContentView(textView);
    }
}