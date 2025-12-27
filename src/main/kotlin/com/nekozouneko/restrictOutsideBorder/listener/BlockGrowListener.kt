package com.nekozouneko.restrictOutsideBorder.listener

import com.nekozouneko.restrictOutsideBorder.manager.EventManager
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockGrowEvent

class BlockGrowListener : Listener {
    @EventHandler(ignoreCancelled = false, priority = EventPriority.LOWEST)
    fun onBlockGrow(e: BlockGrowEvent){
        EventManager.cancelEvent(e, e.block.location)
    }
}