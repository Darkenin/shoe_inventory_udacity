package com.raphael.shoe_inventory_app.viewmodel

import android.content.Context
import android.content.res.Resources
import androidx.annotation.IntegerRes
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import com.raphael.shoe_inventory_app.R
import com.raphael.shoe_inventory_app.data.Shoes

class DetailViewModel : ViewModel() {

    object ShoesData {
        fun getshoes(context: Context): List<Shoes> {
            val shoes = arrayListOf<Shoes>()

            val brown = Shoes(
                R.string.brown,
                R.string.price_a,
                ContextCompat.getDrawable(context, R.drawable.brown_leather_shoes),
                R.string.leatherdes,
                R.string.sizea
            )

            val joseph = Shoes(
                R.string.joe,
                R.string.price_b,
                ContextCompat.getDrawable(context, R.drawable.joseph_barrientos),
                R.string.joedes,
                R.string.sizeb
            )

            val high_heels = Shoes(
                R.string.metric,
                R.string.price_b,
                ContextCompat.getDrawable(context, R.drawable.metric),
                R.string.metric_des,
                R.string.sizea
            )

            val nike_air = Shoes(
                R.string.plomp,
                R.string.price_a,
                ContextCompat.getDrawable(context, R.drawable.ryan_plomp),
                R.string.plompdes,
                R.string.sizeb
            )

            val converse = Shoes(
                R.string.all_stars,
                R.string.price_a,
                ContextCompat.getDrawable(context, R.drawable.shoes_pair_men),
                R.string.starsdes,
                R.string.sizea
            )

            val unsplash = Shoes(
                R.string.plomp,
                R.string.price_b,
                ContextCompat.getDrawable(context, R.drawable.unsplash),
                R.string.plompdes,
                R.string.sizeb
            )

            shoes.add(brown)
            shoes.add(joseph)
            shoes.add(high_heels)
            shoes.add(nike_air)
            shoes.add(converse)
            shoes.add(unsplash)
            return shoes
        }
    }
}