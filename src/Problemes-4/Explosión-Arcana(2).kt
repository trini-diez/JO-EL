package `Problemes-4`

import java.util.Scanner
/*
   Entrada:
     1) Ini (Enter) = dany inicial.
     2) HP (Enter) = vida de l'enemic.

   Sortida: Nombre d'explosions necessàries per matar l'enemic
*/

fun main() {
    // Crea un escàner per a la entrada de l'usuari.
    val scanner = Scanner(System.`in`)

    // Desa els valors escanejats a variables.
    val ini: Int = scanner.nextInt()
    var HP: Int = scanner.nextInt()

    // Incrementa el comptador i fa disminuir la vida fins que sigui 0.
    var comptador: Int = 0
    while (HP > 0){
        comptador++
        HP -= ini * comptador
    }
    println(comptador)

// Tanca el escàner.
    scanner.close()
}