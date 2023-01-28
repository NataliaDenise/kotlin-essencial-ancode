package ClassEnum

fun main() {
    val colorSalmon = Color.SALMON.hex
    println(DiasDeLaSemana.LUNES.name)
    println(DiasDeLaSemana.LUNES.ordinal)
    for (dia in DiasDeLaSemana.values()) {
        println(dia.name)
    }
println(DiasDeLaSemana.valueOf("LUNES"))
println(DiasDeLaSemana.LUNES < DiasDeLaSemana.MARTES)
}