package `Problemes-1`

import java.util.Scanner

/*
    Entrada: 2 nombres (Integers).
    Sortida: nombre 1 + nombre 2.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema les entrada (els nombres) en una variable.
    val nombre1 : Int = sc.nextInt()
    val nombre2 : Int = sc.nextInt()

    // Imprimeix el nombre a la consola.
    println(nombre1 +  nombre2)
}