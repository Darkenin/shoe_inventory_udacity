package com.raphael.shoe_inventory_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.raphael.shoe_inventory_app.R
import com.raphael.shoe_inventory_app.databinding.FinalPageBinding

class FinalPageFragment : Fragment(R.layout.final_page) {

    lateinit var binding: FinalPageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.final_page, container, false
        )

        binding.button2.setOnClickListener {
            val action = FinalPageFragmentDirections.actionFinalPageFragmentToDetailFragment()
            findNavController().navigate(action)
        }
        return binding.root
    }
}