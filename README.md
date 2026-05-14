# BannerFlow Android

<div align="center">

<img src="https://raw.githubusercontent.com/Ojaswakesharwani/BannerFlow-Android/master/preview/bannerflow_cover.png" width="100%" />

### 🚀 Production Ready Android Banner Carousel Library

Elegant, lightweight, and customizable banner slider library for Android built with **Kotlin + ViewPager2 + Coil**.

[![Android](https://img.shields.io/badge/Android-21%2B-green.svg)]()
[![Kotlin](https://img.shields.io/badge/Kotlin-2.0-blue.svg)]()
[![JitPack](https://img.shields.io/badge/JitPack-Available-orange.svg)]()
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)]()

</div>

---

# ✨ Features

- 🎯 Auto-scrolling banner carousel
- 🎨 Modern Zomato-style animations
- ⚡ Smooth ViewPager2 transitions
- 🖼 Universal image support
- 📱 Material Design indicators
- 🔥 Lightweight and production-ready
- 🎯 Banner click listener support
- 🧩 Easy integration
- 💎 Premium UI feel
- 📦 JitPack dependency support

---

# 🖼 Supported Image Types

BannerFlow supports:

- Image URLs
- PNG / JPG / WEBP
- Drawable Resources
- Bitmap
- File
- Uri

---

# 🎥 Preview

[https://github.com/user-attachments/assets/YOUR_VIDEO_ID
](https://github.com/Ojaswakesharwani/BannerFlow-Android/issues/1)
---

# 📸 Preview Screenshots

## Full Stack Banner

<img src="https://raw.githubusercontent.com/Ojaswakesharwani/BannerFlow-Android/master/preview/fullstack_banner.png" width="100%" />

---

# 📦 Installation

## Step 1 — Add JitPack

Add this inside your `settings.gradle.kts`

```kotlin
dependencyResolutionManagement {

    repositoriesMode.set(
        RepositoriesMode.FAIL_ON_PROJECT_REPOS
    )

    repositories {

        google()

        mavenCentral()

        maven("https://jitpack.io")
    }
}
```

---

## Step 2 — Add Dependency

```kotlin
implementation(
    "com.github.Ojaswakesharwani:BannerFlow-Android:2.0.0"
)
```

---

# 🚀 Usage

## XML

```xml
<com.ojaswakesharwani.bannerflow.ui.BannerFlowView
    android:id="@+id/banner"
    android:layout_width="match_parent"
    android:layout_height="180dp"/>
```

---

## Kotlin

```kotlin
val banner =
    findViewById<BannerFlowView>(
        R.id.banner
    )

banner.setBanners(

    listOf(

        BannerItem(

            image =
            "https://images.unsplash.com/photo.jpg",

            title = "Flat 50% OFF",

            subtitle = "Android Dev",

            cta = "Hire Now"
        ),

        BannerItem(

            image = R.drawable.img_1,

            title = "Full Stack",

            subtitle = "Production Ready",

            cta = "Explore"
        )
    )
)
```

---

# 🎯 Banner Click Listener

```kotlin
banner.setOnBannerClickListener {

        position,
        item ->

    Toast.makeText(
        this,
        item.title,
        Toast.LENGTH_SHORT
    ).show()
}
```

---

# ⚙️ Customization

## XML Attributes

```xml
app:bf_autoScroll="true"

app:bf_scrollDelay="3000"
```

---

# 🛠 Built With

- Kotlin
- ViewPager2
- Coil
- Material Design

---

# 📱 Perfect For

- E-commerce Apps
- Food Delivery Apps
- Salon Apps
- Booking Apps
- Advertisement Sliders
- Offer Carousels
- Portfolio Apps
- Startup Apps

---

# 📂 Package

```kotlin
com.ojaswakesharwani.bannerflow
```

---

# 🔥 Why BannerFlow?

BannerFlow focuses on:

- Clean architecture
- Modern animations
- Easy integration
- Lightweight performance
- Production-ready implementation
- Premium UI aesthetics

Unlike traditional sliders, BannerFlow provides a modern and polished carousel experience inspired by real-world production apps.

---

# 👨‍💻 Author

### Ojaswa Kesharwani

Android Developer • Full Stack Developer • Open Source Enthusiast

- GitHub:
  https://github.com/Ojaswakesharwani

- LinkedIn:
  https://www.linkedin.com/in/ojaswa-kesharwani-b2435927b

---

# ⭐ Support

If you like this project:

- 🌟 Star the repository
- 🍴 Fork the project
- 🐛 Report issues
- 🚀 Contribute improvements

---

# 📜 License

MIT License © 2026 Ojaswa Kesharwani

```
