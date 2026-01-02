package `Problemes-4`

import java.util.Scanner

/*
    Entrada: Casos de prova a considerar: 1 linea  (Integer).
    Sortida: Llista de divisors separats per espai en blanc.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema el nombre de casos en una variable.
    val nombreCasos : Int = sc.nextInt()

    // Repeteix el bucle tantes vegades com casos de prova.
    repeat(nombreCasos){
        // Enmagatzema el nombre (Integer) en una variable.
        val nombreCasos : Int = sc.nextInt()
        for(i in 1..nombreCasos){
            if(nombreCasos % i == 0){
                print(" $i")
            }
        }
        println()
    }
}