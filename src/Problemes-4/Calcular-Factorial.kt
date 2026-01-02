package `Problemes-4`

import java.util.Scanner

/*
    Entrada:
        1) K casos de prova a considerar.
        2) K lineas amb un número enter positiu.

    Sortida: factorial del nombre
 */
fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Emmagatzema el nombre de cassos de prova en una variable.
    val cassosDeProva: Int = sc.nextInt()

    // Bucle per tractar cada cas
    repeat (cassosDeProva) {
        val n = sc.nextInt()
        var resultat : Long = 1

        // Calcular el factorial amb un for
        for (j in 2..n) {
            resultat *= j
        }

        println(resultat)
    }

    // Tanca l'escàner.
    sc.close()
}