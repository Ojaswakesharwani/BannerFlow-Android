package com.ojaswakesharwani.bannerflow.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ojaswakesharwani.bannerflow.databinding.ItemBannerBinding
import com.ojaswakesharwani.bannerflow.image.ImageLoader
import com.ojaswakesharwani.bannerflow.listener.OnBannerClickListener
import com.ojaswakesharwani.bannerflow.model.BannerItem

/**
 * Production Ready Banner Adapter
 * Created by Ojaswa Kesharwani
 */

class BannerAdapter(
    private val banners: List<BannerItem>,
    private val imageLoader: ImageLoader,
    private val listener: OnBannerClickListener?
) : RecyclerView.Adapter<BannerAdapter.BannerViewHolder>() {

    inner class BannerViewHolder(
        val binding: ItemBannerBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BannerViewHolder {

        val binding = ItemBannerBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return BannerViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: BannerViewHolder,
        position: Int
    ) {

        val realPosition = position % banners.size

        val item = banners[position]
        with(holder.binding) {

            tvTitle.text = item.title

            tvSubtitle.text = item.subtitle

            tvCTA.text = item.cta

            imageLoader.load(
                imgBanner,
                item.image
            )
        }

        holder.itemView.setOnClickListener {

            listener?.onBannerClick(
                realPosition,
                item
            )
        }
    }

    override fun getItemCount(): Int {

        return banners.size
    }
}