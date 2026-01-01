import java.util.Scanner

/*
    Entrada:
        1) Vots Jiden.
        2) Vots Drump.
        3) Vots Banders.
    Sortida: candidat guanyador.
*/

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc: Scanner = Scanner(System.`in`)

    // Emmagatzema els vots dels tres candidats en variables separades.
    val votsJiden: Int = sc.nextInt()
    val votsDrump: Int = sc.nextInt()
    val votsBanders: Int = sc.nextInt()

    // Determina quants vots té el candidat amb més vots.
    val maxVots: Int = maxOf(votsJiden, votsDrump, votsBanders)

    // Imprimeix el nom del candidat guanyador segons qui tingui més vots.
    if (maxVots == votsJiden) {
        println("Jiden")
    } else if (maxVots == votsDrump) {
        println("Drump")
    } else {
        println("Banders")
    }

    // Tanca l'escàner.
    sc.close()
}