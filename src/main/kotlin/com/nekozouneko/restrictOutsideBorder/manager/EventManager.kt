package com.nekozouneko.restrictOutsideBorder.manager

import com.nekozouneko.restrictOutsideBorder.Utils
import org.bukkit.Location
import org.bukkit.entity.LivingEntity
import org.bukkit.entity.Player
import org.bukkit.event.Cancellable

class EventManager {
    companion object {
        fun cancelEvent(event: Cancellable, loc: Location, causedBy: LivingEntity? = null){
            if(Utils.isAllowedLocation(loc)) return

            //Bypass
            if(causedBy != null && causedBy is Player && causedBy.hasPermission("rob.bypass")){
                return
            }

            event.isCancelled = true
        }
    }
}