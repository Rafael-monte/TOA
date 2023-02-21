package controllers.interfaces

interface CombatCharacter {

    /**
     * Listener que, ao final do turno realiza alguma ação
     * @param turnNumber - Int: Número do turno
     */
    fun listenEndOfTurn(turnNumber: Int): Unit

    /**
     * Recebe um item ofensivo (armadilha, bomba, etc.)
     * @param offensiveItem - OffensiveItem: Item que foi recebido
     * @param receiveTurn - Int: Turno em que o item foi recebido, para que possa ser calculado
     */
    fun receiveOffensiveItem(offensiveItem: OffensiveItem, receiveTurn: Int): Unit

    /**
     * Recebe dano de um item ofensivo ou ataque
     * @param damage - Int: Dano que será recebido
     */
    fun receiveDamage(damage: Int): Unit

    /**
     * Recebe redução de mana, tanto por itens ofensivos como por ataques
     * @param manaReduction - Int: Mana que será reduzida
     */
    fun receiveManaReduction(manaReduction: Int): Unit

    /**
     * Busca o turno em que um item ofensivo foi recebido
     * @return O turno em que o item ofensivo foi recebido caso exista, null caso contrário
     */
    fun getTurnReceivedItem(): Int?
}