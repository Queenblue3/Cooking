package com.example.cooking

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_recetaensaldapasta.*

class recetaensaldapasta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recetaensaldapasta)
        val boton = findViewById<Button>(R.id.btnatrasrecetaensaldapasta)
        btnatrasrecetaensaldapasta.setOnClickListener{val intent = Intent(this, fit::class.java)
            startActivity(intent)}


    }

    private fun likeAnimation(imageView: LottieAnimationView,
                              animation: Int,
                              like: Boolean) : Boolean {

        if (!like) {
            imageView.setAnimation(animation)
            imageView.playAnimation()
        } else {
            imageView.animate()
                .alpha(0f)
                .setDuration(200)
                .setListener(object : AnimatorListenerAdapter() {

                    override fun onAnimationEnd(animator: Animator) {

                        imageView.setImageResource(R.drawable.twitter_like)
                        imageView.alpha = 1f
                    }

                })

        }

        return !like
    }

}