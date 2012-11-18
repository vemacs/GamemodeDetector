package com.nullblock.vemacs.GamemodeDetector;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class GamemodeDetectorListener implements Listener {
 
    private GamemodeDetector plugin;
 
    public GamemodeDetectorListener(GamemodeDetector gamemodeDetector) {
        plugin = gamemodeDetector;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
 
        @EventHandler(priority = EventPriority.MONITOR)
        public void onPlayerGameModeChangeEvent(PlayerGameModeChangeEvent event) {
        	Player player = event.getPlayer();
        	String playerName = player.getDisplayName();
        	GameMode newGameMode = event.getNewGameMode();
        	if (newGameMode.equals(GameMode.CREATIVE)){
        		Bukkit.broadcastMessage( playerName + ChatColor.DARK_RED + " is not playing legit!" );
        		}	
        	else if (newGameMode.equals(GameMode.SURVIVAL)) {
        		Bukkit.broadcastMessage( playerName + ChatColor.DARK_GREEN + " is now playing legit!" );
        	}
        	else if (newGameMode.equals(GameMode.ADVENTURE)) {
        		Bukkit.broadcastMessage( playerName + ChatColor.BLUE + " is feeling adventurous!" );
        	}
        }
    }