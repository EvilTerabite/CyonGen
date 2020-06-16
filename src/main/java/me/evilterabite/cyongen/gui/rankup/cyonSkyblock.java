package me.evilterabite.cyongen.gui.rankup;

import com.songoda.skyblock.api.island.Island;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class cyonSkyblock {
    public static Player getIslandOwner(Island island) {
        if(Bukkit.getPlayer(island.getOwnerUUID()) != null) {
            return Bukkit.getPlayer(island.getOwnerUUID());
        }

        else if(Bukkit.getPlayer(island.getOriginalOwnerUUID()) != null){
            return Bukkit.getPlayer(island.getOriginalOwnerUUID());
        }

        else {
            return null;
        }
    }
}
