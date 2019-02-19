package com.arwenmc;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Primis extends JavaPlugin {

    PluginDescriptionFile config = this.getDescription();

    @Override
    public void onEnable() {
        getLogger().info(config.getFullName() + " version: " + config.getVersion() + " has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info(config.getFullName() + " version: " + config.getVersion() + " has been disabled.");
    }
}
