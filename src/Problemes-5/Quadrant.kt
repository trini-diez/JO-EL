package `Problemes-5`

import java.util.Scanner

/*
    Entrada: Cada entrada conté un únic cas amb les coordenades X i Y de l'enemic.
    Sortida: Per a cada cas cal indicar els quadrants en els que es troba, ordenats i separats per coma.
*/
fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Enmagatzema les coordenades en una variable.
    val x = sc.nextInt()
    val y = sc.nextInt()

    // Crea una variable per la resposta.
    var resposta = ""

    // Cas especial: origen
    resposta = when {
        x == 0 && y == 0 -> "1,2,3,4"

        // Sobre els eixos
        x == 0 && y > 0 -> "1,2"
        x == 0 && y < 0 -> "3,4"
        y == 0 && x > 0 -> "1,4"
        y == 0 && x < 0 -> "2,3"

        // Dins d'un únic quadrant
        x > 0 && y > 0 -> "1"
        x < 0 && y > 0 -> "2"
        x < 0 && y < 0 -> "3"
        x > 0 && y < 0 -> "4"

        else -> "" // No hauria de passar
    }

    println(resposta)

    // Tanca l'escàner.
    sc.close()
}