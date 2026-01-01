import java.util.Scanner

/*
    Entrada: un número de l'1 al 7
    Sortida: el dia de la setmana corresponent en anglès
*/

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Llegeix la línia d'entrada i treu els espais sobrants.
    val input = sc.nextLine().trim()

    // Converteix l'entrada a número
    val n = input.toIntOrNull()

    // Map dels dies de la setmana
    val diesSetmana = arrayOf(
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    )

    // Comprova que el número és vàlid i imprimeix el dia corresponent
    if (n != null && n in 1..7) {
        println(diesSetmana[n - 1])  // Restem 1 perquè els arrays comencen en 0
    } else {
        println("Número invàlid")
    }

    // Tanca l'escàner
    sc.close()
}