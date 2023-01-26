package funciones

import java.time.LocalDateTime

fun main() {
    println("Comienza la ejecucion del programa")
    mostrarFecha()
    saludar("Juan")
    felicitarCumple("Pedro", 25 )
}

fun mostrarFecha() {
    val fechaLocal = LocalDateTime.now()
    println("La fecha actual es $fechaLocal")

}

fun saludar(nombre: String) {
    println("Hola $nombre")
}

fun felicitarCumple(nombre: String, edad: Int) {
    println("Felicidades. $nombre cumples $edad años")
}
