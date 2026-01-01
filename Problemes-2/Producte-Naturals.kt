import java.util.Scanner

/*
    Entrada:
        1) K = Nombre de cassos de prova (Integer, k > 0)
        2) N (Integer)

    Sortida:
        Si n és errònia es mostrarà el següent missatge de error: ELS NOMBRES NATURALS COMENCEN EN 1
        Si n és correcta es mostrarà el següent missatge: SUMA: xxx PRODUCTE: xxx.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre de cassos en una variable.
    val nombreCassos : Int = sc.nextInt()

    // repeteix el bucle tantes vegades com cassos de prova.
    repeat(nombreCassos){
        val num : Int = sc.nextInt()
        if (num > 0){
            var counterSum : Int = 0
            var counterProd : Int = 1

            for (i in 1 .. num){
                counterSum += i
                counterProd *= i
            }

            println("SUMA: $counterSum PRODUCTE: $counterProd")
        } else {
            println("ELS NOMBRES NATURALS COMENCEN EN 1")
        }
    }

    // Tanca l'escàner.
    sc.close()
}