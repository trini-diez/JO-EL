import java.util.Scanner

/*
    Entrada:
        1) Nombre de cassos (Integer).
        2) Seqüència de n nombres (Integers).

    Sortida: total de nombre positius tractats
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per emmagatzemar el nombr de casos de prova.
    val cassosProva : Int = sc.nextInt()

    // Initcialitza una vairable per als nombres positius.
    var nombresPositius : Int = 0

    // Repteix el bucle tantes vegades com cassos de prova.
    repeat(cassosProva){
        val nombre : Int = sc.nextInt()
        if (nombre > 0){
            nombresPositius++
        }
    }

    // Imprimeix el nombre de nombres positius.
    println(nombresPositius)

    // Tanca l'escàner.
    sc.close()
}