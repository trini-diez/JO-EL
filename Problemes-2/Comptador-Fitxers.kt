import java.util.Scanner

/*
    Entrada: 1 nombre positiu.
    Sortida: Compte des de 1 fins al nombre de fitxes.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre de cassos de prova en una variable.
    var nombre : Int = sc.nextInt()

    var comptador : Int = 1
    println(comptador)

    // Repteix el bucle fins que el comptador sigui igual al nombre..
    while (comptador != nombre){
        comptador ++
        println(comptador)
    }

    // Tanca l'escàner.
    sc.close()
}