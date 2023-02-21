package models.itens

import controllers.interfaces.CombatCharacter
import controllers.interfaces.OffensiveItem
import models.Enemy
import models.ItemType

class Bomb: OffensiveItem {

    var description: String = ""
    var name: String = ""
    var turnsToEffect: Int = 0
    var damage: Int = 0
    constructor(name: String, description:String, turnsToEffect: Int = 0, damage: Int = 0) {
        this.description = description
        this.name = name
        this.turnsToEffect = turnsToEffect
        this.damage = damage
    }
    override fun applyEffect(combatCharacter: CombatCharacter, turnNumber: Int) {
        if (combatCharacter.getTurnReceivedItem() != null && (combatCharacter.getTurnReceivedItem()!! + this.turnsToEffect >= turnNumber)) {
            combatCharacter.receiveDamage(this.damage);
            return
        }
    }

    override fun readDescription() {
        println(description)
    }

    override fun getItemType(): ItemType {
        return ItemType.OFFENSIVE_ITEM
    }

    override fun getName(): String {
        return this.name
    }

}