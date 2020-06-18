package me.evilterabite.cyongen.events;

import me.evilterabite.cyongen.util.WeightedRandomBag;
import me.evilterabite.cyongen.util.items.customItems;
import me.evilterabite.cyongen.util.logChannel;
import me.evilterabite.cyongen.util.rates;
import org.bukkit.*;
import org.bukkit.block.Block;
import me.evilterabite.cyongen.CyonGen;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class onCobbleBreak implements Listener {
    @EventHandler
    void cobbleBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        Plugin cyongen = CyonGen.getPlugin(CyonGen.class);
        Block b = e.getBlock();
        World bWorld = b.getWorld();
        Location bLoc = b.getLocation();
        WeightedRandomBag<Material> genBlocks = new WeightedRandomBag<>();
        rates.getBlockRates(p, genBlocks);
        if (b.getRelative(BlockFace.DOWN).getType() == Material.END_STONE) {
            double random = Math.random();
            if(!p.hasPermission("group.default") || !p.hasPermission("group.levelone") || !p.hasPermission("group.leveltwo") || !p.hasPermission("group.levelthree")) {
                if (random < rates.getMineFragmentRate(b)) {
                    ItemStack fragment = customItems.getMineFragment(1);
                    p.sendMessage(ChatColor.AQUA + "You got a mining fragment!");
                    bWorld.dropItemNaturally(bLoc, fragment);
                }
                Bukkit.getServer().getScheduler().runTaskLater(cyongen, new Runnable() {
                    @Override
                    public void run() {
                        Material gen = genBlocks.getRandom();
                        if (b.getRelative(BlockFace.DOWN).getType() == Material.END_STONE) {
                            b.setType(gen);
                        } else {
                            p.sendMessage("[CyonGen] Could not find Mining Node, de-spawned generator block!");
                        }
                    }
                }, 20 * cyongen.getConfig().getInt("CobblestoneGenerationTime"));
            }
            else {
                if (random < rates.getMineFragmentRate(b)) {
                    ItemStack fragment = customItems.getStarterMineShard(1);
                    p.sendMessage(ChatColor.AQUA + "You got a mining fragment!");
                    bWorld.dropItemNaturally(bLoc, fragment);
                }
                Bukkit.getServer().getScheduler().runTaskLater(cyongen, new Runnable() {
                    @Override
                    public void run() {
                        Material gen = genBlocks.getRandom();
                        if (b.getRelative(BlockFace.DOWN).getType() == Material.END_STONE) {
                            b.setType(gen);
                        } else {
                            p.sendMessage("[CyonGen] Could not find Mining Node, de-spawned generator block!");
                        }
                    }
                }, 20 * cyongen.getConfig().getInt("CobblestoneGenerationTime"));
            }
        }
    }
}