import java.util.Scanner

/*
    Entrada:
        1) Número de casos (0-1000)
        Per cada cas:
            * P/K/S/C
            * text complet
    Sortida:
        text convertit segons la notació indicada
*/

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Enmagatzema la entrada en una variable.
    val nombreDeCasos = sc.nextInt()
    sc.nextLine()

    // Repeteix el bucle tantes vegades com nombre de casos.
    repeat(nombreDeCasos) {
        val tipus = sc.next()
        sc.nextLine()
        val linea = sc.nextLine().trimStart()

        when (tipus) {
            "P" -> { // PascalCase
                val paraules = linea.split(" ").filter { it.isNotEmpty() }
                val resultat = paraules.joinToString("") { p ->
                    val min = p.lowercase()
                    min.replaceFirstChar { c -> c.uppercaseChar() }
                }
                println(resultat)
            }

            "K" -> println(linea.lowercase().replace(" ", "-"))

            "S" -> println(linea.lowercase().replace(" ", "_"))

            "C" -> { // CamelCase
                val paraules = linea.split(" ").filter { it.isNotEmpty() }
                val sb = StringBuilder()

                for ((i, p) in paraules.withIndex()) {
                    val min = p.lowercase()
                    if (i == 0) {
                        sb.append(min) // primera paraula en minúscules
                    } else {
                        sb.append(
                            min.replaceFirstChar { c -> c.uppercaseChar() }
                        )
                    }
                }

                println(sb.toString())
            }

            else -> println(linea)
        }
    }

    sc.close()
}