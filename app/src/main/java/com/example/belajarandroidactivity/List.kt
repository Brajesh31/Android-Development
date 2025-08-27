package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.R

class List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        //define array adapter
        val arrayAdapter:ArrayAdapter<*>
        val users = arrayOf(
            "Steve Smith", "Ross Taylor", "Sharma Rohit"
        )
        //deklarasi variabel listview
        var mListView:ListView = findViewById(R.id.lvNama)

        //panggil object ArrayAdapter(this, layput_sample, data)
        arrayAdapter = ArrayAdapter(this,
                                    android.R.layout.simple_list_item_1,
                                    users)

        //isi adapter
        mListView.adapter = arrayAdapter
    }
}