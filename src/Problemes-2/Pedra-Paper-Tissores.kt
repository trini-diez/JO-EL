package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) 1, 2, 3 (on 1 és pedra, 2 és paper i 3 és tisora).
        2) 1, 2, 3 (on 1 és pedra, 2 és paper i 3 és tisora).

    Sortida: Escriurà el jugador que guanya (“Jugador1”, o “Jugador2”)
    Recordem que pedra guanya a tisora, paper guanya a pedra, tisora guanya a paper.
    En cas d’empat, escriurà EMPAT. En cas de que un dels jugadors posi un número
    diferent a 1, 2, 3, escriurà ERROR.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema els valors en dues variables.
    val jugador1 : Int = sc.nextInt()
    val jugador2 : Int = sc.nextInt()

    // Comprovem si alguna entrada és invàlida.
    if (jugador1 !in 1..3 || jugador2 !in 1..3) {
        println("ERROR")
    } else if (jugador1 == jugador2) {
        // Empat si les dues eleccions són iguals
        println("EMPAT")
    } else {
        // Comprovem qui guanya segons les regles del joc
        if ((jugador1 == 1 && jugador2 == 3) || (jugador1 == 2 && jugador2 == 1) || (jugador1 == 3 && jugador2 == 2)) {
            println("Jugador1")
        } else {
            println("Jugador2")
        }
    }

    // Tancar l'escàner.
    sc.close()
}