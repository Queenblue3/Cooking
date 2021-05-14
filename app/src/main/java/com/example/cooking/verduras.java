package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class verduras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verduras);

        Button info = findViewById(R.id.btnatrasverduras);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), botones_menu.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageView mac = (ImageView) findViewById(R.id.btnmaca);
        mac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verduras.this, carpaccciodetomate.class);
                startActivity(intent);
            }
        });

        ImageView pas = (ImageView) findViewById(R.id.btnpasta);
        pas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verduras.this, pastadeespelta.class);
                startActivity(intent);
            }
        });

        ImageView cur = (ImageView) findViewById(R.id.btncurry);
        cur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verduras.this, currydegarbanzos.class);
                startActivity(intent);
            }
        });

        ImageView bro = (ImageView) findViewById(R.id.ibtnsopabrocoli);
        bro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verduras.this, sopadeborcoli.class);
                startActivity(intent);
            }
        });
    }
}