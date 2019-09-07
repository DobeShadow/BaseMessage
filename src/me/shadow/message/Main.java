package me.shadow.message;

import java.io.*;
import cn.nukkit.event.*;
import cn.nukkit.plugin.*;

public class Main extends PluginBase
{
    private static Main main;
    
    public static Main getInstance() {
        return Main.main;
    }
    
    public void onEnable() {
        Main.main = this;
        final File config = new File(this.getDataFolder(), "config.yml");
        if (!config.exists()) {
            this.saveDefaultConfig();
        }
        this.getServer().getPluginManager().registerEvents((Listener)new Special(), (Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new Message(), (Plugin)this);
    }
}
