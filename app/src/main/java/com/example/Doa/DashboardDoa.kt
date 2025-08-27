package com.example.Doa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.DoaHarianActivity
import com.example.myapplication.R

class DashboardDoa : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)

        val rvlistDoa: RecyclerView = findViewById(R.id.listDoa)
        val data = arrayListOf<Doa>(
            Doa("Doa \norangtua", R.drawable.doa_harian2),
            Doa("Doa \ntidur", R.drawable.doa_harian2),
            Doa("Doa \nmakan", R.drawable.doa_harian2),
            Doa("Doa \nazan", R.drawable.doa_harian2),
            Doa("Doa \nduha", R.drawable.doa_harian2),
            Doa("Doa \nbelajar", R.drawable.doa_harian2),
            Doa("Doa \nmajelis", R.drawable.doa_harian2),
            Doa("Doa \ntahajud", R.drawable.doa_harian2),
        )
        val btnSelengkapnya: Button = findViewById(R.id.btnSelengkapnya)

        val adapter = DoaAdapter(data)
        rvlistDoa.adapter = adapter
        rvlistDoa.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        btnSelengkapnya.setOnClickListener {
            val intent = Intent(this, DoaHarianActivity::class.java)
            startActivity(intent)
        }
    }
}