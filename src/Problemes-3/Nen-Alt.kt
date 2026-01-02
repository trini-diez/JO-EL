package `Problemes-3`

import java.util.Scanner

/*
    Entrada:
        1) Altura màxima (Integer)
        2) 3 altures alumnes (Integers)

    Sortida: "Nen Nº“ del nen més alt. En cas que tots superin l'altura màxima escriurà "No hi ha cap nen".
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Emmagatzema l'altura máxima en una variable.
    val altMax : Int = sc.nextInt()
    val nen1 : Int = sc.nextInt()
    val nen2 : Int = sc.nextInt()
    val nen3 : Int = sc.nextInt()

    // Imprimeix el missatge solicitat si tots no són nens.
    if (nen1 >= altMax && nen2 >= altMax && nen3 > altMax){
        println("No hi ha cap nen")
    } else {
        var nom = ""
        var altura : Int = 0
        if (nen1 <= altMax){
            altura = nen1
            nom = "Nen 1"
        }
        if ((nen2 <= altMax) && (nen2 > altura)){
            altura = nen2
            nom = "Nen 2"
        }
        if ((nen3 <= altMax) && (nen3 > altura)){
            nom = "Nen 3"
        }

        // Imprimeix el nom
        println(nom)
    }

    //Tanca l'escàner.
    sc.close()
}