package com.drathonix.notrample;

import org.bukkit.plugin.java.JavaPlugin;

public final class Notrample extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TrampleStopper(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
