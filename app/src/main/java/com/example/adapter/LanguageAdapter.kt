package com.example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.model.Language
import com.example.myapplication.R

class LanguageAdapter (val data:ArrayList<Language>)
    :RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>(){
    class LanguageViewHolder(view:View):RecyclerView.ViewHolder(view){
        val tvPemrograman:TextView = view.findViewById(R.id.tvPemrograman)
        val ivBahasaPemrograman:ImageView = view.findViewById(R.id.ivBahasaPemrograman)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bahasa_pemrograman2,parent,false)
            return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int = data.size
    //bisa juga pake override fun getItemCount():Int{
    //                   return data.size
    //                    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val item = data.get(position)
        //isi data dari model language ke masing masing view
        holder.tvPemrograman.text = item.name
        holder.ivBahasaPemrograman.setImageResource(item.image)
    }
}