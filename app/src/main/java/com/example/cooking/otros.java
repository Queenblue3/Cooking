package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class otros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otros);

        Button info = findViewById(R.id.btnatrasotros);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), botones_menu.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageView lbs = (ImageView) findViewById(R.id.btnlasana);
        lbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(otros.this, lasanadeberenjenaconsojatexturizada.class);
                startActivity(intent);
            }
        });

        ImageView hbz = (ImageView) findViewById(R.id.btnhambur);
        hbz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(otros.this, hamburguesasdebrocolizanahoriaycalabacin.class);
                startActivity(intent);
            }
        });

        ImageView gaz= (ImageView) findViewById(R.id.btngalletas);
        gaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(otros.this, galletasdeavenazanahoriayjengibre.class);
                startActivity(intent);
            }
        });

        ImageView eap= (ImageView) findViewById(R.id.btnespagueti);
        eap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(otros.this, espaguetisconalbondigasdepavo.class);
                startActivity(intent);
            }
        });
    }
}