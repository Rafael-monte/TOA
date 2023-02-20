package controllers.interfaces

import models.Enemy

interface OffensiveItem : Item{
    fun applyEffect(enemy: Enemy): Unit
}