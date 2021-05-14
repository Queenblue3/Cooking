package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class pollo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pollo);

        Button info = findViewById(R.id.btnatraspollo);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), botones_menu.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageView pas = (ImageView) findViewById(R.id.btnpastapollo);
        pas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pollo.this, sandwitchdepollomanzanaynueces.class);
                startActivity(intent);
            }
        });

        ImageView cre = (ImageView) findViewById(R.id.btncrepapollo);
        cre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pollo.this, crepasdepolloconpimientorojo.class);
                startActivity(intent);
            }
        });

        ImageView pol = (ImageView) findViewById(R.id.btnpollopimineto);
        pol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pollo.this, pollocontomateconsalsadetomate.class);
                startActivity(intent);
            }
        });

        ImageView cal = (ImageView) findViewById(R.id.btncalabacionpollo);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pollo.this, noodlesdecalabazinconpolloyalmendras.class);
                startActivity(intent);
            }
        });
    }
}