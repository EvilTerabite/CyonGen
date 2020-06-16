package me.evilterabite.cyongen.events.fabledskyblockevents;

import com.songoda.skyblock.api.event.player.PlayerIslandLeaveEvent;
import net.luckperms.api.LuckPerms;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.HashSet;
import java.util.Set;

public class playerLeaveIsland implements Listener {
    @EventHandler
    void onIsLeave(PlayerIslandLeaveEvent e) {
        Player p = e.getPlayer();
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
        for(String str : groups) {
            if(p.hasPermission("group." + str)) {
                System.out.println("group." + str);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                        "lp user %username% permission unset %groupName%")
                        .replace("%username%", p.getName())
                        .replace("%groupName%", "group." + str)
                );
                for(String s : ranks) {
                    if (p.hasPermission("group." + s)) {
                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                                "lp user %username% permission set %groupName%")
                                .replace("%username%", p.getName())
                                .replace("%groupName%", "group." + s)
                        );
                    }
                }
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[&cCyonGen&7] &aYour level has been reset because you left the island."));
            }
        }
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                "lp user %username% permission set %groupName%")
                .replace("%username%", p.getName())
                .replace("%groupName%", "group.default")
        );
    }
}
