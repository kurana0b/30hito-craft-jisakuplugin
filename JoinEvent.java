package com.kurana0b.plugin.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void on(PlayerJoinEvent e) {
        if(e.getPlayer().isOp()) {
            e.setJoinMessage(ChatColor.AQUA + "operator" + ChatColor.YELLOW + "の" + e.getPlayer().getName() + "さんが参加しました。");
        }
        else {
            e.setJoinMessage(ChatColor.YELLOW + e.getPlayer().getName() + "さんが参加しました。");
        }
    }
}
