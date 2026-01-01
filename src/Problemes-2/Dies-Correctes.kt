package `Problemes-2`

import java.util.Scanner

/*
    Entrada: un número enter que representa el dia de l'any
    Sortida:
        - "Incorrecte!" si el número no és vàlid
        - "Correcte per un any no bixest!" si el dia està entre 1 i 365
        - "Correcte per un any bixest!" si el dia és 366
*/

fun main() {
    // Crea unb escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Emmagatzema l'entrada en una variable.
    val dia : Int = sc.nextInt()

    // Imprimeix un resultat segons l'entrada.
    if (dia !in 1..366) {
        println("Incorrecte!")
    } else if (dia in 1..365) {
        println("Correcte per un any no bixest!")
    } else { // dia == 366
        println("Correcte per un any bixest!")
    }

    // Tanca l'escàner
    sc.close()
}