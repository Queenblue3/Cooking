package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class desayunos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desayunos);

        Button info = findViewById(R.id.btnatrasdesayunos);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), botones_menu.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageView arr = (ImageView) findViewById(R.id.btnbowlarroz);
        arr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(desayunos.this, bowldearrozconyogur.class);
                startActivity(intent);
            }
        });

        ImageView cre = (ImageView) findViewById(R.id.btncrepe);
        cre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(desayunos.this, crepas.class);
                startActivity(intent);
            }
        });

        ImageView tor = (ImageView) findViewById(R.id.btntorti);
        tor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(desayunos.this, tortilladeespinaca.class);
                startActivity(intent);
            }
        });

        ImageView biz = (ImageView) findViewById(R.id.btnbiso);
        biz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(desayunos.this, bizcohodeyoyur.class);
                startActivity(intent);
            }
        });
    }
}