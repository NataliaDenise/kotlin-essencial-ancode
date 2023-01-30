package lambda

fun main() {
    val numeros = listOf(1,9,6,7,5,1,3)
    val nombres = listOf("Juan", "Ana", "Sara", "Alejandro", "Paula")
    val numerosMayores = numeros.filter { it > 5 }
    println(numerosMayores)
    val nombresConN = nombres.filter { it.contains('n') }
    println(nombresConN)
    println(nombres.map { it.toUpperCase() })
    println(nombres.none{it.startsWith('a')})
    println(nombres.count{it.contains('n') })
}