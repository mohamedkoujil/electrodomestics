package classes


class Televisio: Electrodomestic {
    private var mida: Double = 28.0

    constructor(preuBase: Double, mida: Double) : super(preuBase){
        this.mida = mida
    }

    constructor(preuBase: Double, color: String, consum: Char, pes: Int, mida: Double) : super(preuBase, color, consum, pes) {
        this.mida = mida
    }

    /**
     * Funció que comprova la mida de la televisió i retorna el seu plus
     * @author mohamedkoujil
     * @since 4/02/2024
     * @return plus de la mida
     */
    private fun calcularPlusMida(): Double {
        return when {
            mida in 29.0..32.0 -> 50.0
            mida in 33.0..42.0 -> 100.0
            mida in 43.0..50.0 -> 150.0
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
        return this.preuBase + calcularPlusMida()
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