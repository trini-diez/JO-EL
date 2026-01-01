import java.util.Scanner

/*
    Entrada:
        1) Casos de prova a considerar (Integer).
        2) Número (Integer).

    Sortida: No ofendre al president patata tants cops com sigui el nombre.
*/


fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre de casos de prova en una variable.
    val cassosProva : Int = sc.nextInt()

    // Repeteix el bucle tantes vegades com cassos de prova.
    repeat(cassosProva){
        val nombre : Int = sc.nextInt()
        repeat(nombre){
            println("No ofendre al president patata")
        }
        println()
    }


    // Tanca l'escàner.
    sc.close()
}