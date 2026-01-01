package `Problemes-2`

import java.util.Scanner

/*
    Entrada: nombres (Integers) fins rebre 0.
    Sortida: nombre de nombres negatius.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre de cassos de prova en una variable.
    var nombre : Int = sc.nextInt()

    // Initicialitza una variable comptador.
    var comptadorNombresNegatius : Int = 0

    // Repteix el bucle fins que el comptador sigui igual al nombre..
    while (nombre != 0){
        if (nombre < 0){
            comptadorNombresNegatius++
        }
        nombre = sc.nextInt()
    }

    // Imprimeix el nombre de nombres negatius.
    println(comptadorNombresNegatius)

    // Tanca l'escàner.
    sc.close()
}