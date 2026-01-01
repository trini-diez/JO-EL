package `Problemes-1`
import java.util.Scanner

/*
    Entrada: Nom (Line).
    Sortida: Hola + Nom.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema l'entrada (el nom) en una variable.
    val nom = sc.nextLine()

    // Imprimeix el missatge a la consola.
    println("Hola, $nom")
}