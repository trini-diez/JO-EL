package `Problemes-6`

import java.util.Scanner

/*
    Entrada: Nombre (Integer) 1-100000000
    Sortida: "mati del dia X" o "nit del dia X"
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema les entrada (els Integer) en una variable.
    val segons : Int = sc.nextInt()

    // Calcula les hores.
    val hores : Int = segons / 3600

    // Calcula el dia.
    val dia = (hores / 24)

    // Calcula si es de dia o de nit.
    if ((hores - dia * 24) <= 12){
        println("mati del dia ${dia + 1}")
    } else {
        println("nit del dia ${dia + 1}")
    }

    // Tanca l'escàner.
    sc.close()
}