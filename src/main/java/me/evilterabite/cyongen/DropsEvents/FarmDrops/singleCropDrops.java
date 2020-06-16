package me.evilterabite.cyongen.DropsEvents.FarmDrops;

import me.evilterabite.cyongen.util.items.customItems;
import me.evilterabite.cyongen.util.rates;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.bukkit.Material.*;

public class singleCropDrops implements Listener {
    @EventHandler
    void cropBreak(BlockBreakEvent e) {
        Block b = e.getBlock();
        Set<Material> crops = new HashSet<>();
        crops.add(MELON);
        crops.add(PUMPKIN);
        if (crops.contains(b.getType())) {
            if (Math.random() < rates.getFarmFragmentRates(b)) {
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
