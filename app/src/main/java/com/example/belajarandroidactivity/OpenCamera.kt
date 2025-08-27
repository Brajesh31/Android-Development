package com.example.belajarandroidactivity

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView
import com.example.myapplication.R

class OpenCamera : AppCompatActivity() {
    //deklarasi variable
    var ibCamera:ImageButton? = null
    var ivSample:ImageView? = null
    var pic_id = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_camera)

        //isi data pake findviewbyid()
        ibCamera = findViewById(R.id.ibCamera)
        ivSample = findViewById(R.id.ivSample)

        //action ketika image camera di click
        ibCamera!!.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, pic_id)
        }
    }
    //function kedua
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == pic_id){
            val photo: Any? = data?.extras?.get("data") as Bitmap
            ivSample?.setImageBitmap(photo as Bitmap?)
        }
    }
}