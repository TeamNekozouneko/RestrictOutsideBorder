package com.nekozouneko.restrictOutsideBorder

import com.nekozouneko.restrictOutsideBorder.commands.ReloadCommand
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import org.reflections.Reflections

class RestrictOutsideBorder : JavaPlugin() {

    companion object {
        lateinit var instance: JavaPlugin
    }

    override fun onEnable() {
        instance = this

        //Configurations
        saveDefaultConfig()
        reloadConfig()

        //Commands
        getCommand("robreload")?.setExecutor(ReloadCommand())

        //Listeners
        logger.info("Scanning all listeners with Reflections...")

        val ref = Reflections("com.nekozouneko.restrictOutsideBorder.listener")
        val classes = ref.getSubTypesOf(Listener::class.java)
        val listeners: List<Listener> = classes.mapNotNull { clazz ->
            try {
                clazz.getDeclaredConstructor().newInstance()
            } catch (e: Exception) {
                logger.severe("Failed to make the instance (${clazz.simpleName}) ${e.message}")
                null
            }
        }
        for (listener in listeners) {
            try {
                server.pluginManager.registerEvents(listener, this)
                logger.info("Registered ${listener::class.java.simpleName}")
            } catch (e: Exception) {
                logger.severe("The error occurred when registering listener ${listener::class.java.simpleName}")
                e.printStackTrace()
            }
        }
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
