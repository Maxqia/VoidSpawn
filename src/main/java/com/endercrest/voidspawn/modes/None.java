package com.endercrest.voidspawn.modes;

import com.endercrest.voidspawn.ConfigManager;
import org.bukkit.entity.Player;

public class None implements SubMode {
    @Override
    public boolean onActivate(Player player, String worldName) {
        return true;
    }

    @Override
    public boolean onSet(String[] args, String worldName, Player p) {
        ConfigManager.getInstance().setMode(worldName, args[1]);
        return true;
    }

    @Override
    public String getHelp() {
        return "&6None &f- Sets the world to have no mode";
    }
}
