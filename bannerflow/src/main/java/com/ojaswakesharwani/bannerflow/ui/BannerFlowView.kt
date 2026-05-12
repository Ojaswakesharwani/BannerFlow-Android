package com.ojaswakesharwani.bannerflow.ui


import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.bannerflow.R
import com.ojaswakesharwani.bannerflow.adapter.BannerAdapter
import com.example.bannerflow.databinding.BannerFlowViewBinding
import com.ojaswakesharwani.bannerflow.image.CoilImageLoader
import com.ojaswakesharwani.bannerflow.image.ImageLoader
import com.ojaswakesharwani.bannerflow.listener.OnBannerClickListener
import com.ojaswakesharwani.bannerflow.model.BannerItem
import com.ojaswakesharwani.bannerflow.transformer.ZoomOutPageTransformer
import com.google.android.material.tabs.TabLayoutMediator

/**
 * BannerFlow
 * Production Ready Banner SDK
 *
 * Created by Ojaswa Kesharwani
 */

class BannerFlowView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(
    context,
    attrs,
    defStyleAttr
) {

    private val binding by lazy {

        BannerFlowViewBinding.inflate(
            LayoutInflater.from(context),
            this,
            true
        )
    }
    private var adapter: BannerAdapter? = null

    private var banners = mutableListOf<BannerItem>()

    private var imageLoader: ImageLoader =
        CoilImageLoader()

    private var clickListener:
            OnBannerClickListener? = null

    private val handler =
        Handler(Looper.getMainLooper())

    private var autoScroll = true

    private var scrollDelay = 3000L

    private val runnable = object : Runnable {

        override fun run() {

            if (adapter == null || banners.isEmpty()) {
                return
            }

            val nextItem = if (
                binding.bannerViewPager.currentItem ==
                banners.lastIndex
            ) {
                0
            } else {
                binding.bannerViewPager.currentItem + 1
            }

            binding.bannerViewPager.currentItem = nextItem

            handler.postDelayed(
                this,
                scrollDelay
            )
        }
    }

    init {

        setupViewPager()

        readAttrs(attrs)
    }

    private fun setupViewPager() {

        binding.bannerViewPager.apply {

            clipChildren = false

            clipToPadding = false

            offscreenPageLimit = 3

            setPadding(
                60,
                0,
                60,
                0
            )

            setPageTransformer(
                ZoomOutPageTransformer()
            )
        }
    }

    private fun readAttrs(attrs: AttributeSet?) {

        val typedArray =
            context.obtainStyledAttributes(
                attrs,
                R.styleable.BannerFlowView
            )

        autoScroll =
            typedArray.getBoolean(
                R.styleable.BannerFlowView_bf_autoScroll,
                true
            )

        scrollDelay =
            typedArray.getInt(
                R.styleable.BannerFlowView_bf_scrollDelay,
                3000
            ).toLong()

        typedArray.recycle()
    }

    fun setBanners(
        items: List<BannerItem>
    ) {
        if (items.isEmpty()) return

        banners = items as MutableList<BannerItem>

        adapter = BannerAdapter(
            items,
            imageLoader,
            clickListener
        )

        binding.bannerViewPager.adapter =
            adapter

        /*binding.bannerViewPager.setCurrentItem(
            Int.MAX_VALUE / 2,
            false
        )*/

        TabLayoutMediator(
            binding.tabIndicator,
            binding.bannerViewPager
        ) { _, _ -> }.attach()

        if (autoScroll) {

            startAutoScroll()
        }
    }

    fun setImageLoader(
        loader: ImageLoader
    ) {

        imageLoader = loader
    }

    fun setOnBannerClickListener(
        listener: OnBannerClickListener
    ) {

        clickListener = listener
    }

    private fun startAutoScroll() {

        stopAutoScroll()

        handler.postDelayed(
            runnable,
            scrollDelay
        )
    }

    fun stopAutoScroll() {

        handler.removeCallbacks(runnable)
    }

    override fun onAttachedToWindow() {

        super.onAttachedToWindow()

        if (autoScroll) {

            startAutoScroll()
        }
    }

    override fun onDetachedFromWindow() {

        super.onDetachedFromWindow()

        stopAutoScroll()
    }
}