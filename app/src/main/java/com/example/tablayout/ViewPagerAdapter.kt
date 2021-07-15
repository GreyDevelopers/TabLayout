package com.example.tablayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(val list: List<String>):RecyclerView.Adapter<ViewPagerAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val textView = itemView.findViewById<TextView>(R.id.tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.textView.text= list[position]
    }

    override fun getItemCount(): Int = list.size
}