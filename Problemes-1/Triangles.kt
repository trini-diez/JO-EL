import java.util.Scanner

/*
    Entrada: 2 nombres, altura y base triangle (Integers).
    Sortida: Àrea triangle.
    Fòrmula: b * a / 2
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema les entrada (els nombres) en una variable.
    val altura : Double = sc.nextInt().toDouble()
    val base : Double = sc.nextInt().toDouble()

    // Calcula el àrea del triangle.
    val area : Double = (base * altura) / 2

    // Imprimeix l'àrea la consola.
    println(area)

    // Tanca l'escàner.
    sc.close()
}