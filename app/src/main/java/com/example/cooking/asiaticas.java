package com.example.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class asiaticas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asiaticas);

        Button info = findViewById(R.id.btnatrasasiaticos);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), botones_menu.class);
                startActivityForResult(intent, 0);
            }
        });

        ImageView lan = (ImageView) findViewById(R.id.btnlangostinos);
        lan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(asiaticas.this, langostinosarrozyjudiasverdes.class);
                startActivity(intent);
            }
        });

        ImageView arr = (ImageView) findViewById(R.id.btnarrozfrito);
        arr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(asiaticas.this, arrozfritoconternera.class);
                startActivity(intent);
            }
        });

        ImageView sal = (ImageView) findViewById(R.id.btnsalteado);
        sal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(asiaticas.this, salteadodepavobrocoliypimiento.class);
                startActivity(intent);
            }
        });

        ImageView pav = (ImageView) findViewById(R.id.btnpavo);
        pav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(asiaticas.this, noodlesconpavoypimiento.class);
                startActivity(intent);
            }
        });
    }
}