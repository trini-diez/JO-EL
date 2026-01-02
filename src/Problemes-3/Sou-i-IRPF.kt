package `Problemes-3`

import java.util.Scanner

/*
    Entrada:
        1) Nom treballador.
        2) Edat treballador.
        3) Hores de treball setmanals.
    Sortida: N te un salari de X euros al mes i paga un IRPF de Y euros.
    Instruccions:
        * si treballa <40 hores 10e/h
        * si treballa >40 hores 10e/h 40 primeres hores i 15e/h hores següents
        * un mes son 4 setmanes i mitja

        Si el treballador té 35 anys o més i el seu salari brut anual és superior a 20000 (14 pagues) se li aplica un IRPF del 17%.
        Si el treballador té 50 anys o més, s’aplica un IRPF del 14%.
        Per la resta, s'aplica un IRPF del 20%.
 */

fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Emmagatzema el nom del treballador. l'edat del treballador i les hores de treball setmanals en variables.
    val nom = sc.next()
    val edat : Int = sc.nextInt()
    val horesTreball : Double = sc.nextDouble()

    // Calcular salari del treballador per hores de treball.
    var salariSemanal : Double = 0.0

    if (horesTreball < 40){
        salariSemanal = (10 * horesTreball).toDouble()
    } else {
        salariSemanal = 40 * 10 + (15 * (horesTreball - 40)).toDouble()
    }

    // Calcular salari mensual
    var salariMensual : Double = salariSemanal * 4.5

    // Calcular IRPF per edat i salari del treballador.
    var irpf : Int = 20
    if (edat >= 50){
        irpf = 14
    } else if (edat >= 35 && (salariMensual * 14)>20000){
        irpf = 17
    }

    // Calcular el cost del irpf.
    var costirpf = salariMensual * irpf / 100

    // Imprimeix la sortida a la consola.
    println("$nom te un salari de $salariMensual euros al mes i paga un IRPF de $costirpf euros.")

    //Tanca l'escàner.
    sc.close()
}