package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class fit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fit);

        Button info = findViewById(R.id.btnatras);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), botones_menu.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageView imageView = (ImageView) findViewById(R.id.btnensalada);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fit.this, recetaensaldapasta.class);
                startActivity(intent);
            }
        });

        ImageView pol = (ImageView) findViewById(R.id.btnbowl);
        pol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fit.this, arrozconpollo.class);
                startActivity(intent);
            }
        });

        ImageView bur = (ImageView) findViewById(R.id.btnburrito);
        bur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fit.this, burritoconhuevo.class);
                startActivity(intent);
            }
        });

        ImageView hue = (ImageView) findViewById(R.id.btntostada);
        hue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fit.this, tostadasdehuevoconaguacate.class);
                startActivity(intent);
            }
        });
    }
}