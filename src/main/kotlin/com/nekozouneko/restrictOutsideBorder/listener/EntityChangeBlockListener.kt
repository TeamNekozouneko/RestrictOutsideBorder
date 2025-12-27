package com.nekozouneko.restrictOutsideBorder.listener

import com.nekozouneko.restrictOutsideBorder.manager.EventManager
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityChangeBlockEvent

class EntityChangeBlockListener : Listener {
    @EventHandler(ignoreCancelled = false, priority = EventPriority.LOWEST)
    fun onEntityChangeBlock(e: EntityChangeBlockEvent){
        EventManager.cancelEvent(e, e.block.location)
    }
}