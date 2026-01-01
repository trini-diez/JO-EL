package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) N = tamany array (Integers).
        2) N valors (0-1, Doubles).

     Sortida: cada número s'ha transformat en la seva representació
     en %, afegint el caràcter de % al final.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per emmagatzemar el tamany del array.
    val n : Int = sc.nextInt()

    // Crea una llista de N números.
    val llista = MutableList(n) { sc.nextDouble() }

    // Torna el valor com a percentatge.
    for (i in 0 until n){
        print("${llista[i] * 100}%")
        if (i < n - 1) print(" ")
    }
}