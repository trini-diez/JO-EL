package `Problemes-3`

import java.util.Locale
import java.util.Scanner

/*
    Entrada:
        1) N = alumnes classe A (Integer)
        2) M = alumnes classe B (Integer)

    Sortida:
        * Si la classe A té més alumnes que la B, torna una matriu amb la lletra A dibuixada.
        * Per contrapartida, si la classe B té més alumnes torna una matriu amb la lletra B.
        * Si les dos classes tenen el mateix nombre el cartell està buit.
 */

fun main(){
    // Crea una variable escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre d'alumnes en variables.
    val alumnesA : Int = sc.nextInt()
    val alumnesB : Int = sc.nextInt()

    // Torna un cartell.
    if (alumnesA > alumnesB){
        println(". X X X . ")
        println("X . . . X ")
        println("X X X X X ")
        println("X . . . X ")
        println("X . . . X")
    } else if (alumnesB > alumnesA){
        println("X X X X .")
        println("X . . . X ")
        println("X X X X . ")
        println("X . . . X ")
        println("X X X X .")
    } else {
        repeat(5){
            println(". . . . .")
        }
    }


    // Tanca el escàner.
    sc.close()
}