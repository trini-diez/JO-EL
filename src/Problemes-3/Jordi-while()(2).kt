package `Problemes-3`

import java.util.Scanner

/*
    Entrada: nombre desconegut de números fins a que hi haging tres -1.
    Sortida: nombre de números abans de que hi hagin tres -1 (sense comptar els vídeos amb strike).
 */

fun main(){
    // Crea una variable escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per contar els strikes.
    var strikes : Int = 0

    // Crea una variable per contar el total de videos.
    var videos : Int = 0

    while(strikes < 3){
        val n : Int = sc.nextInt()

        if (n == -1){
            strikes++ // Incrementem strikes només si és -1
        } else {
            videos += n // Incrementem viewers només si no és -1
        }
    }

    // Imprimeix la resposta a la consola.
    println(videos)

    // Tanca l'escàner.
    sc.close()
}