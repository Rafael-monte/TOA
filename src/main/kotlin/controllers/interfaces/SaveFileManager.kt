package controllers.interfaces

import models.Player

interface SaveFileManager {

    /**
     * Salva o jogo
     * @param player - Player: Informações do jogador
     */
    fun save(player: Player): Unit;

    /**
     * Carrega os dados do arquivo de save para o jogo
     * @return Os dados do jogador
     */
    fun loadSave(): Player;

    /**
     * Cria um novo save do Jogo, do zero
     * @return Um player default, com a warrior class ROGUE
     */
    fun createNewSave(): Player;
}