package paquete1
open class claseB {
    val propiedadx = 25
    fun miFuncion() {
        val miVariable = propiedadx * 2
    }
    fun miOtraFuncion() {
        miFuncion()
        funcionDePrimerNivel()
    }
}
private fun funcionDePrimerNivel() {
    val miObjeto = claseB()
    miObjeto.miOtraFuncion()
}
class ClaseD: claseB() {
    fun unaFuncion() {
        val unaVariable = propiedadx
        miFuncion()
    }
}