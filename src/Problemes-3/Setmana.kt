package `Problemes-3`

import java.util.Scanner

/*
    Entrada: N de l'1 al 99999, els dos inclosos (Integer)
    Sortida: Dia de la setmana en anglés (Integer)

 */


fun main(){
    // Crea una variable escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema el número en una variable.
    val numero : Int = sc.nextInt()

    // Calcula quin dia de la setmana és.
    when (numero % 7){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        0 -> println("Sunday")
    }

    // Tanca l'escàner.
    sc.close()
}

