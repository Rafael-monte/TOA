package models

import controllers.interfaces.CombatCharacter
import controllers.interfaces.OffensiveItem
import controllers.interfaces.Weapon

class Enemy : CombatCharacter {
    var weapon: Weapon? = null
    var name: String = ""
    var warriorClass: WarriorClass = WarriorClass.ROGUE
    var offensiveItemReceived: OffensiveItem? = null
    var turnReceived: Int? = null
    var hp: Int = 0;
    var mana: Int = 0;

    override fun listenEndOfTurn(turnNumber: Int) {
        TODO("Not yet implemented")
    }

    override fun receiveOffensiveItem(offensiveItem: OffensiveItem, receiveTurn: Int) {
        if (this.offensiveItemReceived != null) {
            println("Não é possivel atribuir '${offensiveItem.getName()}' a ${this.name}, pois ele já possui um")
            return
        }
        this.turnReceived = receiveTurn
        this.offensiveItemReceived = offensiveItem
    }

    override fun receiveDamage(damage: Int) {
        this.hp -= damage
    }

    override fun receiveManaReduction(manaReduction: Int) {
        this.mana -= manaReduction
        if (this.mana < 0) {
            this.mana = 0;
        }
    }

    override fun getTurnReceivedItem(): Int? {
        return this.turnReceived
    }


}