package com.drathonix.notrample;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerLoginEvent;

public class TrampleStopper implements Listener {
    @EventHandler
    public void onTrample(PlayerInteractEvent event) {
        if(event.getAction() == Action.PHYSICAL){
            Block block = event.getClickedBlock();
            if (block != null) {
                if(block.getType() == Material.FARMLAND){
                    event.setCancelled(true);
                }
            }
        }
    }
    @EventHandler
    public void onTrampleEntity(EntityInteractEvent event) {
        Block block = event.getBlock();
        if(block.getType() == Material.FARMLAND){
            event.setCancelled(true);
        }
    }
}
