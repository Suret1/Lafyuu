package com.suret.taskdesign.ui.favorite

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.suret.taskdesign.R
import com.suret.taskdesign.adapter.ProductItemsAdapter
import com.suret.taskdesign.listmaker.FlashSaleModelListMaker
import com.suret.taskdesign.model.SuperFlashSaleModel
import kotlinx.android.synthetic.main.fragment_favorite.*


class FavoriteFragment : Fragment(R.layout.fragment_favorite) {
    private var favoriteList: MutableList<SuperFlashSaleModel> = arrayListOf()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        favoriteList = FlashSaleModelListMaker.flashSaleListMaker()

        val favoriteAdapter = ProductItemsAdapter(favoriteList)

        favorite_recycler.adapter = favoriteAdapter


        favorite_toolbar.setNavigationIcon(R.drawable.back_btn)


        favorite_toolbar.setNavigationOnClickListener {
            requireActivity().onBackPressed()
        }
    }


}