package controllers.interfaces

import models.ItemType

interface Item {

    /**
     * Lê a descrição do item
     */
    fun readDescription(): Unit;

    /**
     * Busca o tipo do item
     * @return Um enum com o tipo do item
     */
    fun getItemType(): ItemType;

    /**
     * Busca o nome do item
     * @return O nome do item
     */
    fun getName(): String;
}