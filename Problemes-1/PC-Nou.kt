import java.util.Scanner

/*
    Entrada:
     1) Preu (Integer)
     2) Sou (Integer)
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Emmagatzema els valors llegits en variables.
    val price = sc.nextDouble()
    val salary = sc.nextDouble()

    // Cada mes té 30 dies.
    val dailySavings = salary / 30.0

    // Calcula quants dies calen per estalviar aquesta quantitat de diners.
    val daysToSave = Math.ceil(price / dailySavings).toInt()

    // Print the result
    println("En Pere ha d'estalviar durant $daysToSave dies")
}