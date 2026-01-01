import java.util.Scanner

/*
    Entrada:
        1) K = tamany array a crear.
        2) K = lineas.
        3) N = posició del array a accedir.
        (N < K)
    Sortida:
        1) Array sencer escrit.
        2) Contingut de l'array a la posició N.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc: Scanner = Scanner(System.`in`)

    // Emmmagatzema l'entrada de l'usuari a vairables.
    val tamanyArray: Int = sc.nextInt()
    sc.nextLine() // consumir el salt de línia pendent

    // Creem un array de Strings
    val array = Array<String>(tamanyArray){""}

    // Llegim K línies
    for (i in 0 until tamanyArray){
        array [i] = sc.nextLine()
    }

    // Llegim la posició a accedir
    val arrayPosition : Int = sc.nextInt()

    // Imprimim l’array complet
    for (i in 0 until tamanyArray) {
        println("${array[i]} ")
    }

    println() // salt de línia

    // Imprimim el contingut demanat
    println(array[arrayPosition])
}