package com.portalthree.ultimatesimproved.Events;

import com.portalthree.ultimatesimproved.UltimatesImproved;
import com.portalthree.ultimatesimproved.Utils.Animate;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Set;

public class EventListener implements Listener {

    @EventHandler
    public void onBlockPlaced(BlockPlaceEvent event){
        Material blockType = event.getBlock().getType();
        final Player player = event.getPlayer();

        if(blockType == Material.ENDER_PORTAL_FRAME){
            event.setCancelled(true);

            ArmorStand stand = (ArmorStand) player.getWorld().spawnEntity(player.getTargetBlock((Set<Material>) null, 200).getLocation().add(0, -1, 0), EntityType.ARMOR_STAND);
            stand.setHelmet(new ItemStack(Material.ENDER_PORTAL_FRAME));
            stand.setVisible(false);
            stand.setGravity(false);
            int animate = Bukkit.getScheduler().scheduleAsyncRepeatingTask(UltimatesImproved.getPlugin(), new Animate(stand), 0, 1);
            Bukkit.getScheduler().runTaskLater((UltimatesImproved.getPlugin()), () -> player.getWorld().spawnEntity(stand.getLocation().add(0, 1.5, 0), EntityType.ENDER_CRYSTAL), 20L);


            new BukkitRunnable() {

                @Override
                public void run() {
                    Bukkit.getScheduler().cancelTask(animate);
                    stand.remove();
                }
            }.runTaskLater(UltimatesImproved.getPlugin(), 50);

            Bukkit.getScheduler().runTaskLater((UltimatesImproved.getPlugin()), new Runnable() {

                @Override
                public void run() {
                    player.getWorld().strikeLightning(stand.getLocation());

                }

            }, 50L);
            }
        }
    }
