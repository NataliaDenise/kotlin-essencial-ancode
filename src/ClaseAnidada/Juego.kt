package ClaseAnidada

class Juego {
    var puntuacion = 0

    inner class Marcador() {
        fun incrementar(puntos: Int) {
            puntuacion = puntuacion + puntos
        }
        fun decrementar(puntos: Int) {
        }
    }
}