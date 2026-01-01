import java.util.Scanner

/*
    Entrada: nombre = sou en euros (Integer).
    Sortida: "SI" si el sou es igual o superior a 30400 euros bruts i "NO" en cas contrari
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Llegeix el sou
    val sou: Double = sc.nextDouble()

    // Comprova si el sou és igual o superior a 30400
    if (sou >= 30400) {
        println("SI")
    } else {
        println("NO")
    }

    // Tanca l'escàner
    sc.close()
}