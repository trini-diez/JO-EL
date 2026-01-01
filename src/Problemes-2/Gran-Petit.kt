package `Problemes-2`

import java.util.Scanner
import kotlin.math.abs

/*
    Entrada: dos números, A i B, cada un en una línia
    Sortida: la diferència absoluta entre A i B
*/

fun main() {
    val sc = Scanner(System.`in`)

    // Comprovem si hi ha més dades
    while (sc.hasNextLine()) {
        // Llegim A
        val lineA = sc.nextLine().trim()
        if (lineA.isEmpty()) break
        val A = lineA.toIntOrNull() ?: break

        // Llegim B
        val lineB = sc.nextLine().trim()
        if (lineB.isEmpty()) break
        val B = lineB.toIntOrNull() ?: break

        // Calculem la diferència absoluta
        val diferencia = abs(A - B)

        // Imprimim la diferència
        println(diferencia)
    }

    sc.close()
}