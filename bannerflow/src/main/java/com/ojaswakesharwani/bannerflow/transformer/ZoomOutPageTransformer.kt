package com.ojaswakesharwani.bannerflow.transformer


import android.view.View
import androidx.viewpager2.widget.ViewPager2
import kotlin.math.abs
import kotlin.math.max

/**
 * Zomato style zoom animation
 * Created by Ojaswa Kesharwani
 */

class ZoomOutPageTransformer : ViewPager2.PageTransformer {

    override fun transformPage(
        page: View,
        position: Float
    ) {

        val scaleFactor = max(0.85f, 1 - abs(position))

        page.scaleY = scaleFactor

        page.alpha =
            0.5f + (
                    (scaleFactor - 0.85f) /
                            (1 - 0.85f)
                    ) * (1 - 0.5f)
    }
}