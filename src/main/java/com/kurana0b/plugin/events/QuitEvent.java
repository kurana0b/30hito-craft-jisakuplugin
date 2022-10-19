package com.kurana0b.plugin.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitEvent implements Listener {

    @EventHandler
    public void on(PlayerQuitEvent e) {

        e.setQuitMessage(ChatColor.YELLOW + e.getPlayer().getName() + "さんが退出しました。");
    }
}
