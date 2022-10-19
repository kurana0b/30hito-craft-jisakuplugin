package com.kurana0b.plugin.events;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEvent;

public class ForceEvent implements Listener {

    @EventHandler
    public void on(PlayerEvent e) {
        if(e.getPlayer().isOp()) {
            return;
        }
        else {
            if(e.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {
                e.getPlayer().setGameMode(GameMode.SURVIVAL);
            }
            else {
                return;
            }
        }
    }
}
