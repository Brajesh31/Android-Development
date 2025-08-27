package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adapter.LanguageAdapter
import com.example.model.Language
import com.example.myapplication.R

class ListPemrograman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman2)
        val rvBahasaPemrograman:RecyclerView = findViewById(R.id.rvbahasaPemrograman)
        val data = arrayListOf<Language>(
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.cplus),
            Language("Python", R.drawable.python),
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.cplus),
            Language("Python", R.drawable.python),
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.cplus),
            Language("Python", R.drawable.python)
        )
        //variabel untuk menampung adapter
        val adapter = LanguageAdapter(data)

        //pake adapter pada recycler view
        rvBahasaPemrograman.adapter = adapter

        //biar layout vertical
        rvBahasaPemrograman.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}