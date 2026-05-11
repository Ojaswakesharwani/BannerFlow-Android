package com.example.bannerflow.image

import android.widget.ImageView
import coil.load

/**
 * Default Coil image loader
 * Created by Ojaswa Kesharwani
 */

class CoilImageLoader : ImageLoader {

    override fun load(
        imageView: ImageView,
        image: Any
    ) {

        imageView.load(image) {

            crossfade(true)
        }
    }
}