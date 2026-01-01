import java.util.Scanner
/*
    Programa que comprova si una persona és Baby Boomer.
    Entrada:
        - Un nombre enter, l'any de naixement (1..2020)
    Sortida:
        - "ok boomer" si l'any està entre 1945 i 1965 inclòs
        - "nah" en cas contrari
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Llegeix l'any de naixement
    val anyNaixement: Int = sc.nextInt()

    // Comprova si l'any està entre 1945 i 1965, incloent-los
    if (anyNaixement in 1945..1965) {
        println("ok boomer")
    } else {
        println("nah")
    }

    // Tanca l'escàner
    sc.close()
}