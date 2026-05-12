package com.ojaswakesharwani.bannerflow.listener

import com.ojaswakesharwani.bannerflow.model.BannerItem


/**
 * Created by Ojaswa Kesharwani
 */

fun interface OnBannerClickListener {

    fun onBannerClick(
        position: Int,
        item: BannerItem
    )
}