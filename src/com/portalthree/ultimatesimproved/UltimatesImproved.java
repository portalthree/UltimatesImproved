package com.portalthree.ultimatesimproved;

import com.portalthree.ultimatesimproved.Events.EventListener;
import com.portalthree.ultimatesimproved.Items.ItemHandler;
import com.portalthree.ultimatesimproved.commands.MageUlti;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class UltimatesImproved extends JavaPlugin implements Listener {
    public static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getCommand("mage").setExecutor(new MageUlti());
        ItemHandler.init();
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }


    public static Plugin getPlugin() {
        return plugin;
    }

    @Override
    public void onDisable() {
    }

}
