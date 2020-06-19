package me.evilterabite.cyongen.util;

import me.evilterabite.cyongen.CyonGen;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import static org.bukkit.Material.*;

public class rates {

    public static double getMineFragmentRate(Block b) {
        Plugin cyongen = CyonGen.getPlugin(CyonGen.class);
        Configuration config = cyongen.getConfig();
        if(b.getType() == Material.COBBLESTONE) {
            double rate = config.getDouble("CobbleDropRate");
            return rate;
        }

        else if (b.getType() == Material.IRON_ORE) {
            double rate = config.getDouble("IronDropRate");
            return rate;
        }

        else if (b.getType() == Material.COAL_ORE) {
            double rate = config.getDouble("CoalDropRate");
            return rate;
        }

        else if (b.getType() == Material.REDSTONE_ORE) {
            double rate = config.getDouble("RedstoneDropRate");
            return rate;
        }

        else if (b.getType() == Material.LAPIS_ORE) {
            double rate = config.getDouble("LapisDropRate");
            return rate;
        }

        else if (b.getType() == Material.GOLD_ORE) {
            double rate = config.getDouble("GoldDropRate");
            return rate;
        }

        else if (b.getType() == Material.DIAMOND_ORE) {
            double rate = config.getDouble("DiamondDropRate");
            return rate;
        }

        else if (b.getType() == Material.EMERALD_ORE) {
            double rate = config.getDouble("EmeraldDropRate");
            return rate;
        }

        else if(b.getType() == MOSSY_COBBLESTONE) {
            return 101;
        }

        else {
            System.out.println("CyonGen Exception: Block broken was not in the verified block list.");
            System.out.println("Don't worry Jeremy has logged this error! Still let him know about it.");
        }




        System.out.println("Cyongen ERROR: No rate specified.");
        System.out.println("Tell Jeremy about this error!");
        System.out.println("[CyonGen] Setting drop rate to 0.");
        double noRate = 0;
        return noRate;
    }



    public static double getFarmFragmentRates(Block b) {
        Material mat = b.getType();
        Plugin cyongen = CyonGen.getPlugin(CyonGen.class);
        Configuration config = cyongen.getConfig();
        if(mat == Material.WHEAT) {
            double rate = config.getDouble("WheatDropRate");
            return 101;
        }
        else if(mat == Material.CARROTS) {
            double rate = config.getDouble("CarrotDropRate");
            return rate;
        }
        else if(mat == Material.POTATOES) {
            double rate = config.getDouble("PotatoDropRate");
            return 101;
        }
        else if(mat == Material.PUMPKIN) {
            double rate = config.getDouble("PumpkinDropRate");
            return rate;
        }
        else if(mat == Material.MELON) {
            double rate = config.getDouble("MelonDropRate");
            return rate;
        }

        else if(mat == BEETROOTS) {
            double rate = config.getDouble("BeetrootDropRate");
            return rate;
        }

        else if(mat == SUGAR_CANE) {
            double rate = config.getDouble("SugarCaneDropRate");
            return rate;
        }

        else if(mat == Material.CACTUS) {
            double rate = config.getDouble("CactusDropRate");
            return rate;
        }

        else if(mat == NETHER_WART) {
            return config.getDouble("NetherWartDropRate");
        }

        double noRate = 0.00;
        return noRate;
    }

    public static double getMobRates(EntityType entityType) {
        Configuration config = CyonGen.getPlugin(CyonGen.class).getConfig();
        if(entityType == EntityType.RABBIT) {
            return config.getDouble("RabbitDropRate");
        }

        if(entityType == EntityType.CHICKEN) {
            return config.getDouble("ChickenDropRate");
        }

        if(entityType == EntityType.PIG) {
            return config.getDouble("PigDropRate");
        }

        if(entityType == EntityType.SHEEP) {
            return config.getDouble("SheepDropRate");
        }

        if(entityType == EntityType.COW) {
            return config.getDouble("CowDropRate");
        }

        if(entityType == EntityType.SPIDER) {
            return config.getDouble("SpiderDropRate");
        }

        if(entityType == EntityType.ZOMBIE) {
            return config.getDouble("ZombieDropRate");
        }

        if(entityType == EntityType.SKELETON) {
            return config.getDouble("SkeletonDropRate");
        }

        if(entityType == EntityType.CREEPER) {
            return config.getDouble("CreeperDropRate");
        }

        if(entityType == EntityType.PIG_ZOMBIE) {
            return config.getDouble("ZombiePigmanDropRate");
        }

        if(entityType == EntityType.IRON_GOLEM) {
            return config.getDouble("IronGolemDropRate");
        }

        if(entityType == EntityType.BLAZE) {
            return config.getDouble("BlazeDropRate");
        }

        else{
            return config.getDouble("MobDropRate");
        }
    }

