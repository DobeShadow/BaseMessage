package me.shadow.message;

import cn.nukkit.utils.*;
import cn.nukkit.event.*;
import cn.nukkit.event.player.*;

public class Special implements Listener
{
    @EventHandler
    public void onPlayerJoin(final PlayerJoinEvent event) {
        if (event.getPlayer().hasPermission("basemessage.join.vip")) {}
        final String joinMessage = TextFormat.colorize('&', Main.getInstance().getConfig().getString("VipJoinMessage").replace("%player%", event.getPlayer().getName()));
        event.setJoinMessage(joinMessage);
    }
    
    @EventHandler
    public void onPlayerQuit(final PlayerQuitEvent event) {
        if (event.getPlayer().hasPermission("basemessage.quit.vip")) {}
        final String quitMessage = TextFormat.colorize('&', Main.getInstance().getConfig().getString("VipQuitMessage").replace("%player%", event.getPlayer().getName()));
        event.setQuitMessage(quitMessage);
    }
}
