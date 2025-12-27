package com.nekozouneko.restrictOutsideBorder.listener

import com.destroystokyo.paper.event.entity.EntityPathfindEvent
import com.nekozouneko.restrictOutsideBorder.manager.EventManager
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener

class EntityPathfindListener : Listener {
    @EventHandler(ignoreCancelled = false, priority = EventPriority.LOWEST)
    fun onEntityPathfind(e: EntityPathfindEvent){
        EventManager.cancelEvent(e, e.entity.location)

        val targetEntity = e.targetEntity ?: return
        EventManager.cancelEvent(e, targetEntity.location)
    }
}