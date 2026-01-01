package `Problemes-1`

import java.util.Scanner

/*
    Entrada: un nombre (Integer).
    Sortida: quadrat del nombre.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema les entrada (el nombre) en una variable.
    val nombre : Int = sc.nextInt()

    // Imprimeix el nombre al quadrat a la consola.
    println(nombre * nombre)

    // Tanca l'escàner.
    sc.close()
}