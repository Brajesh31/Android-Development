package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.Doa.DashboardDoa
import com.example.myapplication.R

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //panggl object handler dari package os
        //fungsi postDelayed = menjalankan action
        Handler().postDelayed({
            val intent = Intent(this, DashboardDoa::class.java)
            startActivity(intent)
        }, 2000)
    }
}