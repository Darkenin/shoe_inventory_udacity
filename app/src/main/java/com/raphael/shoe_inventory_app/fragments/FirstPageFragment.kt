package com.raphael.shoe_inventory_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.raphael.shoe_inventory_app.R
import com.raphael.shoe_inventory_app.databinding.FirstPageBinding

class FirstPageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FirstPageBinding = DataBindingUtil.inflate(
            inflater, R.layout.first_page, container, false
        )

        binding.lifecycleOwner = this
        binding.signin.setOnClickListener {
            findNavController().navigate(FirstPageFragmentDirections.actionFirstPageFragmentToDetailFragment())
        }

        binding.signup.setOnClickListener {
            findNavController().navigate(FirstPageFragmentDirections.actionFirstPageFragmentToDetailFragment())
        }
        return binding.root
    }
}