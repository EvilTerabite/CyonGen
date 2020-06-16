package me.evilterabite.cyongen.util.permissionutil;

import me.evilterabite.cyongen.CyonGen;
import me.evilterabite.cyongen.util.items.customItems;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupManager {
    public static String getPlayerGroup(Player player) {
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
        for (String group:groups) {
            if(player.hasPermission("group." + group)) {
                return "group." + group;
            }
        }
        return null;
    }

    public static List<ItemStack> getLevelRequirements(String group) {
        Plugin cyongen = CyonGen.getPlugin(CyonGen.class);
        if(group.equals("levelone")) {
            ItemStack lOneMineShards = customItems.getMineShard(3);
            ItemStack lOneFarmShards = customItems.getFarmShard(3);
            ItemStack lOneMobShards = customItems.getMobShard(3);
            List<ItemStack> levelOneReq = new ArrayList<>();
            levelOneReq.add(lOneMineShards);
            levelOneReq.add(lOneFarmShards);
            levelOneReq.add(lOneMobShards);
            return levelOneReq;

        }

        return null;
    }

}
