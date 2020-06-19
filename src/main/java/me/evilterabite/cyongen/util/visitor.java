package me.evilterabite.cyongen.util;

import com.songoda.skyblock.api.SkyBlockAPI;
import com.songoda.skyblock.api.island.Island;
import com.songoda.skyblock.api.island.IslandManager;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Set;
import java.util.UUID;

public class visitor {
    public static Boolean check(Player player) {
        IslandManager islandManager = SkyBlockAPI.getIslandManager();
        Island island = islandManager.getIslandAtLocation(player.getLocation());
        Set<UUID> visitors = islandManager.getVisitorsAtIsland(island);
        for (UUID playerUUID : visitors) {
            if (player.getUniqueId() == playerUUID) {
                return true;
            }
        }
        return false;
    }
}
