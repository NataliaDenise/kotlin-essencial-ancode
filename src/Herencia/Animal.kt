package Herencia

open class Animal(val edad: Int, val tipo: TipoDeAnimal) {
    init {
        println("Inicializacion de animal")
    }
    fun dormir() {
        println("Estoy durmiendo")
    }
    open fun comer() {
        println("Estoy comiendo")
    }

}
class Gato(edad: Int): Animal(5, TipoDeAnimal.VERTEBRADO) {
    init {
        println("Inicializacion de gato")
    }
    fun maullar() {
        println("miau")
    }
    override fun comer() {
        println("Estoy comiendo sardinas")
    }
}
class Perro(edad: Int): Animal(7, TipoDeAnimal.VERTEBRADO) {
    fun ladrar() {
        println("Guau")
    }
}
class Ave(edad: Int): Animal(2, TipoDeAnimal.VERTEBRADO) {
    fun volar() {
        println("ajj")
    }
}