package com.example.bannerflow.model


/**
 * Created by Ojaswa Kesharwani
 * BannerFlow Library
 */

data class BannerItem(

    val imageUrl: String,

    val title: String? = null,

    val subtitle: String? = null,

    val cta: String? = null,

    val actionUrl: String? = null
)