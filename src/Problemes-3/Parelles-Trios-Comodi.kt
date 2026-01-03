import java.util.Scanner

/*
    Entrada: tres nombres (Integers).
    Sortida:
    Si entre aquests tres nombres hi ha dos iguals, dirà “PARELLA”
    Si els tres nombres són iguals, dirà “TRIO”
    Si no hi ha cap parella ni cap trio, dirà “RES”
    0 és comodí
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Emmagatzema els tres nombres en variables.
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val num3 = sc.nextInt()

    // Si els tres números són iguals, diu "TRIO".
    if (num1 == num2 && num2 == num3) {
        println("TRIO")
    }
    // Si hi ha un 0 i dos números iguals, diu "TRIO".
    else if ((num1 == num2 || num2 == num3 || num1 == num3) &&
        (num1 == 0 || num2 == 0 || num3 == 0)) {
        println("TRIO")
    }
    // Si hi ha exactament dos números iguals (i no hi ha comodí 0), diu "PARELLA".
    else if ((num1 == num2 || num2 == num3 || num1 == num3) &&
        (num1 != 0 && num2 != 0 && num3 != 0)) {
        println("PARELLA")
    }
    // Si un dels nombres és 0 diu "PARELLA".
    else if (num1 == 0 || num2 == 0 || num3 == 0) {
        println("PARELLA")
    }
    // Si no hi ha cap parella ni trio, diu "RES".
    else {
        println("RES")
    }

    // Tanca l'escàner.
    sc.close()
}