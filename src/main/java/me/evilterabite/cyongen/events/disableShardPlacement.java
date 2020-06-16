package me.evilterabite.cyongen.events;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class disableShardPlacement implements Listener {
    @EventHandler
    void onShardPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        ItemStack shard = p.getInventory().getItemInMainHand();
        if(shard.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Mining Shard")) {
            e.setCancelled(true);
        }
        else if(shard.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Farming Shard")) {
            e.setCancelled(true);
        }
        else if(shard.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Mob Shard")) {
            e.setCancelled(true);
        }
        else if(shard.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Event Shard")) {
            e.setCancelled(true);
        }

    }
}
