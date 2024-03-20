package com.sudo_pacman.meditation.models

import androidx.annotation.DrawableRes

data class BottomMenuContent(
    val title: String,
    @DrawableRes val resId: Int
)