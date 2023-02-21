package models.itens

import controllers.interfaces.CombatCharacter
import controllers.interfaces.DefensiveItem
import models.ItemType
import models.Player

class Potion : DefensiveItem {
    var cure: Int = 0
    var manaRestore: Int = 0
    var description: String = ""
    var name: String = ""

    constructor(name: String, description:String, manaRestore: Int = 0, cure: Int = 0) {
        this.manaRestore = manaRestore
        this.cure = cure
        this.description = description
        this.name = name
    }
    override fun applyEffect(combatCharacter: CombatCharacter) {
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