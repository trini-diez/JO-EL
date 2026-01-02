package `Problemes-3`

import java.util.Scanner

/*
    Input: status (Integer), hp (Integer), i max_hp (Integer).
    Output:
    * hp == 0 --> "RES"
    * hp < max_hp --> “DEBILITAT”
    * status == 0 --> "CURAR"
    * hp == max_hp i status !=0 --> "ESTAT"
     * hp == max_hp i status == 0 --> "CURAR I ESTAT"
 */

fun main(){
    //Creates a scanner for the user inputs
    val scan : Scanner = Scanner(System.`in`)

    //Saves scanned values in variables
    val status: Int = scan.nextInt()
    val hp: Int = scan.nextInt()
    val max_hp: Int = scan.nextInt()

    //According to values saved in variables prints different sentences
    if (hp == 0) {
        println("DEBILITAT")
    } else if (hp < max_hp && status != 0) {
        println("CURAR I ESTAT")
    } else if (hp < max_hp) {
        println("CURAR")
    } else if (hp == max_hp && status != 0) {
        println("ESTAT")
    } else {
        println("RES")
    }
}