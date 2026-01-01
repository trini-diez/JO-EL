package `Problemes-1`
import java.util.Scanner

/*
    Entrada: nom d'usuari (String)
    Sortida: Benvingut/da, nom!
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema les entrada (els nombres) en una variable.
    val nom  = sc.next()

    // Imprimeix el nombre a la consola.
    println("Benvingut/da, ${nom}!")

    // Tanca l'escàner.
    sc.close()
}