package com.nekozouneko.restrictOutsideBorder.listener

import com.nekozouneko.restrictOutsideBorder.manager.EventManager
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockPistonExtendEvent

class PistonExtendListener: Listener {
    @EventHandler(ignoreCancelled = false, priority = EventPriority.LOWEST)
    fun onPistonExtend(e: BlockPistonExtendEvent){
        EventManager.cancelEvent(e, e.block.location)
    }
}