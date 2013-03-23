package com.nullblock.vemacs.GamemodeDetector;

import org.bukkit.plugin.java.JavaPlugin;

public final class GamemodeDetector extends JavaPlugin {
    @Override
    public void onEnable() {
        new GamemodeDetectorListener(this);
    }
    @Override
    public void onDisable() {        
        
    }

}
