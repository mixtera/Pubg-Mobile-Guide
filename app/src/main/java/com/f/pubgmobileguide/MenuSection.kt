package com.f.pubgmobileguide

import java.io.Serializable

data class MenuSection(
    val title: String,
    val description: String,
    val image: Int
) : Serializable