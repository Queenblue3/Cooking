package com.example.cooking

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_videos.*

class videos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)

        val avebm = findViewById<Button>(R.id.btnatrasvideosexplicativo)
        avebm.setOnClickListener{val intent = Intent(this, botones_menu::class.java)
            startActivity(intent)}


        val video1 = findViewById<Button>(R.id.video1)
        video1.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=lGRGZTwZinU"))
            startActivity(i)
        }

        val video2 = findViewById<Button>(R.id.video2)
        video2.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=HFMnn7L8Rv8"))
            startActivity(i)
        }

        val video3 = findViewById<Button>(R.id.video3)
        video3.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Zi92CslLaQc"))
            startActivity(i)
        }

        val video4 = findViewById<Button>(R.id.video4)
        video4.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dg1l4Ff_-hQ"))
            startActivity(i)
        }

        val video5 = findViewById<Button>(R.id.video5)
        video5.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jxka50ZzY8o"))
            startActivity(i)
        }

        val video6 = findViewById<Button>(R.id.video6)
        video6.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Tdf6dJnV8sc"))
            startActivity(i)
        }

        val video7 = findViewById<Button>(R.id.video7)
        video7.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=3m9lV9jnWTM"))
            startActivity(i)
        }

        val video8 = findViewById<Button>(R.id.video8)
        video8.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=h_5kSvsCo3E"))
            startActivity(i)
        }

        val video9 = findViewById<Button>(R.id.video9)
        video9.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=KN1LRiDiPqI"))
            startActivity(i)
        }

        val video10 = findViewById<Button>(R.id.video10)
        video10.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=0WaoBtQFbx0"))
            startActivity(i)
        }
    }
}