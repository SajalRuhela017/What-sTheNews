package com.example.whatsthenews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class NewsListAdapter(private val items: ArrayList<String>, private val listener: NewsItemClicked): RecyclerView.Adapter<NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        //will be called when the ViewHolder is being created. It will be called the same number of times as the
        // number of views available on screen at a particular instant. After this views will be recycled.
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news , parent , false)     //Converting the mentioned xml into view
        val viewHolder = NewsViewHolder(view)
        view.setOnClickListener{
            listener.onItemClicked(items[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        //Only called once and it tells how many items will be there inside the list.
        return items.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        //It binds the data inside the view holder. Positions tells which position is be bound with the data
        val currentItem = items[position]
        holder.titleView.text = currentItem
    }
}

class NewsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val titleView: TextView = itemView.findViewById(R.id.title)
}

interface NewsItemClicked {
    fun onItemClicked(item: String)
}