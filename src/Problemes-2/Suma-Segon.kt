package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        * H (1-24, Integer)
        * M (1-59, Integer)
        * S (1-59, Integer)

    Sortida: hores, minuts i segons, si s'augmentés un segon a l'hora proporcionada.

 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema els nombres en variables.
    var hores : Int = sc.nextInt()
    var minuts : Int = sc.nextInt()
    var segons : Int = sc.nextInt()

    segons ++

    if (segons >= 60){
        minuts++
        segons -= 60
    }

    if (minuts >= 60){
        hores++
        minuts -= 60
    }

    if (hores >= 24){
        hores -= 24
    }

    // Imprimeix segons, minuts y hores.
    println("$hores $minuts $segons")

    // Tanca l'escàner.
    sc.close()
}