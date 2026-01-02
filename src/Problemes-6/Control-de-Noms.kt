package `Problemes-6`

import java.util.Scanner
/*
   Entrada: paraula (String)
   Sortida:
     * si alguna lletra es repeteix --> "NO"
     * altrament --> "SI"
*/

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Desa el valor llegit en una variable.
    val paraula = sc.next()

    // Crea un booleà per comprovar si hi ha repetició.
    var repetida: Boolean = false

    // Comprova si alguna lletra es repeteix.
    for (i in 1..paraula.length){
        if (paraula[0] != paraula[i-1]){
            repetida = true
        }
    }

    // Mostra el resultat segons el valor del booleà.
    if(repetida){
        println("SI")
    } else {
        println("NO")
    }

    //Tanca l'escàner.
    sc.close()
}