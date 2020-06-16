package me.evilterabite.cyongen.events;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class endstoneRename implements Listener {
    @EventHandler
    void onBlockBreak(BlockBreakEvent e) {
        Block b = e.getBlock();
        Location bLoc = b.getLocation();
        World bWorld = b.getWorld();
        if(b.getType() == Material.END_STONE) {
            ItemStack cobbleGen = new ItemStack(Material.END_STONE, 1);
            ItemMeta cobbleGenMeta = cobbleGen.getItemMeta();
            e.setDropItems(false);
            cobbleGenMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&',
                    "&7&lMining Node"));
            cobbleGen.setItemMeta(cobbleGenMeta);
            Objects.requireNonNull(Bukkit.getServer().getWorld(bWorld.getName())).dropItemNaturally(bLoc, cobbleGen);
        }
    }
}
