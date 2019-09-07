package me.shadow.message;

import cn.nukkit.utils.*;
import cn.nukkit.event.*;
import cn.nukkit.event.player.*;

public class Message implements Listener
{
    @EventHandler
    public void onPlayerJoin(final PlayerJoinEvent event) {
        final String joinMessage = TextFormat.colorize('&', Main.getInstance().getConfig().getString("JoinMessage").replace("%player%", event.getPlayer().getName()));
        event.setJoinMessage(joinMessage);
    }
    
    @EventHandler
    public void onPlayerQuit(final PlayerQuitEvent event) {
        final String quitMessage = TextFormat.colorize('&', Main.getInstance().getConfig().getString("QuitMessage").replace("%player%", event.getPlayer().getName()));
        event.setQuitMessage(quitMessage);
    }
}
