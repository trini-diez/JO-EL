package `Problemes-1`

import java.io.PrintStream
import java.nio.charset.StandardCharsets
import java.util.Scanner

/*
    Entrada: linea.
    Sortida: Per cada missatge d'entrada es mostrarà a la sortida "Sssh, únicament acaba quan posis sortida". El programa finalitza quan el missatge d'entrada sigui "sortida".
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Per treure caracters accentuats per la sortida
    System.setOut(PrintStream(System.out, true, StandardCharsets.UTF_8))

    var message = sc.nextLine()

    // Repeteix un bucle
    while (message != "sortida"){
        println("Sssh, únicament acaba quan posis sortida")
        message = sc.nextLine()
    }

    // Tanca l'escàner.
    sc.close()
}