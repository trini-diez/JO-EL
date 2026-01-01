package `Problemes-1`

import java.util.Scanner

/*
    Entrada: un número (Integer).
    Sortida: número com a fracció.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema l'entrada (el nombre) en una variable.
    val n : Double = sc.nextDouble()

    // Calcula el nombre invers.
    val nombreInvers : Double = 1 / n

    // Imprimeix el nombre invers a la pantalla.
    println(nombreInvers)
}