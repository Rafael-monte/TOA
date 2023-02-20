package controllers

class Option(var name: String, var associatedKey: String, fn: (() -> Unit)) {
    var isSelected: Boolean = false
    var onSelectAction: (() -> Unit)? = fn

    fun render() {
        var selector = ""
        var customColor = ""
        val resetColor = "\u001b[0m"
        if (this.isSelected) {selector = ">"; customColor = "\u001B[32m"}
        println("$selector $customColor ${this.name}  (${this.associatedKey}) $resetColor")
    }

}