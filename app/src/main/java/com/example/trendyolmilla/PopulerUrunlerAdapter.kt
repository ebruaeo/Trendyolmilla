package com.example.trendyolmilla

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trendyolmilla.data.entity.UrunData
import com.example.trendyolmilla.databinding.PopulerUrunlerBinding

class PopulerUrunlerAdapter
    (val products: Array<UrunData>) :
    RecyclerView.Adapter<PopulerUrunlerAdapter.PopulerUrunlerViewHolder>() {

    class PopulerUrunlerViewHolder(var binding: PopulerUrunlerBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopulerUrunlerViewHolder {
        val binding =
            PopulerUrunlerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PopulerUrunlerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: PopulerUrunlerViewHolder, position: Int) {
        val itemData = products[position]
        holder.binding.imageClothe.setImageResource(itemData.image)
        holder.binding.textExplanation.text = itemData.description
        holder.binding.textPrice.text = itemData.price.toString()+ "TL"


    }
}