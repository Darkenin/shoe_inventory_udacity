package com.raphael.shoe_inventory_app.viewmodel

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.raphael.shoe_inventory_app.data.Shoes
import com.raphael.shoe_inventory_app.databinding.DetailBinding

class ShoeDetailViewHolder(
    private val binding: DetailBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(shoes: Shoes) {
        binding.detailViewModel = shoes
    }
}