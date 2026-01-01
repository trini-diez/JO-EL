import java.util.Scanner

/*
    Entrada:
        1) Nombre de caramels que tinc (Integer).
        2) Nombre de nebots que han vingut a casa (Integer).
    Sortida: Quants caramels li queden a cada nebot.
*/

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema les entrades (els nombres) en variables.
    val caramels : Int = sc.nextInt()
    val nebots : Int = sc.nextInt()

    //Si el nombre de nebots és 0 imprimeix 0, sinó imprimeix la divisió de nebots entre caramels.
    if (nebots == 0){
        println(0)
    } else {
        // Calcula el nombre de caramels per nebot.
        val caramelsPerNebot : Int = caramels/nebots
        println(caramelsPerNebot)
    }

    // Tanca l'escàner.
    sc.close()

}