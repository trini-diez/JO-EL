import java.util.Scanner

/*
    Entrada: 3 nombres enters: N (prestatges), M (capacitat de cada prestatge), K (total llibres que volem posar)
    Sortida: total de llibres que no han cabut als prestatges.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema les entrades en variables.
    var n : Int = sc.nextInt()
    var m : Int = sc.nextInt()
    var k : Int = sc.nextInt()

    // Calcula l'espai total per llibres.
    val espaiTotal : Int = n * m

    // Imprimeix total de llibres que no han cabut als prestatges a la consola.
    if ((espaiTotal == 0)|| (k == 0)){
        println(k)
    } else if (espaiTotal > k){
        println(0)
    } else {
        println((espaiTotal - k)* -1)
    }

    // Tanca l'escàner.
    sc.close()
}