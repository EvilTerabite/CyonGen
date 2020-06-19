package me.evilterabite.cyongen.events;

import me.evilterabite.cyongen.CyonGen;
import me.evilterabite.cyongen.util.messages;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.Plugin;

public class generatorPlace implements Listener {

    @EventHandler
    void onGeneratorPlace(BlockPlaceEvent e) {
        Block b = e.getBlockPlaced();
        Player p = e.getPlayer();
        if(b.getType() == Material.END_STONE) {
            Block cobbleGen = b.getRelative(BlockFace.UP);
            if (cobbleGen.getType() == Material.AIR) {
                cobbleGen.setType(Material.BEDROCK);
                messages.get("generatorPlaced", p);
                Plugin cyongen = CyonGen.getPlugin(CyonGen.class);
                p.sendMessage("[CyonGen] Your generator will be available in " + cyongen.getConfig().getInt("GeneratorCooldown") + " seconds.");
                Bukkit.getServer().getScheduler().runTaskLater(cyongen, new Runnable() {
                    @Override
                    public void run() {
                        cobbleGen.breakNaturally();
                        cobbleGen.getDrops().clear();
                        if(cobbleGen.getRelative(BlockFace.DOWN).getType() == Material.END_STONE) {
                            cobbleGen.setType(Material.COBBLESTONE);
                            p.sendMessage("[CyonGen] Your generator is now ready.");
                        }
                        else {
                            p.sendMessage("[CyonGen] Could not find generator under block. Despawning Bedrock.");
                        }
                    }
                }, 20 * cyongen.getConfig().getInt("GeneratorCooldown"));
            }

            else {
                p.sendMessage("[CyonGen] Could not create generator, there is a block above.");
                e.setCancelled(true);
            }
        }
    }


}
