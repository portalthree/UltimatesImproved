package com.portalthree.ultimatesimproved.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemHandler {

    public static ItemStack mageulti;

    public static void init(){
        createMageUlti();
    }

    private static void createMageUlti(){
        ItemStack item = new ItemStack(Material.ENDER_PORTAL_FRAME, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dMage Ultimate");
        List<String> lore = new ArrayList<>();
        lore.add("§6Item Ability: Ultimate Portal " + ChatColor.YELLOW + "" + ChatColor.BOLD + "RIGHT CLICK");
        lore.add("");
        lore.add("§7This item will spawn in a powerful portal allowing");
        lore.add("§7you to inflict damage to every mob in a radius of " + ChatColor.YELLOW + "16 blocks");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "MYTHIC DUNGEON ITEM");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        mageulti = item;
    }
}
