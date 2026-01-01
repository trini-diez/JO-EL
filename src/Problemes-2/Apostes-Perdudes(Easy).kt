package `Problemes-2`

import java.util.Scanner

/*
    Entrada: nombres (Integers) fins rebre 0.
    Sortida: nombre de nombres negatius.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Initicialitza una variable comptador.
    var comptadorNombresNegatius : Int = 0

    // Repteix el bucle 5 vegades.
    repeat(5){
        val nombre : Int = sc.nextInt()
        if (nombre < 0){
            comptadorNombresNegatius++
        }
    }

    // Imprimeix el nombre de nombres negatius.
    println(comptadorNombresNegatius)

    // Tanca l'escàner.
    sc.close()
}