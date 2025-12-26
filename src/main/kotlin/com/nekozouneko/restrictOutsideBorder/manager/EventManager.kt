package com.nekozouneko.restrictOutsideBorder.manager

import com.nekozouneko.restrictOutsideBorder.Utils
import org.bukkit.Location
import org.bukkit.event.Cancellable

class EventManager {
    companion object {
        fun cancelEvent(event: Cancellable, loc: Location){
            if(Utils.isAllowedLocation(loc)) return
            event.isCancelled = true
        }
    }
}