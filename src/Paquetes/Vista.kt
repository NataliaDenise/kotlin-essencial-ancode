package com.mparrastia.vista
import com.mparrastia.control.pbtenerFechaDeUltimaActualizacion

class Vista(val boton: BotonCuadrado) {
    fun dibujar() {
        pbtenerFechaDeUltimaActualizacion()
    }
}