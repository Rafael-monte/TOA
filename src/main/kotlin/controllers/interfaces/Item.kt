package controllers.interfaces

import models.ItemType

interface Item {
    fun readEffects(): Unit;
    fun getItemType(): ItemType;
    fun getName(): String;
}