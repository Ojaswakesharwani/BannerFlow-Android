package com.ojaswakesharwani.bannerflow.image

import android.widget.ImageView


/**
 * Created by Ojaswa Kesharwani
 */

interface ImageLoader {

    fun load(
        imageView: ImageView,
        image: Any
    )
}