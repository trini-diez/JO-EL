import java.util.Scanner

/*
    Entrada: nombre (Integer).
    Sortida: nombre + 1.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema l'entrada (el nombre) en una variable.
    var nombre : Int = sc.nextInt()

    // Incrementa el nombre en 1.
    nombre++

    // Imprimeix el nombre a la consola.
    println(nombre)
}