package com.mparrastia.control

import Usuario
import com.mparrastia.datos.Carro
import com.mparrastia.vista.*
import java.time.LocalDateTime

class Controlador(val   usuario: Usuario, val carro: Carro, val vista: Vista) {
    val boton = BotonRedondo()

}

fun pbtenerFechaDeUltimaActualizacion(): LocalDateTime? {
    return LocalDateTime.now()
}