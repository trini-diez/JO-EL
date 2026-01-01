import java.util.Scanner

/*
    Entrada: 5 lineas (Integers)
    Sortida: "SI" si els nombres fan muntanyes i "NO" en cas contrari
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema les entrades (els nombres) en variables
    val nombre1 : Int = sc.nextInt()
    val nombre2 : Int = sc.nextInt()
    val nombre3 : Int = sc.nextInt()
    val nombre4 : Int = sc.nextInt()
    val nombre5 : Int = sc.nextInt()


    // Imprimeix "SI" o "NO" a la consola.
    if (nombre1 < nombre2 && nombre2 < nombre3 && nombre3 < nombre4 && nombre4 < nombre5) {
        println("NO")
    } else if (nombre1 < nombre2 && nombre2 > nombre3 && nombre3 < nombre4 && nombre4 > nombre5){
        println("SI")
    } else if (nombre1 > nombre2 && nombre2 < nombre3 && nombre3 > nombre4 && nombre4 < nombre5){
        println("SI")
    } else {
        println("NO")
    }

    // Tanca l'escàner.
    sc.close()
}