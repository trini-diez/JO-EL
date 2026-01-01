package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) K: casos de prova a tractar.
        2) Número enter positiu.

    Sortida: PARELLS: xxx SENARS: xxx

 */


fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per emmagatzemar el nombre de cassos de prova.
    val cassosProva : Int = sc.nextInt()

    // Repeteix el bucle tantes vegades com cassos de prova.
    repeat(cassosProva){
        // Crea variables pels nombres parells i senars.
        var parells : Int = 0
        var senars : Int = 0

        // Llegeix el número a tractar.
        val num : Int = sc.nextInt()

        // Recórrer els números.
        for (i in 1..num){
            if (i % 2 == 0){
                parells += i
            } else {
                senars += i
            }
        }

        println("PARELLS: $parells SENARS: $senars")
    }

    // Tanca l'escàner.
    sc.close()
}