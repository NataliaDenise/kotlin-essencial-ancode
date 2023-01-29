package Herencia

fun main() {
    val miPerro = Perro(7)
    miPerro.dormir()
    miPerro.ladrar()

    val miGato = Gato(8)
    println("miGato es un animal de tipo ${miGato.tipo} que tiene ${miGato.edad} años")

    miPerro.comer()
    miGato.comer()

}
