package `Problemes-3`

import java.util.Locale
import java.util.Scanner

/* Entrada: carnPicada → nombre de grams de carn (enter positiu)
    Pes croquetes:
    * pes croqueta normal = 4 grams
    * pes croqueta petita = 2.5 grams

    Capacitats paelles:
    paella petita ≤ 9 croquetes
    paella mitjana ≤ 18 croquetes
    paella gran ≤ 36 croquetes
    paella gegant > 36 croquetes

    Sortida:
    1) Nombre de croquetes
    2) Tipus de croqueta (normal/petita)
    3) Si sobra carn o no
    4) Mida de paella necessària
 */


fun main() {
    // Crea un escàner.
    val scanner : Scanner = Scanner (System.`in`).useLocale(Locale.UK)

    // Enmagatzema l'entrada de l'usuauri en una variable com a Double
    val gramsDeCarn : Int = scanner.nextInt()
    val gramsDeCarnDouble = gramsDeCarn.toDouble()

    // Crea variables per grams croquetes
    val gramsCroquetaGran : Double = 4.0
    val gramsCroquetaPetita : Double = 2.5

    // Crea variable per nombre de croquetes
    var nombreDeCroquetes : Int = 0

    // Crea variable per reste carn
    val resteCarnCroquetesGrans = gramsDeCarn % gramsCroquetaGran
    val resteCarnCroquetesPetites = gramsDeCarn % gramsCroquetaPetita

    // Calcula quantes croquetes es poden fer
    if (resteCarnCroquetesGrans < resteCarnCroquetesPetites){
        nombreDeCroquetes = (gramsDeCarnDouble/gramsCroquetaGran).toInt()
        println("$nombreDeCroquetes croquetes grans")
    } else {
        nombreDeCroquetes = (gramsDeCarnDouble/gramsCroquetaPetita).toInt()
        println("$nombreDeCroquetes croquetes petites")
    }

    // Calcula quina paella fer servir
    if (nombreDeCroquetes <= 9){
        println("paella petita")
    } else if (nombreDeCroquetes <= 18){
        println("paella mitjana")
    } else if (nombreDeCroquetes <= 36){
        println("paella gran")
    } else {
        println("paella gegant")
    }

    // Imprimeix el reste més petit.
    if (resteCarnCroquetesGrans < resteCarnCroquetesPetites){
        println(resteCarnCroquetesGrans)
    } else {
        println(resteCarnCroquetesPetites)
    }

    // Tanca el escàner.
    scanner.close()

}
