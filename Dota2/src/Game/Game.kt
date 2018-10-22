package Game
import Narrator.Narrator
//Clase heroe
class Game: Narrator{
    fun welcome(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Welcome to Dota 2, and the hero election!"
        }else{
            return "¡Bienvenidos a dota 2, y la eleccion de campeones!"
        }
    }
    fun start(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Lets start the game!"
        }else{
            return "¡Que inicie el juego!"
        }
    }
    fun killR(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Radiant has killed an enemy!"
        }else{
            return "¡Radiant a matado a un enemigo!"
        }
    }
    fun killD(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Dire has killed an enemy!"
        }else{
            return "¡Dire a matado a un enemigo!"
        }
    }
    fun killsR(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Radiant has killed multiple enemies!"
        }else{
            return "¡Radiant a matado a varios enemigos!"
        }
    }
    fun killsD(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Dire has killed multiple enemies!"
        }else{
            return "¡Dire a matado a varios enemigos!"
        }
    }
    fun killR5(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Radiant´s PENTAKILL!"
        }else{
            return "¡PENTAKILL de Radiant!"
        }
    }
    fun killD5(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Dire´s PENTAKILL!"
        }else{
            return "¡PENTAKILL de Dire!"
        }
    }
    fun turretR(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Radiant destroyed a turret!"
        }else{
            return "¡Radiant a matado una torreta!"
        }
    }
    fun turretD(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Dire destroyed a turret!"
        }else{
            return "¡Dire a matado una torreta!"
        }
    }
    fun winR(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Radiant has won the game!!"
        }else{
            return "¡Radiant a ganado la partida!"
        }
    }
    fun winD(isSpanish: Boolean): String{
        if(!isSpanish){
            return "¡Dire has won the game!"
        }else{
            return "¡Dire a ganado la partida!"
        }
    }

    override fun narrate(eventType: String): String{
        if(eventType.equals("welcome")){
            return welcome(true or false)
        }
        else if(eventType.equals("start")){
            return start(true or false)
        }
        else if(eventType.equals("killR")){
            return killR(true or false)
        }
        else if(eventType.equals("killD")){
            return killD(true or false)
        }
        else if(eventType.equals("killsR")){
            return killsR(true or false)
        }
        else if(eventType.equals("killsD")){
            return killsD(true or false)
        }
        else if(eventType.equals("killD5")){
            return killD5(true or false)
        }
        else if(eventType.equals("killR5")){
            return killR5(true or false)
        }
        else if(eventType.equals("turretR")){
            return turretR(true or false)
        }
        else if(eventType.equals("turretD")){
            return turretD(true or false)
        }
        else if(eventType.equals("winR")){
            return winR(true or false)
        }
        else if(eventType.equals("winD")){
            return winD(true or false)
        }
        return ""
    }
}