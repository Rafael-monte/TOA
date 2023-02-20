package controllers.interfaces

import models.Player

interface DefensiveItem: Item {
    fun applyEffect(player: Player);
}