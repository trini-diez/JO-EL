package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) Nombre de casos a processar.
        2) Casos (Integer).
    Sortida: primer vers de la cançó que farà servir aquella generació per fer cagar el tió.
*/


fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Nombre de casos a processar
    val nombreCasos = sc.nextInt()
    sc.nextLine()

    repeat(nombreCasos) {
        val generacio = sc.nextInt()

        var cagatio = ""  // Inicialitzem la cadena buida

        // Generacions a partir de la 3: afegim "caga" tantes vegades com calgui
        for (i in 2 until generacio step 2) {
            cagatio += "caga"
        }

        cagatio += "tio"  // Afegim "tio" al final


        // Mostrem el vers complet
        println("Caga $cagatio!")
    }

    // Tanca l'escàner.
    sc.close()
}