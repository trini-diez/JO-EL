import java.util.Scanner

/*
    Entrada: Seqüència de nombres fins al -1 (Integers)
    Sortida: Nombre de 6 (Integer).
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre de cassos de prova en una variable.
    var nombre : Int = sc.nextInt()

    // Initicialitza una variable comptador.
    var comptador6 : Int = 0

    // Repteix el bucle fins que el comptador sigui igual al nombre..
    while (nombre != -1){
        if (nombre == 6){
            comptador6++
        }
        nombre = sc.nextInt()
    }

    // Imprimeix el nombre de nombres negatius.
    println(comptador6)

    // Tanca l'escàner.
    sc.close()
}