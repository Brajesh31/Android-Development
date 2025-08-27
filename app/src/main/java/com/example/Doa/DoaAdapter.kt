package com.example.Doa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class DoaAdapter(val data: ArrayList<Doa>)
    :RecyclerView.Adapter<DoaAdapter.DoaViewHolder>(){
    class DoaViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvListDoa: TextView = view.findViewById(R.id.tvListDoa)
        val ivDoa: ImageView = view.findViewById(R.id.ivdoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doa,parent,false)
        return DoaViewHolder(view)
    }

    override fun getItemCount():Int {
        return data.size
    }

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvListDoa.text = item.judulDoa
        holder.ivDoa.setImageResource(item.Gambar)
    }
}