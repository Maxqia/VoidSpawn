package com.endercrest.voidspawn.commands;

import org.bukkit.entity.Player;

public interface SubCommand {

    /**
     * Method is called when the subcommand is ran via a command.
     *
     * @param p The player who executed the command
     * @param args The arguments passed along with the command. First arg will be the sub command.
     * @return Returns whether successfully executed.
     */
    boolean onCommand(Player p, String[] args);

    /**
     * The help info given to the players upon help with commands.
     *      ie. "/vs set [name] - Sets the spawn for the world"
     *
     * @return Returns string with details of command and paramteters.
     */
    String helpInfo();

    /**
     * The permission required for a player to execute that command.
     * @return The permission node.
     */
    String permission();
}
