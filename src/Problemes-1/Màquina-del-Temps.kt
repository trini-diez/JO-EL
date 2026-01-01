import java.util.Scanner

/*
    Entrada: número amb l'any de destinació del nostre viatge en el temps.
    Sortida: "Sant Andreu" o "Nou Barris"
*/

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Emmagatzema l'entrada de l'usuari en una variable.
    val numero : Int = sc.nextInt()

    // Imprimeix un resultat a la consola segons l'entrada.
    if (numero < 1984) {
        println("Sant Andreu")
    } else {
        println("Nou Barris")
    }

    // Tanca l'escàner
    sc.close()
}