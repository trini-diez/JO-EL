package `Problemes-2`

import java.util.Scanner

/*
    Entrada: nombres fins rebre 0 (Integers).
    Sortida: nombre + 1.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre de cassos de prova en una variable.
    var nombre : Int = sc.nextInt()

    // Repteix el bucle fins que el nombre sigui 0.
    while (nombre != 0){
        nombre ++
        println(nombre)
        nombre = sc.nextInt()
    }

    // Tanca l'escàner.
    sc.close()
}