package Game
import Narrator.Narrator
//Clase heroe
class Game: Narrator{
    var isSpanish: Boolean = true
    //Funcion encargada de narrar el juego
    override fun narrate(eventType: String): String {
        if(isSpanish) {
            if(eventType == "welcome"){
                return("¡Bienvenidos a la eleccion de heroes!")
            }
            else if(eventType=="start"){
                return ("¡Que inicie el juego!")
            }
            else if (eventType=="killR") {
                return ("¡Radiant a matado a un enemigo!")
            }
            else if (eventType=="killD") {
                return ("¡Dire a matado a un enemigo!")
            }
            else if (eventType=="killsR") {
                return ("¡Radiant a matado a varios enemigos!")
            }
            else if (eventType=="killsD") {
                return ("¡Dire a matado a varios enemigos!")
            }
            else if (eventType=="5killR") {
                return ("¡PENTAKILL de Radiant!")
            }
            else if (eventType=="5killD") {
                return ("¡PENTAKILL de Dire!")
            }
            else if (eventType=="turretR") {
                return ("¡Radiant a matado una torreta!")
            }
            else if (eventType=="turretD") {
                return ("¡Dire a matado una torreta!")
            }
            else if (eventType=="winR") {
                return ("¡Radiant a ganado la partida!")
            }
            else if (eventType=="winD") {
                return ("¡Dire a ganado la partida!")
            }
        }

        else if (!isSpanish){
            if(eventType == "welcome"){
                return("¡Welcome to the hero election!")
            }
            else if(eventType=="start"){
                return ("¡Lets start the game!")
            }
            else if (eventType=="killR") {
                return ("¡Radiant has killed an enemy!")
            }
            else if (eventType=="killD") {
                return ("¡Dire has killed an enemy!")
            }
            else if (eventType=="killsR") {
                return ("¡Radiant has killed multiple enemies!")
            }
            else if (eventType=="killsD") {
                return ("¡Dire has killed multiple enemies!")
            }
            else if (eventType=="5killR") {
                return ("¡Radiant´s PENTAKILL!")
            }
            else if (eventType=="5killD") {
                return ("¡Dire´s PENTAKILL!")
            }
            else if (eventType=="turretR") {
                return ("¡Radiant destroyed a turret!")
            }
            else if (eventType=="turretD") {
                return ("¡Dire destroyed a turret!")
            }
            else if (eventType=="winR") {
                return ("¡Radiant has won the game!")
            }
            else if (eventType=="winD") {
                return ("¡Dire has won the game!")
            }
        }
        return("No hay evento para la seleccion echa")
    }

}