package com.nekozouneko.restrictOutsideBorder.wrapper

import com.nekozouneko.restrictOutsideBorder.RestrictOutsideBorder

object ConfigWrapper {
    private val config = RestrictOutsideBorder.instance.config

    object AllowedRange {
        val MinX = config.getInt("allowed_range.min_x")
        val MinZ = config.getInt("allowed_range.min_z")
        val MaxX = config.getInt("allowed_range.max_x")
        val MaxZ = config.getInt("allowed_range.max_z")
    }
}