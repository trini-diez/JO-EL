package `Problemes-2`

import java.util.Scanner

/*
    Entrada: 5 lineas de 1 lletra.
    Sortida:
        * cap de les linies es "G", es dirà "NO"
        * una es G, es dirà "SI"
        * més d'una es G, es dirien "PUNTOS"
 */

fun main(){
    // Crea una variable escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per emmagatzemar el nombre de puntos G.
    var puntosG : Int = 0

    // Repeteix el bucle cinc vegades.
    repeat(5){
        val lletra = sc.next()

        // Compara en majúscules per acceptar 'G' i 'g'.
        if (lletra.uppercase() == "G"){
            puntosG++
        }
    }

    // Comprova el nombre de punts G i mostra el resultat corresponent.
    if (puntosG == 0){
        println("NO")
    } else if (puntosG == 1){
        println("SI")
    } else {
        println("PUNTOS")
    }
}