package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) Casos de prova a considerar (Integer).
        2) Línea amb nombre (Integer).

    Sortida: suma dels nombres que són 8000 o més (Integer).
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per emmagatzemar el nombr de casos de prova.
    val cassosProva : Int = sc.nextInt()

    // Initcialitza una vairable per als diners.
    var diners : Int = 0

    // Repteix el bucle tantes vegades com cassos de prova.
    repeat(cassosProva){
        val nombre : Int = sc.nextInt()
        if (nombre >= 8000){
            diners += nombre
        }
    }

    // Imprimeix el nombre de diners.
    println(diners)

    // Tanca l'escàner.
    sc.close()
}