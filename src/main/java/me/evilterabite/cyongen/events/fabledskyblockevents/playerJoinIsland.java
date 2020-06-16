package me.evilterabite.cyongen.events.fabledskyblockevents;

import com.songoda.skyblock.api.event.player.PlayerIslandJoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class playerJoinIsland implements Listener {
    @EventHandler
    void isPlayerJoin(PlayerIslandJoinEvent e) {
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),
                ("equalizePlayer %player%")
                .replace("%player%", e.getPlayer().getName()));
    }
}
