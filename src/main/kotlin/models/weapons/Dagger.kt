package models.weapons

import controllers.interfaces.CombatCharacter
import controllers.interfaces.Weapon
import models.Enemy
import models.ItemType

class Dagger: Weapon {

    var defaultDamage: Int = 0
    var bonusDamage: Int = 0
    var description: String = ""

    constructor(defaultDamage: Int, bonusDamage: Int, description: String) {
        this.defaultDamage = defaultDamage
        this.bonusDamage = bonusDamage
        this.description = description
    }
    override fun attack(combatCharacter: CombatCharacter) {
        TODO("Not yet implemented")
    }

    override fun calculateDamage(): Int {
        TODO("Not yet implemented")
    }

    override fun readDescription() {
        TODO("Not yet implemented")
    }

    override fun getItemType(): ItemType {
        TODO("Not yet implemented")
    }

    override fun getName(): String {
        TODO("Not yet implemented")
    }

}