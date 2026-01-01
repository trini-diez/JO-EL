package `Problemes-2`

import java.util.Scanner

/*
    Entrada: 1 número (Integer, 1-86399).
    Sortida: l'hora en format hh:ss.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari
    val sc = Scanner(System.`in`)

    // Llegeix el total de segons des de l'entrada
    val totalSegons = sc.nextInt()

    // Calcula el nombre d'hores senceres
    val hores = totalSegons / 3600

    // Calcula el nombre de minuts restants després de treure les hores completes
    val minuts = (totalSegons % 3600) / 60

    // Calcula els segons restants després de treure hores i minuts completes
    val segons = totalSegons % 60

    // Mostra el resultat en format hh:mm:ss
    println("$hores:$minuts:$segons")

    // Tanca l'escàner per alliberar recursos
    sc.close()
}