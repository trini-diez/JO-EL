package `Problemes-1`
import java.util.Scanner

/*
    Entrada:
        1) Vots Jiden.
        2) Vots Drump.
    Sortida: candidat guanyador.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema l'entrada (els nombres) en dues variables.
    val votsJiden : Int = sc.nextInt()
    val votsDrump : Int = sc.nextInt()

    // Imprimeix el nombre del guanyador a la consola.
    if (votsJiden > votsDrump){
        println("Jiden")
    } else {
        println("Drump")
    }

    // Tanca l'escàner.
    sc.close()
}