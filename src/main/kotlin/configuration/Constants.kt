package configuration

import models.WarriorClass

class Constants {
    companion object {
        fun getDefaultHpAndManaByWarriorClass(warriorClass: WarriorClass): Pair<Int, Int> {
            when (warriorClass) {
                WarriorClass.FIGHTER -> {
                    return Pair(200, 50)
                }
                WarriorClass.WIZARD -> {
                    return Pair(100, 200)
                }
                else -> {
                    return Pair(100, 100)
                }
            }
        }
    }
}