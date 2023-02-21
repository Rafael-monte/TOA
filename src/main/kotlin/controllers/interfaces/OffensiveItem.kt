package controllers.interfaces

import models.Enemy

interface OffensiveItem : Item {
    /**
     * Aplica o efeito do item (dano, redução de status, etc.)
     * @param combatCharacter - CombatCharacter: Personagem que usará o item
     * @param turnNumber - Int: Turno em que o item foi aplicado
     */
    fun applyEffect(combatCharacter: CombatCharacter, turnNumber: Int): Unit
}