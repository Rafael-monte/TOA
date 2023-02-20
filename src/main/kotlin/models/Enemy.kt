package models

import controllers.interfaces.Weapon

class Enemy {
    var weapon: Weapon? = null
    var name: String = ""
    var warriorClass: WarriorClass = WarriorClass.ROGUE
}