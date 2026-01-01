package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) Cassos de prova a processar.
        2)
            * Nombre de valors a processar
            * Seqüència de nombres enters.

    Sortida: suma dels valors dels números que es troben en posicions múltiples de tres.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre de cassos en una variable.
    val nombreCassos : Int = sc.nextInt()

    // Repeteix el bucle tantes vegades com nombre de cassos.
    repeat(nombreCassos){
        val nombreValors : Int = sc.nextInt()
        var suma : Int = 0

        for (i in 1..nombreValors){
            val num : Int = sc.nextInt()
            if (i % 3 == 0){
                suma += num
            }
        }

        println(suma)
    }

    // Tanca l'escàner.
    sc.close()
}