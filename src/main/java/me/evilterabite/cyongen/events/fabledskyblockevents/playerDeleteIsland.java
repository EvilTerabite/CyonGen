package me.evilterabite.cyongen.events.fabledskyblockevents;

import com.songoda.skyblock.api.event.island.IslandDeleteEvent;
import com.songoda.skyblock.api.island.Island;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.HashSet;
import java.util.Set;

public class playerDeleteIsland implements Listener {
    @EventHandler
    void leaveIS(IslandDeleteEvent e) {
        Island island = e.getIsland();
        OfflinePlayer p = Bukkit.getOfflinePlayer(island.getOwnerUUID());
        if(p.isOnline()) {
            Player player = (Player) p;
            Set<String> groups = new HashSet<>();
            Set<String> ranks = new HashSet<>();
            groups.add("levelone");
            groups.add("leveltwo");
            groups.add("levelthree");
            groups.add("levelfour");
            groups.add("levelfive");
            groups.add("levelsix");
            groups.add("levelseven");
            groups.add("leveleight");
            groups.add("levelnine");
            groups.add("levelten");
            groups.add("leveleleven");
            groups.add("leveltwleve");
            groups.add("levelthirteen");
            groups.add("levelfourteen");
            groups.add("levelfifteen");

            ranks.add("rank6");
            ranks.add("rank5");
            ranks.add("rank4");
            ranks.add("rank3");
            ranks.add("rank2");
            ranks.add("rank1");
            ranks.add("sb-mod");
            ranks.add("cyonbuilder");
            ranks.add("sb-helper");
            ranks.add("sb-senior-mod");
            ranks.add("cyonadmin");
            ranks.add("cyondev");
            ranks.add("cyonmanager");
            ranks.add("owner");
            for (String str : groups) {
                if (player.hasPermission("group." + str)) {
                    System.out.println("group." + str);
                    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                            "lp user %username% permission unset %groupName%")
                            .replace("%username%", p.getName())
                            .replace("%groupName%", "group." + str)
                    );
                    for (String s : ranks) {
                        if (player.hasPermission("group." + s)) {
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                                    "lp user %username% permission set %groupName%")
                                    .replace("%username%", p.getName())
                                    .replace("%groupName%", "group." + s)
                            );
                        }
                    }
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[&cCyonGen&7] &aYour level has been reset because you left the island."));
                }
            }
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                    "lp user %username% permission set %groupName%")
                    .replace("%username%", p.getName())
                    .replace("%groupName%", "group.default")
            );
        }
    }
}
