package com.nekozouneko.restrictOutsideBorder.listener

import com.nekozouneko.restrictOutsideBorder.Utils
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockExplodeEvent

class BlockExplodeListener : Listener {
    @EventHandler(ignoreCancelled = false, priority = EventPriority.LOWEST)
    fun onBlockExplode(e: BlockExplodeEvent){
        var isBlocked = false
        val iterator = e.blockList().iterator()
        while (iterator.hasNext()){
            val block = iterator.next()
            if(!Utils.isAllowedLocation(block.location)){
                isBlocked = true
                break
            }
        }

        if(isBlocked) e.isCancelled = true
    }
}