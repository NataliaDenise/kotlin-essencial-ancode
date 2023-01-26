package funciones

import java.lang.IllegalArgumentException
import kotlin.math.ceil

fun main() {
    val area = calcularAreaRectangulo(0.5,3.5)
    println(area)
}

fun calcularNumeroDeBaldosas( anchoEstancia: Double, largoEstancia: Double, anchoBaldosa: Double, largoBaldosa: Double): Int {
    fun comprobarDimenciones(ancho: Double, largo: Double) {
        if (ancho <= 0 || largo <= 0 ) {
            throw IllegalArgumentException("No se puede realizar el calculo. Las dimenciones deben ser < 0 ")
        }
    }
    comprobarDimenciones(anchoBaldosa, largoEstancia)
    comprobarDimenciones(anchoEstancia, largoEstancia)
    val areaEstancia = calcularAreaRectangulo(anchoEstancia, largoEstancia)
    val areaBaldosa = calcularAreaRectangulo(anchoBaldosa, largoBaldosa)
    return ceil(areaEstancia / areaBaldosa).toInt()
}

fun calcularAreaRectangulo(ancho: Double, largo: Double): Double {
    return ancho * largo
}
