package paquete1

import paquete2.claseC

class claseA {
    val propiedadx = 25

    fun miFuncion() {
        val miObjetoB = claseB()
        miObjetoB.miFuncion()
        miObjetoB.propiedadx
        val miObjetoC = claseC()
        miObjetoC.miFuncion()
        miObjetoC.propiedadx
    }
}