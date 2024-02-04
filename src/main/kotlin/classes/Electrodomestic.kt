package classes
open class Electrodomestic {

    protected var preuBase: Double
    private var color: String = "blanc"
    private var consum: Char = 'G'
    private var pes: Int = 5

    constructor(preuBase: Double, color: String, consum: Char, pes: Int) {
        this.preuBase = preuBase
        this.color = color
        this.consum = consum
        this.pes = pes
    }

    constructor(preuBase: Double) {
        this.preuBase = preuBase
    }

    /**
     * Funció que retorna el preu final de l'electrodomèstic
     * @author mohamedkoujil
     * @since 4/02/2024
     * @return preu final
     */
    open fun preuFinal(): Double {
        val plusConsum = comprovarConsum()
        val plusPes = comprovarPes(pes)
        return preuBase + plusConsum + plusPes
    }

    /**
     * Funció que comprova el consum de l'electrodomèstic i retorna el seu plus
     * @author mohamedkoujil
     * @since 4/02/2024
     * @return plus del consum
     */
    private fun comprovarConsum(): Double {
        return when (consum) {
            'A' -> 35.0
            'B' -> 30.0
            'C' -> 25.0
            'D' -> 20.0
            'E' -> 15.0
            'F' -> 10.0
            else -> 0.0
        }
    }

    /**
     * Funció que comprova el pes de l'electrodomèstic i retorna el seu plus
     * @author mohamedkoujil
     * @since 4/02/2024
     * @param pes
     * @return plus del pes
     */
    private fun comprovarPes(pes: Int): Double {
        return when {
            pes in 6..20 -> 20.0
            pes in 21..50 -> 50.0
            pes in 51..80 -> 80.0
            pes > 80 -> 100.0
            else -> 0.0
        }
    }

    /**
     * Funció que retorna el preu base de l'electrodomèstic
     * @author mohamedkoujil
     * @since 4/02/2024
     * @return preu base
     */
    fun veurePreuBase(): Double {
        return this.preuBase
    }

    /**
     * Funció que imprimeix les dades de l'electrodomèstic
     * @author mohamedkoujil
     * @since 4/02/2024
     * @return dades de l'electrodomèstic
     */
    override fun toString(): String {
        return "    - PreuBase: $preuBase€\n" +
                "    - Color: $color\n" +
                "    - Consum: $consum\n" +
                "    - Pes: ${pes}kg\n" +
                "    - Preu final: ${preuFinal()}€\n"
    }

}