package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class botones_menu : AppCompatActivity() {
    private lateinit var txtbienvenido : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones_menu)

        txtbienvenido  = findViewById(R.id.txtbienvenido)
        val saludo = intent.getStringExtra("NOMBRE")
        txtbienvenido.text = "Hola, bienvenido $saludo"

        val boton = findViewById<Button>(R.id.btnfit)
        boton.setOnClickListener{val intent = Intent(this, fit::class.java)
            startActivity(intent)}

        val des = findViewById<Button>(R.id.btndesa)
        des.setOnClickListener{val intent = Intent(this, desayunos::class.java)
            startActivity(intent)}

        val pos = findViewById<Button>(R.id.btnpostre)
        pos.setOnClickListener{val intent = Intent(this, postres::class.java)
            startActivity(intent)}

        val ver = findViewById<Button>(R.id.btnverdu)
        ver.setOnClickListener{val intent = Intent(this, verduras::class.java)
            startActivity(intent)}

        val asi = findViewById<Button>(R.id.btnasia)
        asi.setOnClickListener{val intent = Intent(this, asiaticas::class.java)
            startActivity(intent)}

        val pic = findViewById<Button>(R.id.btnmexi)
        pic.setOnClickListener{val intent = Intent(this, mexicana::class.java)
            startActivity(intent)}

        val polo = findViewById<Button>(R.id.btnpollo)
        polo.setOnClickListener{val intent = Intent(this, pollo::class.java)
            startActivity(intent)}

        val ens = findViewById<Button>(R.id.btnensa)
        ens.setOnClickListener{val intent = Intent(this, ensaladas::class.java)
            startActivity(intent)}

        val beb = findViewById<Button>(R.id.btnbebi)
        beb.setOnClickListener{val intent = Intent(this, bebidas::class.java)
            startActivity(intent)}

        val otr = findViewById<Button>(R.id.btnotro)
        otr.setOnClickListener{val intent = Intent(this, otros::class.java)
            startActivity(intent)}

        val vid = findViewById<Button>(R.id.btnvideos)
        vid.setOnClickListener{val intent = Intent(this, videos::class.java)
            startActivity(intent)}

        val cam = findViewById<Button>(R.id.btnresultados)
        cam.setOnClickListener{val intent = Intent(this, camara::class.java)
            startActivity(intent)}
    }
}