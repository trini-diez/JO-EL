import java.util.Scanner

/*
    Entrada:
        1) C1 (1-13, Integer)
        2) C2 (1-13, Integer)
        3) C3 (1-13, Integer)

    Sortida: "SI" si les tres cartes son iguals i "NO" en cas contrari
 */
fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Enmagatzema els tres nombres en una variable.
    val c1 : Int = sc.nextInt()
    val c2 : Int = sc.nextInt()
    val c3 : Int = sc.nextInt()

    // Es fixa si és any de trespàs (divisible per 4).
    if ((c1 == c2) && (c2 == c3)) {
        println("SI")
    } else {
        println("NO")
    }

    // Tanca l'escàner.
    sc.close()
}