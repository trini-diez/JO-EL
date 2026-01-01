package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) Números F i C.
        2) F files amb C números.
        3) Dos números i i j.

     Sortida: la matriu. escrivint una fila per línea i separant els números amb espais, però canviant tots els nombres i
 per j.
 */

fun main(){
    // Crea una variable per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema les entrades de l'usuari en una variable.
    val f : Int = sc.nextInt()
    val c : Int = sc.nextInt()

    // Crea la matriu.
    val matriu = Array(f){ IntArray(c) }

    // Omple la matriu.
    for (fila in 0 until f){
        for (col in 0 until c){
            matriu[fila][col] = sc.nextInt()
        }
    }

    // Llegeix els valors i i j.
    val i : Int = sc.nextInt()
    val j : Int = sc.nextInt()

    // Tanca l'escàner.
    sc.close()

    // Imprimeix la matriu.
    for (fila in 0 until f){
        for (col in 0 until c){
            if (matriu[fila][col] == i){
                matriu[fila][col] = j
            }
            print("${matriu[fila][col]} ")
        }
        println()
    }
}