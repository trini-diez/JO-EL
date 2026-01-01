package `Problemes-2`

import java.util.Scanner

/*
    Entrada: un nombre 1-365.
    Sortida: més al que correspòn aquest día.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema les entrada (el Integer) en una variable.
    val dia : Int = sc.nextInt()

    // Imprimeix una casa segons el contingut del integer.
    when (dia) {
        in 1..31 -> println(1)      // Gener
        in 32..59 -> println(2)     // Febrer (28 dies)
        in 60..90 -> println(3)     // Març
        in 91..120 -> println(4)    // Abril
        in 121..151 -> println(5)   // Maig
        in 152..181 -> println(6)   // Juny
        in 182..212 -> println(7)   // Juliol
        in 213..243 -> println(8)   // Agost
        in 244..273 -> println(9)   // Setembre
        in 274..304 -> println(10)  // Octubre
        in 305..334 -> println(11)  // Novembre
        in 335..365 -> println(12)  // Desembre
        else -> println("Dia invàlid")
    }

    // Tanca l'escàner.
    sc.close()
}