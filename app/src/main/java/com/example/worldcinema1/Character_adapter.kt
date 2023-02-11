package com.example.worldcinema1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Character_adapter(val con: Context, val list2:ArrayList<Character>): RecyclerView.Adapter<Character_adapter.Link>()
{
    class Link(itemView:View): RecyclerView.ViewHolder(itemView){
        val im_di:ImageView =itemView.findViewById(R.id.image2)!!
        val title_di:TextView = itemView.findViewById(R.id.titleItem)
        val description_di:TextView = itemView.findViewById(R.id.descriptionItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.character_item, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.im_di.setImageResource(list2[position].imageId2)
        holder.title_di.setText(list2[position].title)
        holder.description_di.setText((list2[position].description))
    }

    override fun getItemCount(): Int {
        return  list2.size
    }
}