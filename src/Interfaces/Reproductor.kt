package Interfaces

interface Reproductor {
    fun play(Cancion: String) {
        println("Reproduciendo cancion $Cancion")
    }
    fun stop()
    fun pause()

}