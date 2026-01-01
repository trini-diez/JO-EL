import java.util.Scanner

/*
    Entrada: Número (Double)
    Sortida: El resultat ocuparà 15 posicions, si cal s'omplirà en 0s per l'esquerra, i mostrarà 3 decimals després del punt.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per emmagatzemar l'entrada.
    val costat : Double = sc.nextDouble()
    val area : Double = costat * costat

    // Format: 15 posicions, zeros a l'esquerra, 3 decimals
    val resultat = String.format("%015.3f", area)

    println(resultat)

    // Tanca l'escàner.
    sc.close()
}