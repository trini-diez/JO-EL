import java.util.Scanner
import kotlin.math.abs

/*
    Entrada:
        1) C1 = distància en cm Alex-paret (Integer)
        2) C2 = distància en cm alumne-paret (Integer)
        3) C3 = llargària patinet (Integer)

     Sortida:
      * si el patinet no colpeja al l'altre alumne "OK"
      else "SEGURO"
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner (System.`in`)

    // Emmagatzema els nombres en variables.
    val c1 : Double = sc.nextDouble()
    val c2 : Double = sc.nextDouble()
    val c3 : Double = sc.nextDouble()

    // Imprimeix "OK" si el patinet no colpeja a l'altre alumne, i "SEGURO" sinó.
    if (abs(c1 - c2) > c3){
        println("OK")
    } else {
        println("SEGURO")
    }

    // Tanca l'escàner.
    sc.close()
}