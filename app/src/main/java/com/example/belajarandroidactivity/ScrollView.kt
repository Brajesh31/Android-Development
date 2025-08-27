package com.example.belajarandroidactivity

import android.graphics.BlurMaskFilter.Blur
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import jp.wasabeef.glide.transformations.BlurTransformation

class ScrollView : AppCompatActivity() {
    var ivBackgorund:ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)

        ivBackgorund = findViewById(R.id.ivBackground)
        Glide.with(this)
            .load(R.drawable.spark)
            .transform(BlurTransformation(25, 3))
            .into(ivBackgorund!!)
    }
}