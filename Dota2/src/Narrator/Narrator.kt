package Narrator
//Interfaz narrador
interface Narrator{
    fun narrate(eventType: String, isSpanish:Boolean): String
}