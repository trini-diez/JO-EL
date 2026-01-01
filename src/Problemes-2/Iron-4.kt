package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        - Una tecla per activar una acció.
    Sortida:
        - Acció executada segons la taula.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc: Scanner = Scanner(System.`in`)

    // Llegeix la tecla introduïda
    val tecla = sc.nextLine()

    // Realitza un 'when' per fer l'acció segons la tecla
    val accio = when (tecla.uppercase()) {  // Utilitzem uppercase per evitar errors amb majúscules/minúscules
        "Q" -> "Skill 1"
        "W" -> "Skill 2"
        "E" -> "Skill 3"
        "R" -> "Ultimate"
        "B" -> "Recall"
        "D" -> "Bronzes never use summoners"
        "F" -> "Bronzes never use summoners"
        else -> "Error"
    }

    // Imprimeix l'acció escollida
    println(accio)

    // Tanca l'escàner.
    sc.close()
}