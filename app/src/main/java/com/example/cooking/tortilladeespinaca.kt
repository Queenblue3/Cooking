package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tortilladeespinaca : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tortilladeespinaca)
        val boton = findViewById<Button>(R.id.btnatrasrecetaensaldapasta)
        boton.setOnClickListener{val intent = Intent(this,desayunos::class.java)
            startActivity(intent)}
    }
}