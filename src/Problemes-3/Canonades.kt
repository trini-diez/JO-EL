package `Problemes-3`

import java.util.Scanner

/*
    Entrada: metres de canonada.
    Sortida: “Xm: Y euros” on X són els metres de canonada i Y és el cost total.
    Instruccions:
        * Els primers 24m costen 3 euros el metre
        * A partir dels 25m costa 4 euros el metre
        * A partir dels 75m costa 5 euros el metre
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Enmmagatzema el nombre de metres de canonada en una variable.
    val metres : Double = sc.nextDouble()

    // Calcula el preu.
    var preu : Double = 0.0

    if (metres >= 75){
        preu += 25.0 * 3
        preu += 50.0 * 4
        preu += (metres - 75) * 5
    } else if (metres >= 25){
        preu += (25 * 3)
        preu += (metres - 25) * 4
    } else {
        preu += metres * 3
    }

    // Imprimeix el preu a la consola en el format solicitat.
    println("${metres}m: $preu euros")

    //Tanca l'escàner.
    sc.close()
}