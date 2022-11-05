package com.raphael.shoe_inventory_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.raphael.shoe_inventory_app.R
import com.raphael.shoe_inventory_app.databinding.CheckoutBinding

class CheckOutFragment : Fragment(R.layout.checkout) {
    lateinit var binding: CheckoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.checkout, container, false
        )
        val args by navArgs<CheckOutFragmentArgs>()

        val shoeprice = args.shoes

        binding.lifecycleOwner = this

        if (shoeprice.shoeName == 2131755045) {
            binding.shoePrice.text = getString(R.string.price_a)
        } else if (shoeprice.shoeName == 2131755166) {
            binding.shoePrice.text = getString(R.string.price_b)
        } else if (shoeprice.shoeName == 2131755106) {
            binding.shoePrice.text = getString(R.string.price_b)
        } else if (shoeprice.shoeName == 2131755154) {
            binding.shoePrice.text = getString(R.string.price_a)
        } else if (shoeprice.shoeName == 2131755035) {
            binding.shoePrice.text = getString(R.string.price_a)
        } else if (shoeprice.shoeName == 2131755154) {
            binding.shoePrice.text = getString(R.string.price_a)
        } else {
            "Not Reached"
        }
        val coupon = binding.editText.text

        binding.apply.setOnClickListener {
            Toast.makeText(
                context, "Coupon applied " + coupon,
                Toast.LENGTH_SHORT
            ).show()
        }
        binding.checkoutPay.setOnClickListener {
            findNavController().navigate(CheckOutFragmentDirections.actionCheckOutFragmentToFinalPageFragment())
        }
        return binding.root
    }
}