package `Problemes-3`

import java.util.Locale
import java.util.Locale.getDefault
import java.util.Scanner

/*
    Entrada:
        1) Nom
        2) Mesos
        3) Tipus de vi (blanc/negre/rosat)

    Sortida: "N es un vi T, catalogat com C i te un preu de P€."

    Capacitats programa: Té sensibilitat en posar les dades amb les lletres majuscules.

    Instruccions:
        * Si els mesos de reposat és de 18 mesos o més, és de categoria Noble.
        * Si els mesos de reposat és de 24 mesos o més, és de categoria Criança.
        * Si els mesos de reposat és de 36 mesos o més, és de categoria Anyenc.
        * Si els mesos de reposat és de 60 mesos és un Gran Reserva.
 */


fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Enmmagatzema el nom, els mesos y el tipus de vi en variables.
    val nom = sc.nextLine()
    val mesos : Int = sc.nextInt()
    val tipus = sc.next().uppercase(getDefault())

    // Cataloga el vi.
    var categoria = ""
    if (mesos == 60){
        categoria = "Gran Reserva"
    } else if (mesos >= 36){
        categoria = "Anyec"
    } else if (mesos >= 24){
        categoria = "Crianca"
    } else if (mesos >= 18){
        categoria = "Noble"
    }

    // Calcula el preu del vi tenint en compte el tipus de vi i la seva categoria.
    var preuVi : Double = 0.0

    if (tipus == "BLANC"){
        preuVi = 4.0
    } else if (tipus == "NEGRE"){
        preuVi = 5.0
    } else if (tipus == "ROSAT"){
        preuVi = 3.0
    }

    if (mesos == 60){
        preuVi += 5.0
    } else if (mesos >= 36){
        preuVi += 1.5
    } else if (mesos >= 24){
        preuVi += 1.2
    } else if (mesos >= 18){
        preuVi += 1.0
    }


    // Es fixa si el vi compleix els paràmetres per estar disponible.
    if ((mesos !in 18..60) || !((tipus == "BLANC")||(tipus == "ROSAT")||(tipus == "NEGRE"))){
        println("No disposem d'aquest vi")
    } else {
        // Imprimeix el missatge en el format desitjat a la consola.
        println( "$nom es un vi ${tipus.lowercase(getDefault())}, catalogat com $categoria i te un preu de ${preuVi}€.")
    }


    //Tanca l'escàner.
    sc.close()
}