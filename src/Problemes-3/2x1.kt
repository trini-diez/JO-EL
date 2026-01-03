package `Problemes-3`

import java.util.Scanner

/*
    Entrada: 2 nombres (Integers).
    Sortida:  "SI" si un dels dos nombres és el doble que l'altre i "NO" en cas contrari
 */


fun main(){
    // Crea una variable escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema el número en una variable.
    val num1 : Int = sc.nextInt()
    val num2 : Int = sc.nextInt()

    // Es fixa si un nombre es el doble del altre.
    if (num1/2 == num2){
        println("SI")
    } else if (num2/2 == num1){
        println("SI")
    } else {
        println("NO")
    }

    // Tanca l'escàner.
    sc.close()
}