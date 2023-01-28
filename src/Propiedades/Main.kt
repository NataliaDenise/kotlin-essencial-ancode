package Propiedades

fun main() {
    val miRectangulo = Rectangulo(2.1, 3.2)
    miRectangulo.alto = 22.9
    val area = miRectangulo.alto * miRectangulo.ancho
    println(miRectangulo.esCuadrado)
}