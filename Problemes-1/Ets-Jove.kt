import java.util.Scanner

/*
    Entrada: Edat (Intreger).
    Sortida:
        * < 32 -> "SI"
        else -> "NO"
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema l'entrada (el nombre) en una variable.
    val nombre : Int = sc.nextInt()

    // Imprimeix la resposta corresponent a la consola.
    if (nombre < 32){
        println("SI")
    } else {
        println("NO")
    }

    // Tanca l'escàner.
    sc.close()
}