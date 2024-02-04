import controllers.*

fun main() {
    val electrodomestics = arrayElectrodemestics()
    val rentadores = filtreRentadores(electrodomestics)
    val televisions = filtreTelevisions(electrodomestics)

    imprimirElectrodomestics(electrodomestics)
    imprimirElectrodomestics(rentadores.toTypedArray())
    imprimirElectrodomestics(televisions.toTypedArray())

    imprimirPreus(electrodomestics, rentadores, televisions)

}