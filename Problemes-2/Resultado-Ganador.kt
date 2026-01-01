import java.util.Scanner

/*
    Entrada:
        1) Puntació 3 alabaricoque
        2) Puntació 2 alabaricoque
        3) Puntació 1 alabaricoque
        4) Puntació 3 banana
        5) Puntació 2 banana
        6) Puntació 1 banana

     Sortida:  A si ganan los Albaricoques, B si ganan las Bananas y T si el partido se va a Tiempo Extra por ser empate.
 */

fun main() {
    // Crea un escáner para leer la entrada del usuario.
    val sc : Scanner = Scanner(System.`in`)

    var sumaA: Int = 0
    for (i in 3 downTo 1) {
        sumaA += sc.nextInt() * i
    }

    var sumaB: Int = 0
    for (i in 3 downTo 1) {
        sumaB += sc.nextInt() * i
    }

    var respuesta = "T"

    if (sumaA > sumaB) {
        respuesta = "A"
    } else if (sumaB > sumaA) {
        respuesta = "B"
    }

    println(respuesta)

    // Cierra el escáner.
    sc.close()
}