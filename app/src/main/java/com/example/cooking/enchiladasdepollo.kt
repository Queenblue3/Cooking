package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class enchiladasdepollo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enchiladasdepollo)
        val boton = findViewById<Button>(R.id.btnatrasrecetaensaldapasta)
        boton.setOnClickListener{val intent = Intent(this, mexicana::class.java)
            startActivity(intent)}
    }
}