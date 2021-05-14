package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class bebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        Button info = findViewById(R.id.btnatrasbebidas);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), botones_menu.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageView baf = (ImageView) findViewById(R.id.btnbatidoverde);
        baf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bebidas.this, batidodearandanosfresasyavena.class);
                startActivity(intent);
            }
        });

        ImageView apj = (ImageView) findViewById(R.id.btnzumozanahoria);
        apj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bebidas.this, aguadepepinoyjengibre.class);
                startActivity(intent);
            }
        });

        ImageView fcc = (ImageView) findViewById(R.id.btnbatidozanahoria);
        fcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bebidas.this, frappedecafeconchocolate.class);
                startActivity(intent);
            }
        });

        ImageView sfp = (ImageView) findViewById(R.id.btnsmoothie);
        sfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bebidas.this, smoothiedefresaypina.class);
                startActivity(intent);
            }
        });
    }
}