package `Problemes-2`

import java.util.Scanner

/*
    Entrada: nombres fins al -1 (Integers).
    Sortida: TOTAL NOTES: xxx NOTES10: xxx
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per emmagatzemar la nota.
    var nota : Int = sc.nextInt()
    var countNotes : Int = 0
    var count10s : Int = 0

    while (nota != -1){
        if (nota in 0..10){
            countNotes ++
            if (nota == 10){
                count10s++
            }
        }

        nota = sc.nextInt()
    }

    // Imprimeix la resposta.
    println("TOTAL NOTES: $countNotes NOTES10: $count10s")

    // Tanca l'escàner.
    sc.close()
}