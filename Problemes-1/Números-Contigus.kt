import java.util.Scanner

/*
    Entrada:
        1) Nombre A.
        2) Nombre B.

    Sortida: "SI" si A i B són contigus i "NO" en cas contrari
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema els dos nombres en una variable.
    val num1 : Int = sc.nextInt()
    val num2 : Int = sc.nextInt()

    // Es fixa si son contigus.
    if ((num1 + 1 == num2) || (num2 + 1 == num1)){
        println("SI")
    } else {
        println("NO")
    }

    // Tanca l'escàner.
    sc.close()
}