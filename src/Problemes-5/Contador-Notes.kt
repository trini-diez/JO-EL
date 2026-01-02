package `Problemes-5`

import java.util.Scanner
/*
   Entrada: seqüència de notes.
   Sortida: resultats obtinguts.
*/

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val escaner = Scanner(System.`in`)

    // Crea variables per a cada tipus de nota, suma de notes i comptador.
    var totalNotes: Int = 0
    var sumaNotes: Int = 0
    var excellent: Int = 0
    var notable: Int = 0
    var be: Int = 0
    var suficient: Int = 0
    var insuficient: Int = 0
    var deficient: Int = 0

    // Llegeix la primera nota.
    var nota = escaner.nextInt()

    // Llegeix valors i modifica les variables fins que es troba -1
    while (nota != -1) {
        if (nota in 0..10) {
            totalNotes++
            sumaNotes += nota

            when (nota) {
                in 9..10 -> excellent++
                in 7..8 -> notable++
                6 -> be++
                5 -> suficient++
                4 -> insuficient++
                in 0..3 -> deficient++
            }
        }
        // Llegeix la següent nota abans de repetir el bucle
        nota = escaner.nextInt()
    }

    // Calcula la mitjana.
    val mitjana = sumaNotes.toFloat() / totalNotes

    // Mostra els resultats per consola.
    println(
        "NOTES: $totalNotes " +
                "MITJANA: $mitjana " +
                "E: $excellent N: $notable B: $be S: $suficient I: $insuficient MD: $deficient"
    )
}