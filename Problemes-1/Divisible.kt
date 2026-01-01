import java.util.Scanner

/*
    Entrada:
        1) Nombre N (Integer).

    Sortida: "SI" si N és divisible per 1,2,3,4,5,6,7,8,9 i "NO" en cas contrarii
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema els dos nombre en una variable.
    val n : Int = sc.nextInt()

    // Crea una variable per si es divisible o no.
    var resposta = "SI"

    // Es fixa si és any de divisible.
    for(i in 2 until 10){
        if(n % i != 0){
            resposta = "NO"
        }
    }

    // Imprimeix la resposta adequada.
    println(resposta)

    // Tanca l'escàner.
    sc.close()
}