package ClaseAnidada

fun main() {
    val miJuego = Juego()
    val miMarcador = miJuego.Marcador()
    miMarcador.incrementar(20)
    miMarcador.decrementar(5)
    println("La puntuacion de miJuego es de ${miJuego.puntuacion}")
}