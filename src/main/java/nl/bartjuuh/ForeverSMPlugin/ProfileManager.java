package nl.bartjuuh.ForeverSMPlugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;

public class ProfileManager {

    public static boolean SaveProfile(Player player){
        if(player != null) {
            player.saveData();
            return true;
        } else {
            player.sendMessage(Component.text("An error has occured while trying to save your data. Please contact an administrator.", NamedTextColor.RED));
            return false;
        }
    }

    public static boolean LoadProfile(Player player){
        if(player != null) {
            player.loadData();
            return true;
        } else {
            player.sendMessage(Component.text("An error has occured while trying to save your data. Please contact an administrator.", NamedTextColor.RED));
            return false;

        }
    }



}
