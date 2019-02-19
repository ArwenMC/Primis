package com.arwenmc;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Primis extends JavaPlugin {

    PluginDescriptionFile plugin = this.getDescription();
    FileConfiguration config = this.getConfig();

    public final String NOT_PLAYER = (config.getString("messages.not_player") == null) ? ChatColor.RED + "You must be a player to use this command." : config.getString("messages.not_player");
    public final String NO_PERMISSION = (config.getString("messages.no_permission") == null) ? ChatColor.RED + "You do not have permission to use this comnmand." : config.getString("messages.no_permission");

    @Override
    public void onEnable() {
        getLogger().info(plugin.getFullName() + " version: " + plugin.getVersion() + " has been enabled.");

        config.options().copyDefaults(true);
        saveConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info(plugin.getFullName() + " version: " + plugin.getVersion() + " has been disabled.");
    }
}

