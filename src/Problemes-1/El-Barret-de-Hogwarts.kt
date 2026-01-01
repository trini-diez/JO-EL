
import java.util.Scanner

/*
    Entrada: una línea (String).
    Sortida:
        * "Coratge" -> "Gryffindor"
        * "Coneixement" -> "Ravenclaw"
        * "Ambicio" -> "Slytherin"
        else "Hufflepuff"
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema les entrada (el String) en una variable.
    val nom = sc.nextLine()

    // Imprimeix una casa segons el contingut del string.
    when (nom){
        "Coratge" -> println("Gryffindor")
        "Coneixement" -> println("Ravenclaw")
        "Ambicio" -> println("Slytherin")
        else -> println("Hufflepuff")
    }

    // Tanca l'escàner.
    sc.close()
}