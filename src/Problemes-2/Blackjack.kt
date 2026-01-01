package `Problemes-2`

import java.util.Scanner

/*
    Entrada: dos nombres positius.
    Sortida: compte del primer fins al segon.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema els dos nombres en variables.
    var nombre1 : Int = sc.nextInt()
    println(nombre1)

    val nombre2 : Int = sc.nextInt()

    // Fa la compta fins al segon nombre.
    while (nombre1 != nombre2){
        nombre1++
        println(nombre1)
    }

    // Tanca l'escàner.
    sc.close()
}