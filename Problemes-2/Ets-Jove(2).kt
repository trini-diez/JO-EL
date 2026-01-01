import java.util.Scanner

/*
    Entrada: 5 lineas (Integers).
    Sortida: quants són 30 o menys.
 */

fun main(){
    // Crea una variable escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per emmagatzemar el nombre de "joves"
    var joves : Int = 0

    // Repeteix el bucle 5 vegades.
    repeat(5){
        val n = sc.nextInt()

        if (n <= 30){
            joves ++
        }
    }

    // Imprimeix el nombre de joves a la consola.
    println(joves)

    // Tanca l'escàner.
    sc.close()

}