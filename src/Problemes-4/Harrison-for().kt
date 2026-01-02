package `Problemes-4`

import java.util.Scanner

/*
    Entrada: quantitat de diners (Integer).
    Sortida: comptar milió a milió els diners.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Emmagatzema el nombre de diners en una variable.
    val diners: Int = sc.nextInt()

    // Itera pels diners amb un bucle for.
    for (i in 1000000..diners step 1000000) {
        println(i)
    }

    // Tanca l'escàner.
    sc.close()
}