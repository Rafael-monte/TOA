package models

import configuration.Constants
import controllers.interfaces.CombatCharacter
import controllers.interfaces.Item
import controllers.interfaces.OffensiveItem
import controllers.interfaces.Weapon

class Player : CombatCharacter {
    var name: String = ""
    var hp: Int = 0
    var mana: Int = 0
    var itens: MutableList<Item> = mutableListOf()
    var pets: MutableList<Pet> = mutableListOf()
    var mainWeapon: Weapon? = null
    var warriorClass: WarriorClass? = null
    var offensiveItemReceived: OffensiveItem? = null
    var turnReceived: Int? = null

    private constructor(name: String, warriorClass: WarriorClass) {
        this.name = name
        this.warriorClass = warriorClass
        val characterHpAndMana: Pair<Int, Int> = Constants.getDefaultHpAndManaByWarriorClass(warriorClass)
        this.hp = characterHpAndMana.first
        this.mana = characterHpAndMana.second

    }

    private fun setDefaultValues() {

    }
    companion object {
        fun new(name: String, warriorClass: WarriorClass): Player {
            return Player(name=name, warriorClass=warriorClass);
        }
    }

    override fun listenEndOfTurn(turnNumber: Int) {
        TODO("Not yet implemented")
    }

    override fun receiveOffensiveItem(offensiveItem: OffensiveItem, receiveTurn: Int) {
        if (this.offensiveItemReceived != null) {
            print("Ainda bem que não posso receber esse item, pois já tenho um")
            return
        }
        this.offensiveItemReceived = offensiveItem
        this.turnReceived = receiveTurn
    }

    override fun receiveDamage(damage: Int) {
        this.hp -= damage
    }

    override fun receiveManaReduction(manaReduction: Int) {
        this.mana -= manaReduction
        if (this.mana < 0) {
            this.mana = 0
        }
    }

    override fun getTurnReceivedItem(): Int? {
        return this.turnReceived
    }
}