package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class resgitro : AppCompatActivity() {
    private lateinit var txtname : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resgitro)

        txtname = findViewById(R.id.txtname)
        val boton = findViewById<Button>(R.id.inicio)
        boton.setOnClickListener{
            val intent = Intent(this, botones_menu::class.java)
            intent.putExtra("NOMBRE", txtname.text.toString())
            startActivity(intent)
        }

    }
}