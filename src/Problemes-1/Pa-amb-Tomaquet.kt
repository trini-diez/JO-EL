package `Problemes-1`
import java.util.Scanner

/*
    Entrada: 2 noms (Strings).
    Sortida: nom 1 + amb + nom 2.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema les entrada (els nombres) en una variable.
    val nom1 = sc.next()
    val nom2 = sc.next()

    // Imprimeix els noms a la consola.
    println("$nom1 amb $nom2")

    // Tanca l'escàner.
    sc.close()
}