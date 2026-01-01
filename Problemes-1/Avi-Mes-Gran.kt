import java.util.Scanner

/*
    Entrada: (nom i edat (Integer)) x2.
    Sortida: nom de la persona amb més edat.
 */

fun main(){
    // Crea un escàner per a l'entrada de l'usuari.
    val lector : Scanner = Scanner(System.`in`)

    // Desa els valors escanejats en variables.
    val nomPersona1 = lector.next()
    val edatPersona1 : Int = lector.nextInt()
    val nomPersona2 = lector.next()
    val edatPersona2 : Int = lector.nextInt()

    // Imprimeix el nom de la persona amb més edat.
    if (edatPersona1 > edatPersona2) {
        println(nomPersona1)
    } else if (edatPersona1 == edatPersona2){
        println("Tenen la mateixa edat")
    } else {
        println(nomPersona2)
    }

    // Tanca l'escàner.
    lector.close()
}