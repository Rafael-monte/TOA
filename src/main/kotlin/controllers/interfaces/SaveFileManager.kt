package controllers.interfaces

import models.Player

interface SaveFileManager {
    fun save(player: Player): Unit;
    fun loadSave(): Player;
    fun createNewSave(): Player;
}