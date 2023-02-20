package controllers

import configuration.OSUtils
import controllers.interfaces.Menu
import java.util.*

class MainMenu : Menu {
    var options = mutableListOf<Option>()
    var name = ""
    override fun render(options: MutableList<Option>, name: String, preSelectedIndex: Int) {
        this.options = options
        this.name = name
        val gameTitlePieces = mutableListOf<String>(
            " ,--------.                 ,--.        ,-----.  ,---. ,---.   ,---.     ,--.                          ,--.                                ",
            "'--.  .--',--.--.,--,--. ,-|  |,---.  '  .-.  '/  .-'/  .-'  /  O  \\  ,-|  |,--.  ,--.,---. ,--,--, ,-'  '-.,--.,--.,--.--. ,---.  ,---.  ",
            "   |  |   |  .--' ,-.  |' .-. | .-. : |  | |  ||  `-,|  `-, |  .-.  |' .-. | \\  `'  /| .-. :|      \\'-.  .-'|  ||  ||  .--'| .-. :(  .-'  ",
            "   |  |   |  |  \\ '-'  |\\ `-' \\   --. '  '-'  '|  .-'|  .-' |  | |  |\\ `-' |  \\    / \\   --.|  ||  |  |  |  '  ''  '|  |   \\   --..-'  `) ",
            "   `--'   `--'   `--`--' `---' `----'  `-----' `--'  `--'   `--' `--' `---'    `--'   `----'`--''--'  `--'   `----' `--'    `----'`----'  "
        )

        gameTitlePieces.forEach {
            println(it)
        }
        this.selectOption(optionIndex = preSelectedIndex)
        this.renderOptions()
    }

    private fun selectOption(optionIndex: Int) {
        this.options.forEachIndexed{ index, option ->
            option.isSelected = index == optionIndex
        }
    }

    private fun renderOptions() {
        println("Selecione uma opção: ")
        this.options.forEach{it.render()}
        if (this.options.any{option -> option.isSelected}) {
           if (this.confirmSelection()) { return (options.first { option -> option.isSelected }.onSelectAction!!)(); }
        }
        val nextInput: String = this.renderSelector()
        return this.processSelectedOption(nextInput)
    }


    private fun renderSelector(): String {
        var nextInput: String?
        do {
            print("guest>")
            val scanner = Scanner(System.`in`)
            nextInput = scanner.next().single().toString()
        } while(this.options.none { el -> el.associatedKey == nextInput?.uppercase() })
        return nextInput!!
    }

    private fun processSelectedOption(nextInput: String?) {
        val optionSelected = this.options.filter { el -> el.associatedKey == nextInput?.uppercase() }
        if (optionSelected.isNotEmpty()) {
            OSUtils.clearScreen()
            this.render(this.options, this.name, this.options.indexOf(optionSelected.first()))
        }
    }

    private fun confirmSelection(): Boolean {
        val scanner = Scanner(System.`in`)
        var nextInput: String?
        do {
            print("Confirma a Seleção (S/N): ")
            nextInput = scanner.next().single().toString()
        } while(nextInput?.uppercase() != "S" && nextInput?.uppercase() != "N")
        return nextInput.uppercase() == "S"
    }
}