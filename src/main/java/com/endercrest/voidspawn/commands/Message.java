package com.endercrest.voidspawn.commands;

import com.endercrest.voidspawn.ConfigManager;
import com.endercrest.voidspawn.VoidSpawn;
import org.bukkit.entity.Player;

public class Message implements SubCommand {

    @Override
    public boolean onCommand(Player p, String[] args) {
        if(!p.hasPermission(permission())){
            p.sendMessage(VoidSpawn.colorize("&cYou do not have permission."));
            return true;
        }
        if(args.length == 1){
            p.sendMessage(VoidSpawn.colorize(VoidSpawn.prefix + "&cYou must provide a message"));
        }else if(args.length > 1) {
            String message = "";
            for(int i = 1; i < args.length; i++){
                message += args[i]+" ";
            }
            ConfigManager.getInstance().setMessage(message, p.getWorld().getName());
            p.sendMessage(VoidSpawn.colorize(VoidSpawn.prefix + "Message Set!"));
        }
        return true;
    }

    @Override
    public String helpInfo() {
        return "/vs message (message) - Adds a teleport message upon a player teleports.";
    }

    @Override
    public String permission() {
        return "vs.admin.message";
    }
}
