package com.kurana0b.custom.me;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener {

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent e)
    {
        e.setJoinMessage(ChatColor.RED + e.getPlayer().getName() + "さんが参加しました。");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e)
    {
        e.setQuitMessage(ChatColor.RED + e.getPlayer().getName() + "さんが退出しました。");
    }

    @EventHandler
    public void onChatEvent(PlayerChatEvent e) {
        e.setCancelled(true);
        if(e.getPlayer().isOp())
        e.setMessage(ChatColor.AQUA + "operator " + ChatColor.WHITE +  e.getMessage());

        else
        e.setMessage(ChatColor.WHITE +  e.getMessage());
    }
}
