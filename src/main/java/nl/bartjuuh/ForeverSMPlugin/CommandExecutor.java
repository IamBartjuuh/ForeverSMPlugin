package nl.bartjuuh.ForeverSMPlugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

import static org.bukkit.Bukkit.getLogger;

public class CommandExecutor implements org.bukkit.command.CommandExecutor {

    @Override
    public boolean onCommand(
            CommandSender sender,
            Command command,
            String label,
            String[] args
    ) {
        if (!command.getName().equalsIgnoreCase("profile")) {
            return false;
        }

        if (!(sender instanceof Player player)) {
            sender.sendMessage(Component.text(
                    "This command can only be executed by a player.",
                    NamedTextColor.RED
            ));
            return true;
        }

        if (args.length == 0) {
            player.sendMessage(Component.text(
                    "Please use one of the following options: save, load",
                    NamedTextColor.RED
            ));
            return true;
        }

        if (args[0].equalsIgnoreCase("save")) {
            if(ProfileManager.SaveProfile(player)){
                player.sendMessage(Component.text("Your player data has been saved!", NamedTextColor.GREEN));
            }
            return true;
        }

        if (args[0].equalsIgnoreCase("load")) {
            if(ProfileManager.LoadProfile(player)){
                player.sendMessage(Component.text("Your player data has been loaded!", NamedTextColor.GREEN));
            }
            return true;
        }

        player.sendMessage(Component.text(
                "Unknown option. Use: /profile save or /profile load",
                NamedTextColor.RED
        ));
        return true;
    }

}
