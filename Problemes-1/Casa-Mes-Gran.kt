import java.util.Locale.UK
import java.util.Scanner

/*
    Entrada:
    1) Nom persona (String)
    2) Integers:
        * Número pisos casa (1-3)
        * Amplada cada pis
        * Llargada cada pis
    Sortida: nom de la persona amb més metres quadrats de casa.
    En el cas que siguin iguals mostrarà un missatge del tipus:
    "Les dues cases son igual de grans".
 */

fun main(){
    // Obre un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`).useLocale(UK)

    // Emmagatzema les entradas de l'usuari en variables.
    val nom1 = sc.next()
    sc.nextLine()
    val pisos1 : Double = sc.nextDouble()
    val amplada1 : Double = sc.nextDouble()
    val llargada1 : Double = sc.nextDouble()

    val nom2 = sc.next()
    sc.nextLine()
    val pisos2 : Double = sc.nextDouble()
    val amplada2 : Double = sc.nextDouble()
    val llargada2 : Double = sc.nextDouble()

    // Calcula la mida de les cases.
    val mida1 : Double = amplada1 * llargada1 * pisos1
    val mida2 : Double = amplada2 * llargada2 * pisos2

    // Imprimeix un resultat segons la mida de la casa.
    if(mida1 > mida2){
        println(nom1)
    } else if (mida2 > mida1){
        println(nom2)
    } else {
        println("Les dues cases son igual de grans")
    }

}