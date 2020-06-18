package me.evilterabite.cyongen.events;

import net.luckperms.api.LuckPerms;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.Permission;
import sun.jvm.hotspot.ui.ObjectHistogramPanel;

import java.util.HashSet;
import java.util.Set;

public class assignLevelZero implements Listener {
    @EventHandler
    void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        Set<String> groups = new HashSet<>();
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
        for (String group : groups) {
            if (p.hasPermission("group." + group)) {
                break;
            }
            else {
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),
                        "lp user %player% permission set cyon.levelzero true"
                                .replace("%user%", p.getName()));
            }
        }
    }
}
