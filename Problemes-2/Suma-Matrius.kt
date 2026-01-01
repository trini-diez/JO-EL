import java.util.Scanner

/*
    Entrada:
    1) Nombre K (2-8) que determina les líneas.
    2) Dos matrius de k*k nombres.

    Sortida: matriu resultat de la suma de la matriu A amb la matriu B.
 */


fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc: Scanner = Scanner(System.`in`)

    // Emmmagatzema el nombre de casos en una variable.
    val k : Int = sc.nextInt()

    // Crea una matriu 1.
    val matriu1 = Array(k){ IntArray(k) }

    // Omple la matriu 1.
    for (fila in 0 until k){
        for (col in 0 until k){
            matriu1[fila][col] = sc.nextInt()
        }
    }

    // Crea una matriu 2.
    val matriu2 = Array(k){ IntArray(k) }

    // Omple la matriu 2.
    for (fila in 0 until k){
        for (col in 0 until k){
            matriu2[fila][col] = sc.nextInt()
        }
    }

    // Crea la matriu suma de matrius.
    val suma = Array(k){ IntArray(k) }

    // Suma les matrius.
    for (fila in 0 until k){
        for (col in 0 until k){
            suma[fila][col] = matriu1[fila][col]+matriu2[fila][col]
        }
    }

    // Imprimeix la matriu.
    for (fila in 0 until k){
        for (col in 0 until k){
            print("${suma[fila][col]} ")
        }
        println()
    }

    // Tanca l'escàner.
    sc.close()
}