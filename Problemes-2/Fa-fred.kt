import java.util.Scanner

/*
    Entrada: nombre desconegut de números enters.
    Sortida:
        * quants dies fa fred (temperatura < 0)
        * temperatura mitja dels dies freds
*/

fun main() {
    val sc = Scanner(System.`in`)

    // Llegeix la línia d'entrada completa
    val linea = sc.nextLine()

    // Crea una llista per emmagatzemar els dies amb temperatura menor a 0
    val diesFreds = arrayListOf<Int>()

    // Separa la línia per espais i converteix cada element a Int
    val temperatures = linea.split(" ").map { it.toInt() }

    // Itera sobre totes les temperatures
    for (temp in temperatures) {
        if (temp < 0) {
            // Si fa fred, afegeix la temperatura a la llista
            diesFreds.add(temp)
        }
    }

    // Mostra el nombre de dies amb fred
    println(diesFreds.size)

    // Calcula i mostra la mitjana dels dies freds
    // Evita dividir per zero si no hi ha dies freds
    if (diesFreds.isNotEmpty()) {
        val mitjana = diesFreds.average()  // Retorna un Double
        println(mitjana)
    } else {
        println(0.0)  // Si no hi ha dies freds, mitjana = 0
    }

    sc.close()
}