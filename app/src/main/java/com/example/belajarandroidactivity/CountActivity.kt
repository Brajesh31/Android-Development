package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.myapplication.R.layout.activity_count)

        //buat variable untuk menampung id
        var tvNumber:TextView = findViewById(com.example.myapplication.R.id.tvNumber)
        val btnCount:Button = findViewById(com.example.myapplication.R.id.buttonCount)
        val btnReset:Button = findViewById(com.example.myapplication.R.id.buttonReset)
        val btnMin:Button = findViewById(com.example.myapplication.R.id.buttonMin)

        tvNumber.text = "0"
        println(tvNumber.text)

        Log.d("Number", "Hasilnya:  ${tvNumber.text}")

        btnCount.setOnClickListener {
            //bikin variable nilainya berubah
            //ambil text lalu convert dari string ke int

            var countInteger:Int =tvNumber.text.toString().toInt()
            var countInteger2:Int =tvNumber.text.toString().toInt()

            //biar nambah 1
            countInteger++


            tvNumber.text = countInteger.toString()
        }

        btnReset.setOnClickListener {
            var countInteger3:Int =tvNumber.text.toString().toInt()
            //biar ke reset
            tvNumber.text = "0"
        }
        btnMin.setOnClickListener {
            var countInteger3:Int =tvNumber.text.toString().toInt()
            //biar ngurang
            countInteger3--
            tvNumber.text = countInteger3.toString()
        }
    }
}