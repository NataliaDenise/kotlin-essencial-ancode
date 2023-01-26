package funciones

fun main() {
    print(calcularMedia( 7.1, 8.3, 5.9, 12.0))
}
fun calcularMedia( vararg valores: Double): Double {
    var media = 0.0
    for (valor in valores) {
        media = media + valor
    }
    media = media / valores.size
    return media
}