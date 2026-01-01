package `Problemes-2`

import java.util.Scanner

/*
    Entrada:
        1) Casos de prova a considerar (Integer).
        2)
            * K (Integer)
            * K nombres (Integer, 0-100)
            * P (Integer)

     Sortida: nombre vegades ha aparegut el nombre P
     dintre de la anterior llista de K nombres (Integer).
 */

fun main(){
    // Obre l'escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema els casos de prova en una variable.
    val casosProva : Int = sc.nextInt()

    repeat(casosProva){
        // Emmagatzema la entrada en una variable.
        val k : Int = sc.nextInt()

        // Crea una llista de nombres.
        val llista = MutableList(k){sc.nextInt()}

        // Emmagatzema el nombre en una variable.
        val p : Int = sc.nextInt()

        // Crea una variable counter.
        var counter : Int = 0

        for (i in 0 until k){
            if (llista[i] == p){
                counter ++
            }
        }

        // Imprimeix la resposta.
        println(counter)
    }

    // Tanca l'escàner.
    sc.close()
}