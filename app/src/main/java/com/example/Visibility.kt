package com.example

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class Visibility : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visibility)
        val tvText: TextView = findViewById(R.id.tvText)
        val btnClick: Button = findViewById(R.id.btnClick)

        //event click
        btnClick.setOnClickListener {
            if (tvText.visibility == View.VISIBLE)
            //ngubah text jadi visible
                tvText.visibility = View.INVISIBLE
            else {
                tvText.visibility = View.VISIBLE
            }
        }
    }
}