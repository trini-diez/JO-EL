import java.util.Scanner

/*
    Entrada: hores (Integer), absències justificades (Integer) i absències no justificades (Integer).
    Sortida: més del 20% d'absències totals / 10% d'absències injustificades --> NO o SI si té dret a l'avaluació continuada.
 */

fun main(){
    // Crea un escàner per a l'entrada de l'usuari
    val lector : Scanner = Scanner(System.`in`)

    // Desa els valors escanejats en variables
    val hores : Int = lector.nextInt()
    val absenciesJustificades : Int = lector.nextInt()
    val absenciesInjustificades : Int = lector.nextInt()

    // Calcula les absències totals
    val absenciesTotals : Int = absenciesJustificades + absenciesInjustificades

    // Imprimeix "NO" si les absències són més del 20%
    if (absenciesTotals > (hores * 20 / 100)){
        println("NO")
        // Imprimeix "NO" si les absències injustificades són més del 10%
    } else if (absenciesInjustificades > (hores * 10 / 100)){
        println("NO")
        // Imprimeix "SI" en cas contrari
    } else {
        println("SI")
    }
}