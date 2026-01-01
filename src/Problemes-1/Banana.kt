package `Problemes-1`

import java.util.Scanner

/*
    Entrada: Lineas
        * P
        * B
        * 0 (indica el final)
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per emmagatzemar l'entrada
    var entrada = sc.next()

    // Crea una variable per emmagatzemar el nombre de plàtans i bananes.
    var platans : Int = 0
    var bananes : Int = 0

    // Repeteix el bucle mentre l'entrada no sigui 0
    while (entrada != "0"){
        if (entrada == "B"){
            bananes++
        } else {
            platans++
        }
        entrada = sc.next()
    }

    if (platans > bananes){
        println("M'agraden els platans")
    } else if (bananes > platans){
        println("M'agraden les bananes")
    } else {
        println("No puc distingir entre un platan i una banana")
    }

    // Tanca l'escàner.
    sc.close()
}