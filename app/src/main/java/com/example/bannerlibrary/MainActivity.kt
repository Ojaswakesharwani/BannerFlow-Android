package com.example.bannerlibrary

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bannerflow.model.BannerItem
import com.example.bannerflow.ui.BannerFlowView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val banner = findViewById<BannerFlowView>(R.id.banner)

        banner.setBanners(

            listOf(

                BannerItem(
                    image = "https://images.unsplash.com/photo-1517836357463-d25dfeac3438",
                    title = "Flat 50% OFF",
                    subtitle = "Premium Haircut",
                    cta = "Book Now"
                ),
                BannerItem(
                    image = "https://media.wired.com/photos/5d72ea989fef0d0008852457/3:2/w_1920,c_limit/Fake-IG-Followers-Top-Art-1133439473.jpg",
                    title = "Flat 20% OFF",
                    subtitle = "Premium triming ",
                    cta = "Book Now"

                ), BannerItem(
                    image = "https://images.unsplash.com/photo-1517836357463-d25dfeac3438",
                    title = "Flat 50% OFF",
                    subtitle = "Premium Haircut",
                    cta = "Book Now"
                ),
                BannerItem(
                    image = "https://media.wired.com/photos/5d72ea989fef0d0008852457/3:2/w_1920,c_limit/Fake-IG-Followers-Top-Art-1133439473.jpg",
                    title = "Flat 20% OFF",
                    subtitle = "Premium triming ",
                    cta = "Book Now"

                ), BannerItem(
                    image = "https://images.unsplash.com/photo-1517836357463-d25dfeac3438",
                    title = "Flat 50% OFF",
                    subtitle = "Premium Haircut",
                    cta = "Book Now"
                ),
                BannerItem(
                    image = "https://media.wired.com/photos/5d72ea989fef0d0008852457/3:2/w_1920,c_limit/Fake-IG-Followers-Top-Art-1133439473.jpg",
                    title = "Flat 20% OFF",
                    subtitle = "Premium triming ",
                    cta = "Book Now"

                )
            )
        )

    }
}