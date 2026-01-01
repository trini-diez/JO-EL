import java.util.Scanner

/*
    Entrada:
        * H (1-24, Integer)
        * M (1-59, Integer)
        * S (1-59, Integer)

    Sortida: hores, minuts i segons, si s'augmentés un segon a l'hora proporcionada.

 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Crea una variable per emmagatzemar la resposta.
    var resposta = "SI"

    // Emmagatzema els nombres en variables.
    var hores : Int = sc.nextInt()
    var minuts : Int = sc.nextInt()
    var segons : Int = sc.nextInt()

    if (segons >= 60 || minuts >= 60 || hores >= 24){
        resposta = "NO"
    }

    if (segons < 0 || minuts < 0 || hores < 0){
        resposta = "NO"
    }

    // Imprimeix la resposta.
    println(resposta)

    // Tanca l'escàner.
    sc.close()
}