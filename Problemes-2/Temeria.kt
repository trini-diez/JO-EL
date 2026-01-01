import java.util.Scanner

/*
    Entrada: 4 números (Integer 1-6).
    Salida: “RES”, “PARELLA”, “TRIO” o “POKER”
 */

fun main() {
    val sc: Scanner = Scanner(System.`in`)

    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val num3 = sc.nextInt()
    val num4 = sc.nextInt()

    // Comprobamos las repeticiones de los números usando if.
    if (num1 == num2 && num2 == num3 && num3 == num4) {
        // Si los cuatro números son iguales
        println("POKER")
    } else if ((num1 == num2 && num2 == num3) || (num1 == num2 && num2 == num4) || (num1 == num3 && num3 == num4) || (num2 == num3 && num3 == num4)) {
        // Si tres números son iguales
        println("TRIO")
    } else if ((num1 == num2) || (num1 == num3) || (num1 == num4) || (num2 == num3) || (num2 == num4) || (num3 == num4)) {
        // Si dos números son iguales
        println("PARELLA")
    } else {
        // Si no hay repeticiones
        println("RES")
    }

    // Cierra el escáner.
    sc.close()
}