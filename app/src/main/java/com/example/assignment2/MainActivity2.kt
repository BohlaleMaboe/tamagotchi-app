package com.example.assignment2

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.core.content.ContextCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id .button3)
        val button4 = findViewById<Button>(R.id.button4)
        val progressBar1 = findViewById<ProgressBar>(R.id.progressBar)
        val progressBar2 = findViewById<ProgressBar>(R.id.progressBar2)
        val progressBar3 = findViewById<ProgressBar>(R.id.progressBar3)

        progressBar1.progressTintList = ColorStateList.valueOf(ContextCompat.getColor(this,androidx.constraintlayout.widget.R.color.abc_decor_view_status_guard))
        progressBar2.progressTintList = ColorStateList.valueOf(ContextCompat.getColor(this,androidx.constraintlayout.widget.R.color.abc_decor_view_status_guard))
        progressBar3.progressTintList = ColorStateList.valueOf(ContextCompat.getColor(this,androidx.constraintlayout.widget.R.color.abc_decor_view_status_guard))

        button2.setOnClickListener {
            imageView.setImageResource(R.drawable.dog_eating)
            progressBar1.progress += 20

            if (progressBar1.progress > progressBar1.max) {
                progressBar1.progress = progressBar1.max
            }
        button3.setOnClickListener{
            imageView.setImageResource(R.drawable.dog_bathing)
            progressBar2.progress += 20
            if (progressBar2.progress > progressBar2.max) {
                progressBar2.progress = progressBar2.max
            }

            button4.setOnClickListener{
                imageView.setImageResource(R.drawable.dog_playing)
                progressBar3.progress += 20
                if (progressBar3.progress > progressBar3.max){
                    progressBar3.progress = progressBar3.max
                }
            }
            }
        }
    }
}