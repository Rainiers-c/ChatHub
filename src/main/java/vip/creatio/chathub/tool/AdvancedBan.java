package vip.creatio.chathub.tool;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import me.leoko.advancedban.manager.PunishmentManager;
import me.leoko.advancedban.manager.UUIDManager;

public class AdvancedBan {
    public static boolean isMuted(ProxiedPlayer player) {
        return PunishmentManager.get().isMuted(UUIDManager.get().getUUID(player.getName()));
    }
}
