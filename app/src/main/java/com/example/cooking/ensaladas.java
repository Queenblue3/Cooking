package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ensaladas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ensaladas);

        Button info = findViewById(R.id.btnatrasensalada);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), botones_menu.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageView eag = (ImageView) findViewById(R.id.btnensaladaarroz);
        eag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ensaladas.this, ensaladadearrozgarbanzosyzanahoria.class);
                startActivity(intent);
            }
        });

        ImageView eap = (ImageView) findViewById(R.id.btnensaladapasta);
        eap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ensaladas.this, ensaladadearrozconpepinozanahoria.class);
                startActivity(intent);
            }
        });

        ImageView emq = (ImageView) findViewById(R.id.btnensaladamanzana);
        emq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ensaladas.this, ensaladademanzanaquesoyalmendras.class);
                startActivity(intent);
            }
        });

        ImageView egq = (ImageView) findViewById(R.id.btnensaldagarbanzos);
        egq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ensaladas.this, ensaladadegarbanzosconquinoa.class);
                startActivity(intent);
            }
        });
    }
}