package com.example.bannerflow.listener

import com.example.bannerflow.model.BannerItem


/**
 * Created by Ojaswa Kesharwani
 */

fun interface OnBannerClickListener {

    fun onBannerClick(
        position: Int,
        item: BannerItem
    )
}