package com.example.cooking

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.net.Uri
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var txtNombre : EditText
    private lateinit var btnregistro : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNombre = findViewById(R.id.txtNombre)
        val boton = findViewById<Button>(R.id.btningresar)
        boton.setOnClickListener{
            val intent = Intent(this, botones_menu::class.java)
            intent.putExtra("NOMBRE", txtNombre.text.toString())
            startActivity(intent)
        }

        btnregistro = findViewById(R.id.btnregistro)
        btnregistro.setOnClickListener {
            val intent = Intent(this@MainActivity, resgitro::class.java)
            startActivity(intent)
        }

        val paginaf = findViewById<Button>(R.id.btnface)
        paginaf.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nooddleapp/"))
            startActivity(i)
        }

        val paginat = findViewById<Button>(R.id.btntwitter)
        paginat.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Nooddle_app?s=09"))
            startActivity(i)
        }

        val paginai = findViewById<Button>(R.id.btninsta)
        paginai.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/nooddle_app_?igshid=3pzwsckeqzaj"))
            startActivity(i)
        }

    }


}
