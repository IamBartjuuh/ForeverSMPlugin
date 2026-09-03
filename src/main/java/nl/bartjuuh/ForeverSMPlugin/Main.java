package nl.bartjuuh.ForeverSMPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("profile").setExecutor(new CommandExecutor());
        getLogger().info("ForeverSMPlugin has succesfully been enabled!");
        File file = new File("plugins/ForeverSMPlugin/playerdata");
        file.mkdirs();
    }

    @Override
    public void onDisable() {
        getLogger().info("ForeverSMPlugin has succesfully been disabled!");
    }
}


// https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/entity/Player.html#loadData()
// Load and Save Data functions for saveing and loading player data.
