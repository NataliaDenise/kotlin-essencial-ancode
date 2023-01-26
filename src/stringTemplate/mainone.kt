package stringTemplate

fun main() {

        val price = 15.25
        val tax = 0.16

        val out = "La cantidad de $price despues de impuestos es: ${price*(1 + tax) }"
        println(out)

        val total = price.times(tax.plus(1))
        println(total.toFloat())

        fun main() {
                println("Introduce tu edad")
                val edad = readLine()
                println("Tienes $edad años")
        }
    }