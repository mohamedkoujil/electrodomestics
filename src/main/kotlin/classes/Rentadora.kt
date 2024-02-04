package classes

class Rentadora: Electrodomestic {
    private var carrega: Double = 5.0

    constructor(preuBase: Double, carrega: Double) : super(preuBase) {
        this.carrega = carrega
    }

    constructor(preuBase: Double, color: String, consum: Char, pes: Int, carrega: Double) : super(preuBase, color, consum, pes) {
        this.carrega = carrega
    }

    /**
     * Funció que comprova la carrega de la rentadora i retorna el seu plus
     * @author mohamedkoujil
     * @since 4/02/2024
     * @return plus de la carrega
     */
    private fun calcularPlusCarrega(): Double {
        return when (carrega) {
            in 6.0..7.0 -> 55.0
            8.0 -> 70.0
            9.0 -> 85.0
            10.0 -> 100.0
            else -> 0.0
        }
    }

    /**
     * Funció que retorna el preu final de la rentadora amb el seu plus de carrega aplicat
     * @author mohamedkoujil
     * @since 4/02/2024
     * @return preu final
     */
    override fun preuFinal(): Double {
        return this.preuBase + calcularPlusCarrega()
    }

    /**
     * Funció que imprimeix les dades de la rentadora
     * @return preu base
     */
    override fun toString(): String {
        return  "    - PreuBase: $preuBase€\n" +
                "    - Carrega: ${carrega}kg\n" +
                "    - Preu final: ${preuFinal()}€\n"
    }

}