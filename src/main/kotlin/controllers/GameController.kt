package controllers

import configuration.OSUtils

class GameController {
    var mainMenu: MainMenu = MainMenu()

    fun launch() {
        return mainMenu.render(this.loadOptions(), "Principal")
    }

    private fun start() {

    }

    private fun loadFromFile() {

    }

    private fun about() {
        OSUtils.clearScreen()
        println("Sobre: ")
        println("Criado por Rafael Monteiro Zancanaro e Robson Oliveira Silva")
    }

    private fun loadOptions(): MutableList<Option> {
        val options: MutableList<Option> = mutableListOf(
            Option("Novo Jogo", "N") { this.start() },
            Option("Continuar", "C") { this.loadFromFile() },
            Option("Sobre", "S") { this.about() }
        )
        return options
    }
}