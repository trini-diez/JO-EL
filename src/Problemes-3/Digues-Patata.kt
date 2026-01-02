package `Problemes-3`

import java.util.Scanner

/*
    Entrada:
        1) K casos de prova a considerar.
        2) K lineas.

    Sortida: k lineas.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Emmagatzema el nombre de cassos de prova en una variable.
    val cassosDeProva: Int = sc.nextInt()
    sc.nextLine() // Consumeix el salt de línia pendent

    // Bucle per tractar cada cas
    repeat (cassosDeProva) {
        val linea = sc.nextLine()
        println(linea)
    }

    // Tanca l'escàner.
    sc.close()
}