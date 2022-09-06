package com.naulepilef.heads_or_tails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlin.random.Random

class PlayActivity : AppCompatActivity() {
    private lateinit var imageCoin: ImageView
    private lateinit var imageBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        imageCoin = findViewById(R.id.image_coin)
        imageBack = findViewById(R.id.image_back)

        imageBack.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()

        if (isHeads()) imageCoin.setImageResource(R.drawable.moeda_cara)
        else imageCoin.setImageResource(R.drawable.moeda_coroa)
    }

    private fun isHeads(): Boolean{
//        return Random.nextBoolean()
        return randomNumber() == 0
    }

    private fun randomNumber(start: Int = 0, end: Int = 1): Int{
        return Random(System.nanoTime()).nextInt(end - start + 1) + start
    }
}