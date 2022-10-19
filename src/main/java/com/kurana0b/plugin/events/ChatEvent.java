package com.kurana0b.plugin.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class ChatEvent implements Listener {
    @EventHandler
    public void on(PlayerChatEvent e) {
        e.setCancelled(true);
        if(e.getPlayer().isOp()) {
            e.setMessage(ChatColor.WHITE + e.getMessage() + ChatColor.AQUA + " By Operator");
        }
        else {
            e.setMessage(ChatColor.WHITE + e.getMessage());
        }
    }
}
