package com.example.portalberita.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.portalberita.Data.komentar
import com.example.portalberita.R

class KomentarAdapter (private val list:ArrayList<komentar>)
    : RecyclerView.Adapter<KomentarAdapter.komentarViewHolder>() {

    class komentarViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private val username =itemView.findViewById<TextView>(R.id.username)
        private val komentar =itemView.findViewById<TextView>(R.id.komentar)

        fun bind(get: komentar){
            username.text = get.username
            komentar.text = get.komentar
        }
    }

    override fun onCreateViewHolder (parent: ViewGroup,viewType: Int
    ): KomentarAdapter.komentarViewHolder {
        return komentarViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_komentar, parent, false))
    }

    override fun onBindViewHolder(holder: KomentarAdapter.komentarViewHolder, position: Int) {
       holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return  list.size
        TODO("Not yet implemented")
    }
}