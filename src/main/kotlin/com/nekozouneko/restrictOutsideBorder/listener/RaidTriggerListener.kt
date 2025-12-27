package com.nekozouneko.restrictOutsideBorder.listener

import com.nekozouneko.restrictOutsideBorder.manager.EventManager
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.raid.RaidTriggerEvent

class RaidTriggerListener : Listener {
    @EventHandler(ignoreCancelled = false, priority = EventPriority.LOWEST)
    fun onRaidTrigger(e: RaidTriggerEvent){
        EventManager.cancelEvent(e, e.raid.location)
    }
}