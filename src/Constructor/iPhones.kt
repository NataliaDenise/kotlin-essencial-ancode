package Constructor

class iPhones(var Stock: Int, var Ventas: Int, var Precio: Double) {
    constructor(iPhones:iPhones): this( iPhones.Stock, iPhones.Ventas, iPhones.Precio )
    init {
        if(Ventas == 0 || Precio <= 0) {
            throw IllegalArgumentException("No hubo ventas")
        }
    }
    fun ganancia() = Ventas * Precio
}