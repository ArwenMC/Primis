package com.arwenmc.command;

import com.arwenmc.Primis;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    Primis plugin;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Player player = (Player) sender;
            player.sendMessage("Test Fly Command");
            // add fly logic.
            return true;
        } else {
            sender.sendMessage(plugin.NOT_PLAYER);
        }
        return false;
    }

}
