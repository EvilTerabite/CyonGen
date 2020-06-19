package me.evilterabite.cyongen.events;

import com.songoda.skyblock.api.SkyBlockAPI;
import com.songoda.skyblock.api.event.player.PlayerIslandEnterEvent;
import com.songoda.skyblock.api.island.Island;
import com.songoda.skyblock.api.island.IslandManager;
import me.evilterabite.cyongen.util.messages;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Set;
import java.util.UUID;

public class denyIslandBreak implements Listener {
    @EventHandler
    void onBlockBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();
        IslandManager islandManager = SkyBlockAPI.getIslandManager();
        Island island = islandManager.getIslandAtLocation(player.getLocation());
        Set<UUID> visitors = islandManager.getVisitorsAtIsland(island);
        for(UUID playerUUID : visitors) {
            if(player.getUniqueId() == playerUUID) {
                e.setCancelled(true);
                e.getBlock().getDrops().clear();
                messages.get("denyBreak", player);
            }
        }
    }
}
