import java.util.Scanner

/*
    Entrada: linea de texto hasta recibir "FIN"
    Sortida: SI si hay tantos abrir exclamación como cerrar exclamación y NO en caso contrario
 */

fun main(){
    // Obre l'escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Llegeix la primera línia
    var texto = sc.nextLine()

    // Repeteix el loop mentre el contingut de la variable no siga "FIN"
    while (texto != "FIN"){

        // Compta exclamacions d'obertura i tancament
        val abrir = texto.count { it == '¡' }
        val cerrar = texto.count { it == '!' }

        // Mostra SI o NO
        if (abrir == cerrar){
            println("SI")
        } else {
            println("NO")
        }

        // Llegeix la següent línia
        texto = sc.nextLine()
    }

    // Tanca l'escàner.
    sc.close()
}