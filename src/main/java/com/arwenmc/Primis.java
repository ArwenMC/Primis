package com.arwenmc;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Primis extends JavaPlugin {

    PluginDescriptionFile config = this.getDescription();

    public final String NOT_PLAYER = ChatColor.RED + "You must be a player to use this command.";
    public final String NO_PERMISSION = ChatColor.RED + "You do not have permission to use this command.";

    @Override
    public void onEnable() {
        getLogger().info(config.getFullName() + " version: " + config.getVersion() + " has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info(config.getFullName() + " version: " + config.getVersion() + " has been disabled.");
    }
}
