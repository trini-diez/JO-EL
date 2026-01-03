package `Problemes-3`

import java.util.Scanner

/*
    Entrada:
        1) C1 = altura màxima planta cm inclusiva (Double)
        2) C2 = altura mínima planta cm inclusiva (Double)
        3) K1, K2, K3 = altura tres plantes.

     Sortida: nombre amb quants "Arbolitos" hi ha
     (plantes mássa altes per ser un arbust i massa baixes per ser un arbre)
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner (System.`in`)

    // Emmagatzema els nombres en variables.
    val c1 : Double = sc.nextDouble()
    val c2 : Double = sc.nextDouble()

    // Es fixa quin nombre és més gran.
    val alturaMin = minOf(c1, c2)
    val alturaMax = maxOf(c1, c2)

    // Crea un contador para la planta.+
    var arbolito : Int = 0

    repeat(3){
        val alturaPlanta : Double = sc.nextDouble()
        if (alturaPlanta > alturaMin && alturaPlanta < alturaMax) {
            arbolito++
        }
    }

    // Imprimeix el nombre de "arbolitos"
    println(arbolito)

    // Tanca l'escàner.
    sc.close()
}