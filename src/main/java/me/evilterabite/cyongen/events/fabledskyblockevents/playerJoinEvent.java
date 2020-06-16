package me.evilterabite.cyongen.events.fabledskyblockevents;

import com.songoda.skyblock.api.island.IslandManager;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class playerJoinEvent implements Listener {
    @EventHandler
    void playerJoin(PlayerJoinEvent e) {
        if (IslandManager.hasIsland(e.getPlayer())) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),
                    ("equalizePlayer %player%")
                            .replace("%player%", e.getPlayer().getName()));
            /*Island island = SkyBlockAPI.getIslandManager().getIsland(e.getPlayer());
            coopPlayers.equalizeCoop(island);
            e.getPlayer().sendMessage("[CyonGen] Your levels have been successfully synced with your island.");
            logChannel.sendMessage(e.getPlayer() + "joined. Syncing levels."); */
        }
    }
}
