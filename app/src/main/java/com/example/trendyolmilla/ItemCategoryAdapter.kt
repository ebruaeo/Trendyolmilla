package com.example.trendyolmilla

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.trendyolmilla.databinding.ItemCategoryBinding

class ItemCategoryAdapter (val categories: Array<Int>) :
    RecyclerView.Adapter<ItemCategoryAdapter.ItemCategoryViewHolder>() {

        class ItemCategoryViewHolder(var binding: ItemCategoryBinding) :
            RecyclerView.ViewHolder(binding.root) {

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemCategoryViewHolder {
        val binding =ItemCategoryBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemCategoryViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: ItemCategoryViewHolder, position: Int) {
        holder.binding.categoryImage.setImageResource(categories[position])

    }


}