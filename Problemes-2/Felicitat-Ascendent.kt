import java.util.Scanner

/*
    Entrada:
        * F1 (Integer)
        * F2 (Integer)
        * F3 (Integer)

    Sortida:  "SI" si la felicitat és ascendent dia a dia i "NO" en cas contrari
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema els nombres en variables.
    val num1 : Int = sc.nextInt()
    val num2 : Int = sc.nextInt()
    val num3 : Int = sc.nextInt()

    // Crea una variable per la resposta.
    var resposta = "NO"

    // Es fixa quantes són iguals.
    if (num1 < num2 && num2 < num3){
        resposta = "SI"
    }

    // Imprimeix la resposta a la consola.
    println(resposta)

    // Tanca l'escàner.
    sc.close()
}