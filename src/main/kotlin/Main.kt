import controllers.*

fun main() {
    var electrodomestics = arrayElectrodemestics()
    var rentadores = filtreRentadores(electrodomestics)
    var televisions = filtreTelevisions(electrodomestics)

    imprimirElectrodomestics(electrodomestics)
    imprimirElectrodomestics(rentadores.toTypedArray())
    imprimirElectrodomestics(televisions.toTypedArray())

    imprimirPreus(electrodomestics, rentadores, televisions)

}