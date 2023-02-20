package controllers.interfaces

import controllers.Option

interface Menu {
    fun render(options: MutableList<Option>, name: String, preSelectedIndex: Int = -1)
}