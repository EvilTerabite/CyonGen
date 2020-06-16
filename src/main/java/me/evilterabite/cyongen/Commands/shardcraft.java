package me.evilterabite.cyongen.Commands;

import me.evilterabite.cyongen.gui.shardcraft.shardcraftGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class shardcraft implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            shardcraftGUI.openShardCraftGUI(p);
        }
        else {
            System.out.println("Cannot open GUI from console.");
        }
        return true;
    }
}

        /*if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("CyonGen.craft")) {
                Inventory pInv = p.getInventory();
                if (args.length > 0) {
                    String ar = args[0];
                    ItemStack mineShard = customItems.getMineShard(1);
                    if (ar.equalsIgnoreCase("mining")) {
                        ItemStack mainHand = p.getInventory().getItemInMainHand();
                        ItemMeta mainHandMeta = mainHand.getItemMeta();
                        if (!(mainHand.getType() == Material.AIR)) {
                            if (mainHandMeta.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Mining Fragment")) {
                                int fragmentAmount = mainHand.getAmount();
                                if (fragmentAmount >= 9) {
                                    mainHand.setAmount(fragmentAmount - 9);
                                    pInv.addItem(mineShard);
                                    p.sendMessage("Successfully crafted Mining Shard");
                                } else {
                                    p.sendMessage("You do not have enough mining shards.");
                                }
                            }
                        } else {
                            p.sendMessage("Can't turn air into Mining Shard!");
                        }
                    }
                    ItemStack farmShard = customItems.getFarmShard(1);
                    if (ar.equalsIgnoreCase("farming")) {
                        ItemStack mainHand = p.getInventory().getItemInMainHand();
                        ItemMeta mainHandMeta = mainHand.getItemMeta();
                        if (!(mainHand == new ItemStack(Material.AIR))) {
                            if (mainHandMeta.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Farming Fragment")) {
                                int fragmentAmount = mainHand.getAmount();
                                if (fragmentAmount >= 9) {
                                    mainHand.setAmount(fragmentAmount - 9);
                                    pInv.addItem(farmShard);
                                    p.sendMessage("Successfully crafted Farming Shard");
                                } else {
                                    p.sendMessage("You do not have enough farming shards.");
                                }
                            }
                        } else {
                            p.sendMessage("Can't turn air into Farming Shard!");
                        }
                    }

                    ItemStack eventShard = customItems.getEventShard(1);
                    if (ar.equalsIgnoreCase("event")) {
                        ItemStack mainHand = p.getInventory().getItemInMainHand();
                        ItemMeta mainHandMeta = mainHand.getItemMeta();
                        if (!(mainHand == new ItemStack(Material.AIR))) {
                            if (mainHandMeta.getDisplayName().equals(ChatColor.GREEN + "Event Shard")) {
                                int fragmentAmount = mainHand.getAmount();
                                if (fragmentAmount >= 4) {
                                    mainHand.setAmount(fragmentAmount - 4);
                                    pInv.addItem(eventShard);
                                    p.sendMessage("Successfully crafted Event Shard");
                                } else {
                                    p.sendMessage("You do not have enough event fragments.");
                                }
                            }
                        } else {
                            p.sendMessage("Can't turn air into Event Shard!");
                        }
                    }


                    ItemStack mobShard = customItems.getMobShard(1);
                    if (ar.equalsIgnoreCase("mob")) {
                        ItemStack mainHand = p.getInventory().getItemInMainHand();
                        ItemMeta mainHandMeta = mainHand.getItemMeta();
                        if (!(mainHand == new ItemStack(Material.AIR))) {
                            if (mainHandMeta.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "Mob Fragment")) {
                                int fragmentAmount = mainHand.getAmount();
                                if (fragmentAmount >= 9) {
                                    mainHand.setAmount(fragmentAmount - 9);
                                    pInv.addItem(mobShard);
                                    p.sendMessage("Successfully crafted Mob Shard");
                                } else {
                                    p.sendMessage("You do not have enough mob shards.");
                                }
                            }
                        } else {
                            p.sendMessage("Can't turn air into Mob Shard!");
                        }
                    } else {
                        p.sendMessage("/shardcraft <type> (i.e mining, mob, and farming");
                    }
                } else {
                    p.sendMessage("/shardcraft <type> (i.e mining, mob, and farming");
                }
            }
        }
        return true;
    }
         */


