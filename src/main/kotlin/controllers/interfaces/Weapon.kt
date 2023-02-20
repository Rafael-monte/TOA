package controllers.interfaces

import models.Enemy

interface Weapon: Item {
    fun applyPassive(): Unit;
    fun attack(enemy: Enemy): Unit;
    fun calculateDamage(): Int;
}