package com.nekozouneko.restrictOutsideBorder.listener

import com.nekozouneko.restrictOutsideBorder.manager.EventManager
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.weather.LightningStrikeEvent

class LightningStrikeListener : Listener {
    @EventHandler(ignoreCancelled = false, priority = EventPriority.LOWEST)
    fun onLightningStrike(e: LightningStrikeEvent){
        EventManager.cancelEvent(e, e.lightning.location)
    }
}