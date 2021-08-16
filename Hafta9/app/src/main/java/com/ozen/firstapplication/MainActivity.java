package com.ozen.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        textview= findViewById(R.id.textView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setBackgroundColor(Color.BLUE);
                textview.setText("Hello");
                textview.setBackgroundColor(Color.BLACK);
                textview.setTextColor(Color.RED);
                textview.setTextSize(150);
            }
        }
        );
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sayfa2 = new Intent(getApplicationContext(), Activity2.class);
                startActivity(sayfa2);
            }
        });

    }
}