import java.util.Scanner

/*
    Entrada: 1 número (Integer, 1-1439).
    Sortida: l'hora en format hh:mm.
 */

fun main(){
    // Crea una variable escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per emmagatzemar l'hora en minuts
    val horaEnMinuts : Int = sc.nextInt()

    // Calcula el nombre de hores i minuts.
    val hores = horaEnMinuts / 60
    val minutes = horaEnMinuts - hores * 60

    // Imprimeix l'hora a la consola (sense format amb zeros davant)
    println("$hores : $minutes")

    // Tanca l'escàner.
    sc.close()
}