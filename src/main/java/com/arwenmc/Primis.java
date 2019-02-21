package com.arwenmc;

import com.arwenmc.listeners.PlayerEvent;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class Primis extends JavaPlugin {

    PluginDescriptionFile plugin = this.getDescription();
    FileConfiguration config = this.getConfig();
    PluginManager pm = Bukkit.getPluginManager();

    public final String NOT_PLAYER = getConfig("messages.not_player");
    public final String NO_PERMISSION = getConfig("messages.no_permission");

    @Override
    public void onEnable() {
        getLogger().info(plugin.getFullName() + " version: " + plugin.getVersion() + " has been enabled.");

        pm.registerEvents(new PlayerEvent(), this);

        config.options().copyDefaults(true);
        saveConfig();

        for (Permission permission : getAllPermissions()) {
            pm.addPermission(permission);
        }
    }

    @Override
    public void onDisable() {
        getLogger().info(plugin.getFullName() + " version: " + plugin.getVersion() + " has been disabled.");
    }

    public String getConfig(String path) {
        String str = this.getConfig().getString(path);
        ChatColor.translateAlternateColorCodes('&', str);
        return str;
    }

    public Permission[] getAllPermissions() {
        Permission[] permissions = new Permission[PrimisPermission.values().length];
        for (PrimisPermission pperm : PrimisPermission.values()) {
            permissions[permissions.length + 1] = pperm.getPermission();
        }
        return permissions;
    }
}

