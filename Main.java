package com.kurana0b.plugin;

import com.kurana0b.plugin.events.ChatEvent;
import com.kurana0b.plugin.events.ForceEvent;
import com.kurana0b.plugin.events.JoinEvent;
import com.kurana0b.plugin.events.QuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Plugin has been loaded.");
        getLogger().info("Plugin has been started.");

        getServer().getPluginManager().registerEvents(new JoinEvent(),this);
        getServer().getPluginManager().registerEvents(new QuitEvent(),this);
        getServer().getPluginManager().registerEvents(new ChatEvent(),this);
        getServer().getPluginManager().registerEvents(new ForceEvent(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin has been stoped.");
    }
}
