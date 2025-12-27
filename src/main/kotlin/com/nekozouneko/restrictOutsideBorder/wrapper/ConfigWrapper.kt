package com.nekozouneko.restrictOutsideBorder.wrapper

import com.nekozouneko.restrictOutsideBorder.RestrictOutsideBorder

object ConfigWrapper {
    object AllowedRange {
        val MinX
            get() = RestrictOutsideBorder.instance.config.getInt("allowed_range.min_x")
        val MinZ
            get() = RestrictOutsideBorder.instance.config.getInt("allowed_range.min_z")
        val MaxX
            get() = RestrictOutsideBorder.instance.config.getInt("allowed_range.max_x")
        val MaxZ
            get() = RestrictOutsideBorder.instance.config.getInt("allowed_range.max_z")
    }
}