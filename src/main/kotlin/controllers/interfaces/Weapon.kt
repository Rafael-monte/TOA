package controllers.interfaces

import models.Enemy

interface Weapon: Item {
    /**
     * Ataca um personagem
     * @param combatCharacter - CombatCharacter: Personagem que será atacado
     */
    fun attack(combatCharacter: CombatCharacter): Unit;

    /**
     * Calcula o dano que será inflingido ao personagem inimigo.
     * Inimigos que usam armas de classes diferentes da normal devem ter um debuff no dano causado.
     * @return O dano causado ao personagem inimigo.
     */
    fun calculateDamage(): Int;
}