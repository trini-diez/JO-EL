import java.util.Scanner

/*
    Entrada:
        1) Casos de prova a considerar.
        2) Nombre (Integer).
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre de cassos de prova en una variable.
    val nombreCassos : Int = sc.nextInt()

    // Repteix el bucle tantes vegades com casos de prova.
    repeat (nombreCassos){
        var nombre : Int = sc.nextInt()
        nombre ++
        println(nombre)
    }
}