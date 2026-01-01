import java.io.File

fun main() {
    // Es llegeix el nom del fitxer des de l'entrada estàndard
    val fileName = readLine() ?: return

    try {
        // El path sempre és "in/<nom-del-fitxer>"
        File("in/$fileName").forEachLine { line ->
            println(line)
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}