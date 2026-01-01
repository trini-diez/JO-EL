package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) Casos de prova a considerar.
        2)
            * Nombre K
            * K nombres 0-100
            * P < K

    Sortida: nombre que ocupava la posició P en la llista de nombres.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc: Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre de casos de prova en una variable.
    val casosProva: Int = sc.nextInt()

    // Repeteix el bucle tantes vegades com casos de prova.
    repeat(casosProva) {
        // Emmagatzema el nombre K en una variable.
        val k: Int = sc.nextInt()

        // Crea un array per emmagatzemar els nombres.
        val array = ArrayList<Int>()

        // Afegeix els valors a l'array.
        for (i in 0 until k) {
            array.add(sc.nextInt())  // Añadimos el valor al ArrayList.
        }

        // Emmagatzema el nombre a cercar a una variable p.
        val p: Int = sc.nextInt()

        // Sortim el nombre que ocupava la posició P a l'array.
        if (p < array.size) {
            println(array[p])  // Imprimimos el valor en la posición P.
        }
    }

    // Tanca l'escàner.
    sc.close()
}