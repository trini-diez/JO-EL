import java.util.Scanner

/*
    Entrada: nombre (Integer)
    Sortida: nombre multiplicat per 3.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema l'entrada (el nombre) en una variable.
    val nombre : Int = sc.nextInt()

    // Imprimeix el nombre multiplicat per 3 a la consola.
    println(nombre * 3)
}