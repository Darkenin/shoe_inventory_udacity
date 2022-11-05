package com.raphael.shoe_inventory_app.fragments.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raphael.shoe_inventory_app.data.Shoes
import com.raphael.shoe_inventory_app.databinding.DetailBinding
import com.raphael.shoe_inventory_app.viewmodel.ShoeDetailViewHolder


class ShoeAdapter(private val shoes: List<Shoes>) : RecyclerView.Adapter<ShoeDetailViewHolder>() {

    private lateinit var binding: DetailBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeDetailViewHolder {
        binding = DetailBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShoeDetailViewHolder(binding)
    }

    override fun getItemCount(): Int = shoes.size

    private var onItemClickListener: ((Shoes) -> Unit)? = null

    override fun onBindViewHolder(holder: ShoeDetailViewHolder, position: Int) {
        var shoes = shoes[position]

        holder.bind(shoes)
        holder.itemView.apply {
            setOnClickListener {
                onItemClickListener?.let { it(shoes) }
            }
        }
    }

    fun setOnItemClickListener(listener: (Shoes) -> Unit) {
        onItemClickListener = listener
    }
}