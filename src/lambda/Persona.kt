package lambda
data class Persona(val persona: String, val edad: Int)
fun encontrarAlMayor(personas: List<Persona>): Persona {
    var mayorPersona: Persona = personas[0]
    for (persona in personas) {
        if (persona.edad > mayorPersona.edad) {
            mayorPersona = persona
        }
    }
    return mayorPersona
}
fun main() {
    val personas = listOf(Persona("luis", 25),
                        Persona("Marta", 32),
                        Persona("Juan",61),
                        Persona("Laura", 46),
                        Persona("Enrique", 12),
                        Persona("Sara", 26),
                        Persona("Maria", 18))
    val mayor = personas.maxBy {it.edad}
    println("La persona de mayor edad de la lista es $mayor")
}
