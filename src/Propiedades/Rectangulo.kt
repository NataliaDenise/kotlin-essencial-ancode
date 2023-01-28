package Propiedades

class Rectangulo(val ancho: Double, var alto: Double) {
    val esCuadrado
    get() = ancho == alto

    var grosor: Int = 1
    set(value) {
        if (value <= 0) {
            throw IllegalArgumentException("El valor del grosor debe ser positivo")
        }
        field = value
    }
    fun obtenerArea() = ancho * alto
}