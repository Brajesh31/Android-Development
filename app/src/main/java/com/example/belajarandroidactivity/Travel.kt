package com.example.belajarandroidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.myapplication.R

class Travel : AppCompatActivity() {

    //? artinya boleh kosong
    var ibNavigate:ImageButton? = null
    var ibShare:ImageButton? = null
    var ibCall:ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
        ibCall = findViewById(R.id.ibCall)
        ibNavigate = findViewById(R.id.ibNavigate)
        ibShare = findViewById(R.id.ibShare)

        ibCall!!.setOnClickListener {
            //untuk telpon
            val phoneNumber="025-7684-86843"
            val phoneIntent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel: $phoneNumber"))
            //jalankan intent
            startActivity(phoneIntent)
        }
        ibNavigate!!.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:-6.514580514151494, 106.7914720808927")
            )
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        ibShare!!.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            startActivity(Intent.createChooser(shareIntent, "Share to: "))
        }
    }
}