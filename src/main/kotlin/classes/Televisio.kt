package classes

import classes.Electrodomestic

class Televisio: Electrodomestic {
    private var mida: Int = 28

    constructor(preuBase: Double, mida: Int) : super(preuBase){
        this.mida = mida
    }

    constructor(preuBase: Double, color: String, consum: Char, pes: Int, mida: Int) : super(preuBase, color, consum, pes) {
        this.mida = mida
    }

    /**
     * Funció que comprova la mida de la televisió i retorna el seu plus
     * @author mohamedkoujil
     * @since 4/02/2024
     * @param mida
     * @return plus de la mida
     */
    private fun calcularPlusMida(mida: Int): Double {
        return when {
            mida in 29..32 -> 50.0
            mida in 33..42 -> 100.0
            mida in 43..50 -> 150.0
            mida > 51 -> 200.0
            else -> 0.0
        }
    }

    /**
     * Funció que retorna el preu final de la televisió amb el seu plus de mida aplicat
     * @author mohamedkoujil
     * @since 4/02/2024
     * @return preu final
     */
    override fun preuFinal(): Double {
        return this.preuBase + calcularPlusMida(mida)
    }

    /**
     * Funció que imprimeix les dades de la televisió
     * @return preu base
     */
    override fun toString(): String {
        return  "    - PreuBase: $preuBase€\n" +
                "    - Mida: ${mida}\"\n" +
                "    - Preu final: ${preuFinal()}\n"
    }
}