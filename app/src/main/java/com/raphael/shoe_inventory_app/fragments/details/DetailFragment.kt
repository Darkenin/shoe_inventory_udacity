package com.raphael.shoe_inventory_app.fragments.details


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.raphael.shoe_inventory_app.R
import com.raphael.shoe_inventory_app.databinding.DetailRcyclerviewBinding
import com.raphael.shoe_inventory_app.viewmodel.DetailViewModel

class DetailFragment : Fragment(R.layout.detail) {
    val TAG = "FRAGMNTDET"
    lateinit var reBinding: DetailRcyclerviewBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        reBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.detail_rcyclerview,
            container,
            false
        )

        val recyclerView = reBinding.recShoes
        val shoesList = activity?.let { DetailViewModel.ShoesData.getshoes(it) }
        val shoeAdapter = shoesList?.let { ShoeAdapter(it) }
        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = shoeAdapter
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                activity,
                layoutManager.orientation
            )
        )

        shoeAdapter?.setOnItemClickListener {
            val action = DetailFragmentDirections.actionDetailFragmentToStorePageFragment(it)
            findNavController().navigate(action)
            Log.i(TAG, "onCreateView: " + action)
        }

        reBinding.setLifecycleOwner(this)
        return reBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}