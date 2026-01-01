package `Problemes-1`
import java.util.Scanner
/*
    Entrada:
        1) Nombre A (1 - 2200, Integer).

    Sortida: "SI" si l'any es de traspàs i "NO" en cas contrari
 */
fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema els dos nombre en una variable.
    val any : Int = sc.nextInt()

    // Es fixa si és any de trespàs (divisible per 4).
    if ((any % 4 == 0 && any % 100 != 0) || (any % 400 == 0)) {
        println("SI")
    } else {
        println("NO")
    }

    // Tanca l'escàner.
    sc.close()
}