package me.evilterabite.cyongen.gui.shardcraft;

import me.evilterabite.cyongen.util.itemCreator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class shardcraftGUI {
    public static void openShardCraftGUI(Player p) {
        Inventory inv = Bukkit.createInventory(null, 9, "Shard Crafting");
        List<String> shardLore = new ArrayList<>();
        shardLore.add(ChatColor.translateAlternateColorCodes('&', "&aCraft shards here!"));
        inv.setItem(0, itemCreator.createItem(Material.BLACK_STAINED_GLASS_PANE, "Put fragments in the slot to craft shards", shardLore));
        inv.setItem(1, itemCreator.createItem(Material.BLACK_STAINED_GLASS_PANE, "Put fragments in the slot to craft shards", shardLore));
        inv.setItem(2, itemCreator.createItem(Material.BLACK_STAINED_GLASS_PANE, "Put fragments in the slot to craft shards", shardLore));
        inv.setItem(3, itemCreator.createItem(Material.BLACK_STAINED_GLASS_PANE, "Put fragments in the slot to craft shards", shardLore));
        inv.setItem(5, itemCreator.createItem(Material.BLACK_STAINED_GLASS_PANE, "Put fragments in the slot to craft shards", shardLore));
        inv.setItem(6, itemCreator.createItem(Material.BLACK_STAINED_GLASS_PANE, "Put fragments in the slot to craft shards", shardLore));
        inv.setItem(7, itemCreator.createItem(Material.BLACK_STAINED_GLASS_PANE, "Put fragments in the slot to craft shards", shardLore));
        inv.setItem(8, itemCreator.createItem(Material.GREEN_CONCRETE, "CONFIRM", shardLore));
        p.openInventory(inv);
    }
}
