package `Problemes-5`

/*
    Entrada: seqüència de números enters, entre -100000 i 100000, que finalitza amb un zero,
             que no s'ha de processar.
    Sortida: número més gran i el més petit en una mateixa línia i separats per un espai en blanc.
 */

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var nombre = sc.nextInt()

    var nombreGran = nombre
    var nombrePetit = nombre

    while (nombre != 0) {
        if (nombre > nombreGran) nombreGran = nombre
        if (nombre < nombrePetit) nombrePetit = nombre

        nombre = sc.nextInt()
    }

    println("$nombreGran $nombrePetit")

    sc.close()
}