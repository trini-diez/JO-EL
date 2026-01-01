package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) K = tamany array a crear.
        2) K nombres = contingut array a llegir.
        3) N = valor a sumar a tots els elements de array.

        Sortida: array sencer escrit després d'haver sumat N
 a cada posició.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc: Scanner = Scanner(System.`in`)

    // Emmmagatzema l'entrada de l'usuari a vairables.
    val tamanyArray: Int = sc.nextInt()


    // Crea un array de Integers amb els valors ingresses per l'usuari.
    val array = Array(tamanyArray){sc.nextInt()}

    // Emmagatzema el valor a sumar en una variable
    val numero : Int = sc.nextInt()

    // Suma el valor a cada element de l'array.
    for (i in array.indices){
        array[i] += numero
    }

    //Imprimeix l'array separat per un espai.
    println(array.joinToString(" "))
}