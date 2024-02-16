package com.example.avd01

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startAvd(R.id.avd)
        startAvd(R.id.avd2)
    }

    fun startAvd(id: Int) {
        val imageView = findViewById<ImageView>(id);
        val avd = imageView.drawable as AnimatedVectorDrawable;
        avd.start();
    }
}