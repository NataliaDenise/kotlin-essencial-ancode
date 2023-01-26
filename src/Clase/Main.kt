package Clase

fun main() {
    val miRectangulo = Rectangulo()
    println("mi rectangulo tiene un ancho de ${miRectangulo.ancho} y un alto de ${miRectangulo.alto}")
    miRectangulo.ancho = 25.3
    miRectangulo.alto = 10.4
    println("mi rectangulo tiene un ancho de ${miRectangulo.ancho} y un alto de ${miRectangulo.alto}")

    val area = miRectangulo.obtenerArea()
    println("El area de miRectangulo es $area")
}