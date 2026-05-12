package com.ojaswakesharwani.bannerflow.model


/**
 * Created by Ojaswa Kesharwani
 * BannerFlow Library
 */

data class BannerItem(

    /**
     * Supported:
     * - Image URL
     * - Drawable resource
     * - PNG/JPG/WEBP
     * - Uri
     * - File
     * - Bitmap
     * - Drawable
     */
    val image: Any,

    val title: String? = null,

    val subtitle: String? = null,

    val cta: String? = null,

    val actionUrl: String? = null
)