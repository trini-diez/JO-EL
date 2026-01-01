package `Problemes-2`

import java.util.Scanner

/*
    Entrada: número enter, N, del 0 al 10.
    Sortida:
        0-4: "Suspes"
        5-6: "Aprovat"
        7-8: "Notable"
        9-10: "Excelent"
 */
fun main(){
    // Obre un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema l'entrada de l'usuari en una variable.
    val nota : Int = sc.nextInt()

    // Crea una variable per la resposta.
    var resposta = ""

    // Diu una resposta segons el valor de nota.
    when (nota){
        in 0..4 -> resposta = "Suspes"
        in 5..6 -> resposta = "Aprovat"
        in 7..8 -> resposta = "Notable"
        in 9..10 -> resposta = "Excelent"
    }

    // Imprimeix la resposta.
    println(resposta)
}