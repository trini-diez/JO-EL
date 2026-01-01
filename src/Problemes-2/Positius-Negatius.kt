package `Problemes-2`

import java.util.Scanner

/*
    Entrada: Números fins a 0 (Integers)
    Sortida:Indicarà POSITIUS si hi ha més positius que negatius, NEGATIUS si hi ha més valors negatius i IGUALS en cas d'empat.

 */


fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Llegeix el número a tractar.
    var num : Int = sc.nextInt()

    // Crea variables per als nombres positius i negatius.
    var positius : Int = 0
    var negatius : Int = 0

    // Repetiex el bucle mentre el nombre no sigui 0.
    while(num != 0){
        if (num > 0){
            positius++
        } else {
            negatius++
        }
        num = sc.nextInt()
    }

    var resposta = ""

    if (positius > negatius){
        resposta = "POSITIUS"
    } else if (negatius > positius){
        resposta = "NEGATIUS"
    } else {
        resposta = "IGUALS"
    }

    // Imprimeix la resposta.
    println(resposta)

    // Tanca l'escàner.
    sc.close()
}