package com.nekozouneko.restrictOutsideBorder.commands

import com.nekozouneko.restrictOutsideBorder.RestrictOutsideBorder
import net.kyori.adventure.text.Component
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class ReloadCommand : CommandExecutor {
    override fun onCommand(p0: CommandSender, p1: Command, p2: String, p3: Array<out String>): Boolean {
        if (p0 !is Player) return false

        RestrictOutsideBorder.instance.reloadConfig()
        p0.sendMessage(Component.text("§cコンフィグをリロードしました。"))

        return true
    }
}