package me.evilterabite.cyongen.util.permissionutil;

import com.songoda.skyblock.api.SkyBlockAPI;
import com.songoda.skyblock.api.island.Island;
import me.evilterabite.cyongen.CyonGen;
import me.evilterabite.cyongen.gui.rankup.cyonSkyblock;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.List;
import java.util.Set;
import java.util.UUID;


public class coopPlayers implements Listener {
    public static void coop(Player p, String promoteTo) {
        Island island = SkyBlockAPI.getIslandManager().getIsland(p);
        List<Player> coopPlayers = SkyBlockAPI.getIslandManager().getPlayersAtIsland(island);
        for (Player coopPlayer : coopPlayers) {
            if (coopPlayer != null) {
                if(!coopPlayer.getName().equalsIgnoreCase(p.getName())) {
                    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                            "lp user %username% promote islevels")
                            .replace("%username%", coopPlayer.getName())
                    );
                }
            }
        }
    }
    public static void equalizeCoop(Player player) {
        Island island = SkyBlockAPI.getIslandManager().getIsland(player);
        if(island != null) {
            System.out.println(island.getOwnerUUID().toString());
            Player islandOwner = cyonSkyblock.getIslandOwner(island);
            String islandOwnerGroup = GroupManager.getPlayerGroup(islandOwner);
            Set<UUID> coopPlayers = SkyBlockAPI.getIslandManager().getMembersOnline(island);
            for (UUID uuid : coopPlayers) {
                Player coopPlayer = Bukkit.getPlayer(uuid);
                if (islandOwner != null) {
                    if (coopPlayer != null) {
                        if (islandOwnerGroup != null) {
                            String coopPlayerGroup = GroupManager.getPlayerGroup(coopPlayer);
                            if (coopPlayerGroup != null) {
                                if (coopPlayer != islandOwner) {
                                    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                                            "lp user %username% permission unset %groupName%")
                                            .replace("%username%", coopPlayer.getName())
                                            .replace("%groupName%", coopPlayerGroup)
                                    );
                                    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                                            "lp user %username% permission set %groupName%")
                                            .replace("%username%", coopPlayer.getName())
                                            .replace("%groupName%", islandOwnerGroup)
                                    );
                                }
                            } else {
                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                                        "lp user %username% permission set %groupName%")
                                        .replace("%username%", coopPlayer.getName())
                                        .replace("%groupName%", islandOwnerGroup)
                                );
                            }
                        } else {
                            islandOwner.sendMessage("[CyonGen] You need to be level one or above to be equalized.");
                        }
                    }
                } else {
                    System.out.println("[CyonGen ERROR] Owner UUID is null for island " + island);
                }
            }
        }
        else {
            String logChannel = CyonGen.getPlugin(CyonGen.class).getConfig().getString("discordLogChannel");
            System.out.println("[CyonGen] Island NULL (ignore this if you are not Jeremy!) this error was logged in discord.");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), (
                    "discord broadcast #%logChannel% @Owner @Jeremy [CyonGen] Could not equalize player, no island found!"
                    .replace("%logChannel%", logChannel)));
        }
    }

}
