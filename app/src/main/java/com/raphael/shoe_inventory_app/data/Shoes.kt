package com.raphael.shoe_inventory_app.data

import android.graphics.drawable.Drawable
import java.io.Serializable

data class Shoes(
    val shoeName: Int,
    val shoePrice: Int,
    var imageRes: Drawable?,
    val shoesDetails: Int,
    val size: Int
) : Serializable

