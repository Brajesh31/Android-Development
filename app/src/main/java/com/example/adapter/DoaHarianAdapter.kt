package com.example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.vectordrawable.R
import com.example.model.DoaHarian

class DoaHarianAdapter(val data:ArrayList<DoaHarian>)
    :RecyclerView.Adapter<DoaHarianAdapter.DoaHarianViewHolder>()
{
    class DoaHarianViewHolder(view: View)
        :RecyclerView.ViewHolder(view) {
        val tvJudulDoa:TextView = view.findViewById(com.example.myapplication.R.id.tvJudulDoa2)
        val tvDoaArab:TextView = view.findViewById(com.example.myapplication.R.id.tvDoaArab)
        val tvDoalatin:TextView = view.findViewById(com.example.myapplication.R.id.tvDoaLatin)
        val ibCollapse:ImageButton = view.findViewById(com.example.myapplication.R.id.ibCollapse)
        val rlIsiDoa:RelativeLayout = view.findViewById(com.example.myapplication.R.id.rlIsiDoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaHarianViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(com.example.myapplication.R.layout.item_doa_harian, parent, false)
        return DoaHarianViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DoaHarianViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvJudulDoa.text = item.judul
        holder.tvDoaArab.text = item.textArab
        holder.tvDoalatin.text = item.textLatin

        holder.ibCollapse.setOnClickListener {
            if (holder.rlIsiDoa.visibility == View.GONE){
                holder.rlIsiDoa.visibility = View.VISIBLE
                holder.ibCollapse.setBackgroundResource(R.drawable.notification_bg_normal)
            }else{
                holder.rlIsiDoa.visibility = View.GONE
                holder.ibCollapse.setBackgroundResource(R.drawable.notification_bg_low)
            }
        }
    }
}