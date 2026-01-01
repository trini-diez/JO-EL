import java.util.Scanner

/*
    Entrada: forma d'acomiadar-se d'algun dels païssos europeus.
    Sortida: codi ISO del país al que pertany la forma d'acomiadar-se
*/

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Emmagatzema l'entrada de l'usuari en una variable.
    val salutacio = sc.nextLine().trim()

    // Imprimeix un resultat a la consola segons l'entrada.
    when (salutacio.uppercase()) {
        "ADIOS" -> println("ES")     // Espanya
        "GOOD BYE" -> println("UK")  // Anglaterra
        "AU REVOIR" -> println("FR") // França
        "CIAO" -> println("IT")      // Itàlia
        "DOEI" -> println("NL")      // Països Baixos
        "TSCHUSS" -> println("DE")   // Alemanya
        else -> println("??")
    }

    // Tanca l'escàner
    sc.close()
}