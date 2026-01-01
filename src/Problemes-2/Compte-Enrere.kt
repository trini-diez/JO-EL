package `Problemes-2`

import java.util.Scanner

/*
    Entrada: 1 nombre positiu (Integer).
    Sortida: Compte enrere fins al 0.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre de cassos de prova en una variable.
    var nombre : Int = sc.nextInt()
    println(nombre)

    // Repteix el bucle fins que el nombre sigui 0.
    while (nombre != 0){
        nombre--
        println(nombre)
    }

    // Tanca l'escàner.
    sc.close()
}