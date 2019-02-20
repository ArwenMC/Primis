package com.arwenmc.listeners;

import com.arwenmc.Primis;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoinEvent implements Listener {

    Primis plugin;

    @EventHandler
    public void playerFirstJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPlayedBefore()) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                String msg = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("messages.on_first_join").replace("{PLAYER}", player.getDisplayName()));
                p.sendMessage(msg);
            }
        }
    }

}
