package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) K = nombres fins rebre un -1.
        2) N = posició de la llista a on has d'accedir.
        (N < K)
    Sortida:
        1) Llista sencera escrita.
        2) Contingut de la llista a la posició N.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc: Scanner = Scanner(System.`in`)

    // Creem un array de Strings
    val llista = mutableListOf<Int>()

    // Emmmagatzema l'entrada de l'usuari a vairables.
    var nombreArray: Int = sc.nextInt()

    while(nombreArray != -1){
        llista.add(nombreArray)
        nombreArray = sc.nextInt()
    }

    // Llegim la posició a accedir
    val posicion : Int = sc.nextInt()

    // Imprimim l’array complet
    println(llista)

    // Imprimim el contingut demanat
    println(llista[posicion])
}