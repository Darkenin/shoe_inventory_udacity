package com.raphael.shoe_inventory_app.fragments

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.raphael.shoe_inventory_app.R
import com.raphael.shoe_inventory_app.databinding.StoreBinding


class StorePageFragment : Fragment(R.layout.store) {
    val TAG = "STO"
    lateinit var binding: StoreBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.store,
                container,
                false
            )

        val args by navArgs<StorePageFragmentArgs>()

        Log.i(TAG, "onCreateView: " + args)

        val shoeDetails = args.shoes

        if (shoeDetails.shoeName == 2131755045) {
            binding.shoeName.text = getString(R.string.brown)
            binding.shoePrize.text = getString(R.string.price_a)
            binding.shoeDetails.text = getString(R.string.leatherdes)
            binding.size.text = getString(R.string.sizea)

        } else if (shoeDetails.shoeName == 2131755166) {
            binding.shoeName.text = getString(R.string.joe)
            binding.shoePrize.text = getString(R.string.price_b)
            binding.shoeDetails.text = getString(R.string.joedes)
            binding.size.text = getString(R.string.sizeb)
        } else if (shoeDetails.shoeName == 2131755106) {
            binding.shoeName.text = getString(R.string.metric)
            binding.shoePrize.text = getString(R.string.price_b)
            binding.shoeDetails.text = getString(R.string.metric_des)
            binding.size.text = getString(R.string.sizea)
        } else if (shoeDetails.shoeName == 2131755154) {
            binding.shoeName.text = getString(R.string.plomp)
            binding.shoePrize.text = getString(R.string.price_a)
            binding.shoeDetails.text = getString(R.string.plompdes)
            binding.size.text = getString(R.string.sizea)
        } else if (shoeDetails.shoeName == 2131755035) {
            binding.shoeName.text = getString(R.string.all_stars)
            binding.shoePrize.text = getString(R.string.price_a)
            binding.shoeDetails.text = getString(R.string.starsdes)
            binding.size.text = getString(R.string.sizea)
        } else if (shoeDetails.shoeName == 2131755154) {
            binding.shoeName.text = getString(R.string.plomp)
            binding.shoePrize.text = getString(R.string.price_a)
            binding.shoeDetails.text = getString(R.string.plompdes)
            binding.size.text = getString(R.string.sizeb)
        } else {
            "NOT REACHABLE"
        }
        Log.i(TAG, "onCreateView:" + shoeDetails)

        binding.buy.setOnClickListener {
            findNavController().navigate(
                StorePageFragmentDirections.actionStorePageFragmentToCheckOutFragment(
                    shoeDetails
                )
            )
        }
        return binding.root
    }
}