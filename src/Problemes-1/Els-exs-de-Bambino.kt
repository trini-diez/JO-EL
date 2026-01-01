import java.util.Scanner

/*
    Entrada:
        1) A,B,C (> 18, Integer)
        2) D (> 18, Integer)

    Sortida: SI si D no té l'edat de A,B i C, i NO en cas contrari.
 */
fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema els tres nombres en una variable.
    val edata : Int = sc.nextInt()
    val edatb : Int = sc.nextInt()
    val edatc : Int = sc.nextInt()
    val edatd : Int = sc.nextInt()

    var resposta = "SI"

    // Comprara l'edat D amb les anteriors.
    if(edata == edatd || edatb == edatd || edatc == edatd){
        resposta = "NO"
    }

    println(resposta)

    // Tanca l'escàner.
    sc.close()
}