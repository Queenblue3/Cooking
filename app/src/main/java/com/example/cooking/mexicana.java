package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class mexicana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexicana);

        Button info = findViewById(R.id.btnatrasmexicano);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), botones_menu.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageView nac = (ImageView) findViewById(R.id.btnnachos);
        nac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mexicana.this, nachosconfrijoles.class);
                startActivity(intent);
            }
        });

        ImageView tac = (ImageView) findViewById(R.id.btntacos);
        tac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mexicana.this, tacosconcarneypimiento.class);
                startActivity(intent);
            }
        });

        ImageView bur = (ImageView) findViewById(R.id.btnburritoss);
        bur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mexicana.this, burritoconpolloypimiento.class);
                startActivity(intent);
            }
        });

        ImageView enc = (ImageView) findViewById(R.id.btnhuevo);
        enc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mexicana.this, enchiladasdepollo.class);
                startActivity(intent);
            }
        });
    }
}