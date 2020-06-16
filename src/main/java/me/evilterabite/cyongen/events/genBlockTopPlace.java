package me.evilterabite.cyongen.events;

import me.evilterabite.cyongen.CyonGen;
import me.evilterabite.cyongen.util.messages;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class genBlockTopPlace implements Listener {

    @EventHandler
    void onBlockPlace(BlockPlaceEvent e) {
        FileConfiguration config = CyonGen.getPlugin(CyonGen.class).getConfig();
        Block b = e.getBlockPlaced();
        Block target = b.getRelative(BlockFace.DOWN);
        if(target.getType() == Material.END_STONE) {
            e.setCancelled(true);
            messages.get("denyGenPlaceTop", e.getPlayer());
        }
    }

}
