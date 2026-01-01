package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) K = tamany array a crear.
        2) K = nombres.
        3) N = posició del array a accedir.
        (N < K)
    Sortida:
        1) Array sencer escrit amb espais entre cada caràcter.
        2) Contingut de l'array a la posició N.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc: Scanner = Scanner(System.`in`)

    // Emmmagatzema l'entrada de l'usuari a vairables.
    val tamanyArray: Int = sc.nextInt()

    val array = arrayOfNulls<Int>(tamanyArray)

    for (i in 0 until tamanyArray){
        array [i] = sc.nextInt()
    }

    val arrayPosition : Int = sc.nextInt()

    for (i in 0 until tamanyArray){
        print("${array[i]} ")
    }

    println()
    println(array[arrayPosition])
}