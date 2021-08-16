package com.ozen.kayitol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button kaydet, duzenle;
    TextView kayitBasarili;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kaydet = findViewById(R.id.kaydet);
        duzenle = findViewById(R.id.duzenle);
        kayitBasarili = findViewById(R.id.kayitBasarili);

        kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kayitBasarili.setText("Kayıt Başarılı");

            }
        });

        duzenle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent duzenle = new Intent(getApplicationContext(), Duzenle.class);
                startActivity(duzenle);
            }
        });


    }
}