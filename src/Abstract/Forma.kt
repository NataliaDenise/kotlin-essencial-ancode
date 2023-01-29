package Abstract

import kotlin.math.PI

abstract class Forma(var x: Int, var y: Int) {
    fun transladar(movimientoX: Int, movimientoY: Int) {
        x = x + movimientoX
        y = y + movimientoY
    }
    abstract fun obtenerArea(): Double
    abstract fun obtenerPerimetro(): Double
}
class Rectangulo(val ancho: Double, val alto: Double): Forma() {
    override fun obtenerArea()= ancho * alto
    override fun obtenerPerimetro()= 2 * ancho + 2 * alto

}

class Circulo(val radio: Double): Forma() {
    override fun obtenerArea() = PI * radio * radio
    override fun obtenerPerimetro() = 2 * PI * radio
}
