package com.naulepilef.heads_or_tails

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var imagePlay: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagePlay = findViewById(R.id.image_play)

        imagePlay.setOnClickListener {
            val intent = Intent(applicationContext, PlayActivity::class.java)

            startActivity(intent)
        }
    }
}