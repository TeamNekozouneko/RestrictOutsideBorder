package com.nekozouneko.restrictOutsideBorder.listener

import com.nekozouneko.restrictOutsideBorder.manager.EventManager
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent

class PlayerInteractListener : Listener{
    @EventHandler(ignoreCancelled = false, priority = EventPriority.LOWEST)
    fun onInteract(e: PlayerInteractEvent){
        val interactedPoint = e.interactionPoint ?: return
        EventManager.cancelEvent(e, interactedPoint, e.player)
    }
}