package controllers.interfaces

import models.Player

interface DefensiveItem: Item {

    /**
     * Aplica o efeito do item (dano, redução de status, etc.)
     * @param combatCharacter - CombatCharacter: Personagem que usará o item
     */
    fun applyEffect(combatCharacter: CombatCharacter);
}