package com.inclutab.citizenspace.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.inclutab.citizenspace.R
import com.inclutab.citizenspace.model.Citizen

class ItemAdapter (
    private val context:Context,
    private val dataset:List<Citizen>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view : View): RecyclerView.ViewHolder(view){
        val nameTextView : TextView = view.findViewById(R.id.name_title)
        val addressTextView : TextView = view.findViewById(R.id.address_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.nameTextView.text =  item.name
        holder.addressTextView.text =  item.address
    }

    override fun getItemCount()= dataset.size
}