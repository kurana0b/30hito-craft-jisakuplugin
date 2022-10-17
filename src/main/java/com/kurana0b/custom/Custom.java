package com.kurana0b.custom;

import com.kurana0b.custom.me.Events;
import org.bukkit.plugin.java.JavaPlugin;

public final class Custom extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Plugin has been loaded.");
        getLogger().info("Plugin has been started.");

        getServer().getPluginManager().registerEvents(new Events(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin has been stoped.");
    }
}
