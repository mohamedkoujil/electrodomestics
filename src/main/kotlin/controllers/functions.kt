package controllers

import classes.Electrodomestic
import classes.Rentadora
import classes.Televisio

/**
 * Funció que retorna un array amb tots els electrodomèstics
 * @author mohamedkoujil
 * @since 4/02/2024
 * @return array amb tots els electrodomèstics
 */
fun arrayElectrodemestics(): Array<Electrodomestic> {
    return arrayOf(
        Electrodomestic(150.0, "negre", 'A', 20),
        Electrodomestic(200.0, "blanc", 'B', 30),
        Electrodomestic(250.0, "blanc", 'C', 40),
        Electrodomestic(300.0, "negre", 'D', 50),
        Electrodomestic(350.0, "blanc", 'E', 60),
        Electrodomestic(400.0, "negre", 'F', 70),
        Rentadora(400.0, 5.0),
        Rentadora(500.0, 8.0),
        Televisio(800.0, 52),
        Televisio(350.0, 28),
    )
}

/**
 * Funció que retorna una llista amb totes les rentadores
 * @author mohamedkoujil
 * @since 4/02/2024
 * @param electrodomestics
 * @return Llista de rentadores
 */
fun filtreRentadores(electrodomestics: Array<Electrodomestic>): MutableList<Rentadora> {
    var rentadores = mutableListOf<Rentadora>()
    for (electrodomestic in electrodomestics) {
        if (electrodomestic is Rentadora) {
            rentadores.add(electrodomestic)
        }
    }
    return rentadores
}

/**
 * Funció que retorna una llista amb totes les televisors
 * @author mohamedkoujil
 * @since 4/02/2024
 * @param electrodomestics
 * @return Llista de televisors
 */
fun filtreTelevisions(electrodomestics: Array<Electrodomestic>): MutableList<Televisio> {
    var televisions = mutableListOf<Televisio>()
    for (electrodomestic in electrodomestics) {
        if (electrodomestic is Televisio) {
            televisions.add(electrodomestic)
        }
    }
    return televisions
}

/**
 * Funció que imprimeix tots els electrodomèstics, rentadores i televisors amb el seu preu final i preu base
 * @author mohamedkoujil
 * @since 4/02/2024
 * @param electrodomestics
 */
fun imprimirElectrodomestics(electrodomestics: Array<Electrodomestic>) {
    // Comprovem quin tipus d'electrodomèstic és
    when (electrodomestics[0]) {
        is Rentadora -> {
            for (i in electrodomestics.indices) {
                println("classes.Rentadora ${i + 1}:")
                println(electrodomestics[i])
            }
        }
        is Televisio -> {
            for (i in electrodomestics.indices) {
                println("classes.Televisio ${i + 1}:")
                println(electrodomestics[i])
            }
        }
        else -> {
            for (i in electrodomestics.indices) {
                println("classes.Electrodomestic ${i + 1}:")
                println(electrodomestics[i])
            }
        }
    }
}

/**
 * Funció que imprimeix el preu base i el preu final de tots els electrodomèstics, rentadores i televisors
 * @author mohamedkoujil
 * @since 4/02/2024
 * @param electrodomestics
 * @param rentadores
 * @param televisions
 */
fun imprimirPreus (electrodomestics: Array<Electrodomestic>, rentadores: MutableList<Rentadora>, televisions: MutableList<Televisio>) {
    println("Electrodomestics:\n" +
            "    - Preu base: ${preuTotalBaseElectrodomestics(electrodomestics)}€\n" +
            "    - Preu final: ${preuTotalElectrodomestics(electrodomestics)}€\n")
    println("Rentadores:\n" +
            "    - Preu base: ${preuTotalBaseRentadores(rentadores)}€\n" +
            "    - Preu final: ${preuTotalRentadores(rentadores)}€\n")
    println("Televisions:\n" +
            "    - Preu base: ${preuTotalBaseTelevisions(televisions)}€\n" +
            "    - Preu final: ${preuTotalTelevisions(televisions)}€\n")
}

/**
 * Funció que retorna el preu base total de totes les rentadores
 * @author mohamedkoujil
 * @since 4/02/2024
 * @param rentadores
 * @return preu base total de totes les rentadores
 */
fun preuTotalBaseRentadores(rentadores: MutableList<Rentadora>): Double {
    var preuTotal = 0.0
    for (rentadora in rentadores) {
        preuTotal += rentadora.veurePreuBase()
    }
    return preuTotal
}

/**
 * Funció que retorna el preu total de totes les rentadores amb el seu plus de carrega aplicat
 * @author mohamedkoujil
 * @since 4/02/2024
 * @param rentadores
 * @return preu total de totes les rentadores
 */
fun preuTotalRentadores(rentadores: MutableList<Rentadora>): Double {
    var preuTotal = 0.0
    for (rentadora in rentadores) {
        preuTotal += rentadora.preuFinal()
    }
    return preuTotal
}

/**
 * Funció que retorna el preu base total de totes les televisors amb el seu plus de mida aplicat
 * @author mohamedkoujil
 * @since 4/02/2024
 * @param televisions
 * @return preu base total de totes les televisors
 */
fun preuTotalBaseTelevisions(televisions: MutableList<Televisio>): Double {
    var preuTotal = 0.0
    for (televisio in televisions) {
        preuTotal += televisio.veurePreuBase()
    }
    return preuTotal
}

/**
 * Funció que retorna el preu total de totes les televisors amb el seu plus de mida aplicat
 * @author mohamedkoujil
 * @since 4/02/2024
 * @param televisions
 * @return preu total de totes les televisors
 */
fun preuTotalTelevisions(televisions: MutableList<Televisio>): Double {
    var preuTotal = 0.0
    for (televisio in televisions) {
        preuTotal += televisio.preuFinal()
    }
    return preuTotal
}

/**
 * Funció que retorna el preu base total de tots els electrodomèstics que no siguin rentadores ni televisors
 * @author mohamedkoujil
 * @since 4/02/2024
 * @param electrodomestics
 * @return preu base total de tots els electrodomèstics que no siguin rentadores ni televisors
 */
fun preuTotalBaseElectrodomestics(electrodomestics: Array<Electrodomestic>): Double {
    var preuTotal = 0.0
    for (electrodomestic in electrodomestics) {
        // Ens assegurem que no sigui ni rentadora ni televisió
        if (electrodomestic !is Rentadora && electrodomestic !is Televisio) preuTotal += electrodomestic.veurePreuBase()
    }
    return preuTotal
}

/**
 * Funció que retorna el preu total de tots els electrodomèstics que no siguin rentadores ni televisors
 * @author mohamedkoujil
 * @since 4/02/2024
 * @param electrodomestics
 * @return preu total de tots els electrodomèstics que no siguin rentadores ni televisors
 */
fun preuTotalElectrodomestics(electrodomestics: Array<Electrodomestic>): Double {
    var preuTotal = 0.0
    for (electrodomestic in electrodomestics) {
        // Ens assegurem que no sigui ni rentadora ni televisió
        if (electrodomestic !is Rentadora && electrodomestic !is Televisio) preuTotal += electrodomestic.preuFinal()
    }
    return preuTotal
}

