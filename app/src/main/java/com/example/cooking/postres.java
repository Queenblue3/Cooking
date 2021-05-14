package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class postres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres);


        Button info = findViewById(R.id.btnatraspostres);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), botones_menu.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageView tar = (ImageView) findViewById(R.id.btntarta);
        tar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(postres.this, tardtadearandanos.class);
                startActivity(intent);
            }
        });

        ImageView man = (ImageView) findViewById(R.id.btnmanzana);
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(postres.this, manzanasalhorno.class);
                startActivity(intent);
            }
        });

        ImageView roc = (ImageView) findViewById(R.id.btnroca);
        roc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(postres.this, rocasdechocolate.class);
                startActivity(intent);
            }
        });

        ImageView hel = (ImageView) findViewById(R.id.btnhelado);
        hel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(postres.this, heladodelimon.class);
                startActivity(intent);
            }
        });
    }
}