package seml.noJoinLeaveMessage

import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.Listener


class NoJoinLeaveMessage : JavaPlugin(), Listener {

    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(this, this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        // 플레이어 접속 시 발생하는 기본 메시지를 null로 설정하여 비활성화합니다.
        event.joinMessage(null)
    }

    @EventHandler
    fun onPlayerQuit(event: PlayerQuitEvent) {
        // 플레이어 퇴장 시 발생하는 기본 메시지를 null로 설정하여 비활성화합니다.
        event.quitMessage(null)
    }
}
