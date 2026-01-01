import java.util.Scanner
/*
    Entrada:
        1) Nombre de casos de prova.
        2) 5 nombres enters positius (0-99999).
    Sortida:
    * Si el cas conté almenys tres números iguals, escriurà el número repetit almenys 3 vegades.
    * Si el cas no conté almenys tres números iguals, escriurà “NO”.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc: Scanner = Scanner(System.`in`)

    // Llegim el nombre de casos de prova.
    val casosProva: Int = sc.nextInt()

    // Repeteix el bucle per a cada cas de prova.
    repeat(casosProva) {
        val num1: Int = sc.nextInt()
        val num2: Int = sc.nextInt()
        val num3: Int = sc.nextInt()
        val num4: Int = sc.nextInt()
        val num5: Int = sc.nextInt()

        // Inicialitzem la resposta com "NO"
        var resposta = "NO"

        // Comprovar si hi ha almenys tres números iguals
        if (num1 == num2 && num1 == num3) {
            resposta = "$num1"
        } else if (num1 == num2 && num1 == num4) {
            resposta = "$num1"
        } else if (num1 == num2 && num1 == num5) {
            resposta = "$num1"
        } else if (num1 == num3 && num1 == num4) {
            resposta = "$num1"
        } else if (num1 == num3 && num1 == num5) {
            resposta = "$num1"
        } else if (num1 == num4 && num1 == num5) {
            resposta = "$num1"
        } else if (num2 == num3 && num2 == num4) {
            resposta = "$num2"
        } else if (num2 == num3 && num2 == num5) {
            resposta = "$num2"
        } else if (num2 == num4 && num2 == num5) {
            resposta = "$num2"
        } else if (num3 == num4 && num3 == num5) {
            resposta = "$num3"
        }

        // Imprimir la resposta per aquest cas de prova.
        println(resposta)
    }

    // Tancar l'escàner
    sc.close()
}