package com.example.portalberita.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.portalberita.Data.berita
import com.example.portalberita.R

class BeritaAdapter(private val  list: ArrayList<berita>)
    : RecyclerView.Adapter<BeritaAdapter.beritaViewHolder>() {

    class beritaViewHolder (itemview: View) : RecyclerView.ViewHolder(itemview){
        private val judul = itemview.findViewById<TextView>(R.id.judulberita)
        private val gambar = itemview.findViewById<ImageView>(R.id.gambarberita)
        private val desc = itemview.findViewById<TextView>(R.id.descberita)

        fun bind(get: berita){
            judul.text = get.judul
            //gambar.setImageResource()
            desc.text = get.desc

            judul.setOnClickListener {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): beritaViewHolder {
        return beritaViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_berita, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: beritaViewHolder, position: Int) {
        holder.bind(list[position])
    }
}