package `Problemes-1`
import java.util.Scanner

/*

    Entrada:
        1) N
        2) Lineas

    Sortida: n línies de text contenint el mateix text que s'ha llegit, però primer minúsucula i després majúscula.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema la entrada en una variable.
    val nombreDeLineas : Int = sc.nextInt()
    sc.nextLine()

    // Repeteix el bucle tantes vegades com indiqui l'entrada de l'usuari.
    repeat(nombreDeLineas){
        val linea = sc.nextLine()
        var nuevaLinea = ""

        for (i in linea.indices){
            if (i % 2 == 0){
                nuevaLinea += linea[i].lowercase()
            } else {
                nuevaLinea += linea[i].uppercase()
            }
        }
        println(nuevaLinea)
    }

    // Tanca l'escàner.
    sc.close()
}