import java.util.Scanner

/*
    Entrada:
        1) N: Posició inicial al top d'Espanya de Furancescu.
        2) K : Quantitat de tornejos que ha jugat.

     Sortida: posició de Furancescu després de jugar K tornejos.
*/

fun main(){
    // Obre l'escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema les entrades en variables.
    var n : Int = sc.nextInt()
    val k : Int = sc.nextInt()

    // Repeteix el bucle tantes vegades com k.
    repeat(k){
        n /= 2
    }

    // Imprimeix la resposta.
    println(n)

    // Tanca l'escàner.
    sc.close()
}