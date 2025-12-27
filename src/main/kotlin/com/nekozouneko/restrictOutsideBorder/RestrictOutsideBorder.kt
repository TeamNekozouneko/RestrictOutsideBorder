package com.nekozouneko.restrictOutsideBorder

import com.nekozouneko.restrictOutsideBorder.commands.ReloadCommand
import com.nekozouneko.restrictOutsideBorder.listener.BlockBreakListener
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class RestrictOutsideBorder : JavaPlugin() {

    companion object {
        lateinit var instance: JavaPlugin
    }

    override fun onEnable() {
        instance = this

        //Configurations
        saveDefaultConfig()
        reloadConfig()

        //Listeners
        val listeners: List<Listener> = listOf(
            BlockBreakListener()
        )
        for (listener in listeners) {
            server.pluginManager.registerEvents(listener, this)
        }

        //Commands
        getCommand("robreload")?.setExecutor(ReloadCommand())
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
