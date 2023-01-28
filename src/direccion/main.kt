package direccion

fun main() {
    val miDirection = Direction("Reconquista", 297,1888, "Florencio Varela")
    println(miDirection.toString())
    val miDirection2 = Direction("Azucena", 820,1881, "Claypole")
    println("¿Es miDireccion igual a miDireccion2? ${miDirection.equals(miDirection2)}")
    val miDirection3 = miDirection.copy(numero = 33)
    println(miDirection3.toString())
}