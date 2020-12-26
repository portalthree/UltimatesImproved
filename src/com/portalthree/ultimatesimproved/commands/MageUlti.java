package com.portalthree.ultimatesimproved.commands;

import com.portalthree.ultimatesimproved.Items.ItemHandler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MageUlti implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {
        if (sender instanceof Player){
            Player player = (Player) sender;

            player.sendMessage("This is a test.");
            player.getInventory().addItem(ItemHandler.mageulti);
        }

        return true;
    }
}