    public static void getBlockRates(Player p, WeightedRandomBag<Material> genBlocks) {
        if(p.hasPermission("group.levelone")) {
            genBlocks.addEntry(Material.COBBLESTONE, 38);
            genBlocks.addEntry(MOSSY_COBBLESTONE, 60);
            genBlocks.addEntry(IRON_ORE, 2);
        }

        else if(p.hasPermission("group.leveltwo")) {
            genBlocks.addEntry(Material.COBBLESTONE, 35);
            genBlocks.addEntry(MOSSY_COBBLESTONE, 60);
            genBlocks.addEntry(Material.IRON_ORE, 5);
        }

        else if(p.hasPermission("group.levelthree")) {
            genBlocks.addEntry(Material.COBBLESTONE, 32);
            genBlocks.addEntry(MOSSY_COBBLESTONE, 60);
            genBlocks.addEntry(Material.IRON_ORE, 5);
            genBlocks.addEntry(Material.COAL_ORE, 3);
        }

        else if(p.hasPermission("group.levelfour")) {
            genBlocks.addEntry(Material.COBBLESTONE, 90);
            genBlocks.addEntry(Material.IRON_ORE, 5);
            genBlocks.addEntry(Material.COAL_ORE, 3);
            genBlocks.addEntry(Material.REDSTONE_ORE, 2);
        }

        else if(p.hasPermission("group.levelfive")) {
            genBlocks.addEntry(Material.COBBLESTONE, 88);
            genBlocks.addEntry(Material.IRON_ORE, 6);
            genBlocks.addEntry(Material.COAL_ORE, 3);
            genBlocks.addEntry(Material.REDSTONE_ORE, 2);
            genBlocks.addEntry(Material.LAPIS_ORE, 1);
        }

        else if(p.hasPermission("group.levelsix")) {
            genBlocks.addEntry(Material.COBBLESTONE, 85);
            genBlocks.addEntry(Material.IRON_ORE, 7);
            genBlocks.addEntry(Material.COAL_ORE, 4);
            genBlocks.addEntry(Material.REDSTONE_ORE, 2);
            genBlocks.addEntry(Material.LAPIS_ORE, 2);
        }

        else if(p.hasPermission("group.levelseven")) {
            genBlocks.addEntry(Material.COBBLESTONE, 82);
            genBlocks.addEntry(Material.IRON_ORE, 7);
            genBlocks.addEntry(Material.COAL_ORE, 5);
            genBlocks.addEntry(Material.REDSTONE_ORE, 3);
            genBlocks.addEntry(Material.LAPIS_ORE, 2);
            genBlocks.addEntry(Material.GOLD_ORE, 1);
        }

        else if(p.hasPermission("group.leveleight")) {
            genBlocks.addEntry(Material.COBBLESTONE, 80);
            genBlocks.addEntry(Material.IRON_ORE, 8);
            genBlocks.addEntry(Material.COAL_ORE, 5);
            genBlocks.addEntry(Material.REDSTONE_ORE, 4);
            genBlocks.addEntry(Material.LAPIS_ORE, 2);
            genBlocks.addEntry(Material.GOLD_ORE, 1);
        }

        else if(p.hasPermission("group.levelnine")) {
            genBlocks.addEntry(Material.COBBLESTONE, 78);
            genBlocks.addEntry(Material.IRON_ORE, 9);
            genBlocks.addEntry(Material.COAL_ORE, 5);
            genBlocks.addEntry(Material.REDSTONE_ORE, 4);
            genBlocks.addEntry(Material.LAPIS_ORE, 2);
            genBlocks.addEntry(Material.GOLD_ORE, 1);
        }

        else if(p.hasPermission("group.levelten")) {
            genBlocks.addEntry(Material.COBBLESTONE, 75);
            genBlocks.addEntry(Material.IRON_ORE, 10);
            genBlocks.addEntry(Material.COAL_ORE, 5);
            genBlocks.addEntry(Material.REDSTONE_ORE, 4);
            genBlocks.addEntry(Material.LAPIS_ORE, 3);
            genBlocks.addEntry(Material.GOLD_ORE, 2);
            genBlocks.addEntry(Material.DIAMOND_ORE, 2);
        }

        else if(p.hasPermission("group.leveleleven")) {
            genBlocks.addEntry(Material.COBBLESTONE, 72);
            genBlocks.addEntry(Material.IRON_ORE, 11);
            genBlocks.addEntry(Material.COAL_ORE, 7);
            genBlocks.addEntry(Material.REDSTONE_ORE, 4);
            genBlocks.addEntry(Material.LAPIS_ORE, 3);
            genBlocks.addEntry(Material.GOLD_ORE, 2);
            genBlocks.addEntry(Material.DIAMOND_ORE, 1);
        }

        else if(p.hasPermission("group.leveltwelve")) {
            genBlocks.addEntry(Material.COBBLESTONE, 70);
            genBlocks.addEntry(Material.IRON_ORE, 11);
            genBlocks.addEntry(Material.COAL_ORE, 7);
            genBlocks.addEntry(Material.REDSTONE_ORE, 4);
            genBlocks.addEntry(Material.LAPIS_ORE, 4);
            genBlocks.addEntry(Material.GOLD_ORE, 2);
            genBlocks.addEntry(Material.DIAMOND_ORE, 1);
            genBlocks.addEntry(Material.EMERALD_ORE, 1);
        }

        else if(p.hasPermission("group.levelthirteen")) {
            genBlocks.addEntry(Material.COBBLESTONE, 68);
            genBlocks.addEntry(Material.IRON_ORE, 12);
            genBlocks.addEntry(Material.COAL_ORE, 7);
            genBlocks.addEntry(Material.REDSTONE_ORE, 5);
            genBlocks.addEntry(Material.LAPIS_ORE, 4);
            genBlocks.addEntry(Material.GOLD_ORE, 2);
            genBlocks.addEntry(Material.DIAMOND_ORE, 1);
            genBlocks.addEntry(Material.EMERALD_ORE, 1);
        }

        else if(p.hasPermission("group.levelfourteen")) {
            genBlocks.addEntry(Material.COBBLESTONE, 65);
            genBlocks.addEntry(Material.IRON_ORE, 12);
            genBlocks.addEntry(Material.COAL_ORE, 8);
            genBlocks.addEntry(Material.REDSTONE_ORE, 5);
            genBlocks.addEntry(Material.LAPIS_ORE, 4);
            genBlocks.addEntry(Material.GOLD_ORE, 2);
            genBlocks.addEntry(Material.DIAMOND_ORE, 2);
            genBlocks.addEntry(Material.EMERALD_ORE, 2);
        }

        else if(p.hasPermission("group.levelfifteen")) {
            genBlocks.addEntry(Material.COBBLESTONE, 65);
            genBlocks.addEntry(Material.IRON_ORE, 12);
            genBlocks.addEntry(Material.COAL_ORE, 8);
            genBlocks.addEntry(Material.REDSTONE_ORE, 5);
            genBlocks.addEntry(Material.LAPIS_ORE, 4);
            genBlocks.addEntry(Material.GOLD_ORE, 2);
            genBlocks.addEntry(Material.DIAMOND_ORE, 2);
            genBlocks.addEntry(Material.EMERALD_ORE, 2);
        }




        else {
            genBlocks.addEntry(COBBLESTONE, 40);
            genBlocks.addEntry(MOSSY_COBBLESTONE, 60);
        }
    }
}
