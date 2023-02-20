package configuration

class OSUtils {

    companion object {
        fun clearScreen() {
            val os = System.getProperty("os.name").lowercase()
            when {
                os.contains("nix") || os.contains("nux") || os.contains("aix") -> {
                    ProcessBuilder("clear").inheritIO().start().waitFor()
                }
                os.contains("win") -> {
                    ProcessBuilder("cls").inheritIO().start().waitFor()
                }
                else -> {
                    throw Error("Sistema operacional não suportado")
                }
            }
        }
    }
}