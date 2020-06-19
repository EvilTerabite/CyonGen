package me.evilterabite.cyongen.DropsEvents.FarmDrops;

import me.evilterabite.cyongen.CyonGen;
import me.evilterabite.cyongen.util.items.customItems;
import me.evilterabite.cyongen.util.itemCreator;
import me.evilterabite.cyongen.util.rates;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.bukkit.Material.*;

public class ripeCropDrops implements Listener {
    @EventHandler
    void onRipeCropBreak(BlockBreakEvent e) {
        Block b = e.getBlock();
        Player p = e.getPlayer();
        Set<Material> ripeCrops = new HashSet<>();
        Set<Material> starterCrops = new HashSet<>();
        starterCrops.add(WHEAT);
        starterCrops.add(POTATOES);
        ripeCrops.add(NETHER_WART);
        ripeCrops.add(CARROTS);
        ripeCrops.add(BEETROOTS);
        if (ripeCrops.contains(b.getType())) {
            double rate = rates.getFarmFragmentRates(b);
            if(rate != 101) {
                if (Math.random() < rate) {
                    if (itemCreator.isFullyGrownDep(b)) {
                        Location bLoc = b.getLocation();
                        World bWorld = b.getWorld();
                        Collection<ItemStack> bDrops = b.getDrops();
                        ItemStack farmFragment = customItems.getFarmFragment(1);
                        bDrops.clear();
                        bWorld.dropItemNaturally(bLoc, farmFragment);
                    }
                }
            }
        }
        else {
            FileConfiguration config = CyonGen.getPlugin(CyonGen.class).getConfig();
            if (starterCrops.contains(b.getType())) {
                if (Math.random() < config.getDouble("SFarmingDropRate")) {
                    if (itemCreator.isFullyGrownDep(b)) {
                        Location bLoc = b.getLocation();
                        World bWorld = b.getWorld();
                        Collection<ItemStack> bDrops = b.getDrops();
                        ItemStack farmFragment = customItems.getStarterFarmShard(1);
                        bDrops.clear();
                        bWorld.dropItemNaturally(bLoc, farmFragment);
                    }
                }
            }
        }
    }
}
