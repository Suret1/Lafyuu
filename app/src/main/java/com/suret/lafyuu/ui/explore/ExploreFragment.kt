package com.suret.lafyuu.ui.explore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.suret.lafyuu.ui.adapter.CategoryRecyclerAdapter
import com.suret.lafyuu.databinding.FragmentExploreBinding
import com.suret.lafyuu.listmaker.CategoryModelListMaker
import com.suret.lafyuu.data.model.test.CategoryModel

class ExploreFragment : Fragment() {
    private lateinit var exploreBinding: FragmentExploreBinding
    private var categoryForMan: MutableList<CategoryModel> = arrayListOf()
    private var categoryForWoman: MutableList<CategoryModel> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        exploreBinding = FragmentExploreBinding.inflate(inflater, container, false)
        return exploreBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//
//        categoryForMan = CategoryModelListMaker.categoryListForMan()
//        categoryForWoman = CategoryModelListMaker.categoryListForWoman()
//
//        val manAdapter = CategoryRecyclerAdapter(categoryForMan)
//        val womanAdapter = CategoryRecyclerAdapter(categoryForWoman)
//
//        exploreBinding.apply {
//
//            manFashionRecycler.adapter = manAdapter
//            womanFashionRecycler.adapter = womanAdapter
//        }


    }


}