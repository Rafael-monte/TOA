package controllers.interfaces

import controllers.Option

interface Menu {
    /**
     * Função que renderiza o menu
     */
    fun render(options: MutableList<Option>, name: String, preSelectedIndex: Int = -1)
}