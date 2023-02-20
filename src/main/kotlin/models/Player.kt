package models

import controllers.interfaces.Item
import controllers.interfaces.Weapon

class Player {
    var name: String = ""
    var hp: Int = 0
    var mana: Int = 0
    var itens: MutableList<Item> = mutableListOf()
    var pets: MutableList<Pet> = mutableListOf()
    var mainWeapon: Weapon? = null;
    var warriorClass: WarriorClass? = null;
    constructor() {
    }
}