package com.nekozouneko.restrictOutsideBorder

import com.nekozouneko.restrictOutsideBorder.wrapper.ConfigWrapper
import org.bukkit.Location

class Utils {
    companion object {
        fun isAllowedLocation(loc: Location) : Boolean {
            val minX = ConfigWrapper.AllowedRange.MinX
            val minZ = ConfigWrapper.AllowedRange.MinZ
            val maxX = ConfigWrapper.AllowedRange.MaxX
            val maxZ = ConfigWrapper.AllowedRange.MaxZ

            val x = loc.x
            val z = loc.z

            if( x < minX ) return false
            if( z < minZ ) return false
            if( x > maxX ) return false
            if( z > maxZ ) return false
            return true
        }
    }
}