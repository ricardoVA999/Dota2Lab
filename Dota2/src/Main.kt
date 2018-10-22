import Game.Game
import Game.Hero
import Game.Team
import Game.Turret
import Game.Ancient
fun main(args: Array<String>){
    //Ricardo Antonio Valenzuela Avila   18762   POO
    //Inicializar los 20 heroes que estaran disponibles para la eleccion
    val chaosKnight=Hero("Chaos Knight", "Strenght")
    val io=Hero("Io", "Strenght")
    val tiny=Hero("Tiny", "Strenght")
    val sven=Hero("Sven", "Strenght")
    val abaddon=Hero("Abaddon", "Strenght")
    val axe=Hero("Axe", "Strenght")
    val beastMaster=Hero("BeastMaster", "Strenght")
    val meepo=Hero("meepo", "Agility")
    val luna=Hero("Luna", "Agility")
    val ursa=Hero("Ursa", "Agility")
    val razor=Hero("Razor", "Agility")
    val viper=Hero("Viper", "Agility")
    val mirana=Hero("Mirana", "Agility")
    val shadowFiend=Hero("Shadow Fiend", "Agility")
    val oracle=Hero("Oracle", "Intelligence")
    val lich=Hero("Lich", "Intelligence")
    val zeus=Hero("Zeus", "Intelligence")
    val puck=Hero("Puck", "Intelligence")
    val warlock=Hero("Warlock", "Intelligence")
    val lina=Hero("Lina", "Intelligence")
    //Lista de heroes para elegir
    val singleDraft: ArrayList<Hero> = arrayListOf(chaosKnight, io, tiny, sven, abaddon, axe, beastMaster, meepo, luna, ursa, razor, viper, mirana, shadowFiend, oracle, lich, zeus, puck, warlock, lina)
    //Variables importantes(contadores)
    var killD=0
    var killR=0
    var contador=0
    var contador2=1
    var direTurn=false
    var languageE=false
    //Creacion de los equipos Dire y Radiant
    val teammatesR = ArrayList<Hero>()
    val teammatesD = ArrayList<Hero>()
    val turretR1 = Turret(false)
    val turretR2 = Turret(false)
    val turretR3 = Turret(false)
    val turretR4 = Turret(false)
    val turretR5 = Turret(false)
    val turretR6 = Turret(false)
    val turretsR = ArrayList<Turret>()
    turretsR.add(0,turretR1)
    turretsR.add(1,turretR2)
    turretsR.add(2,turretR3)
    turretsR.add(3,turretR4)
    turretsR.add(4,turretR5)
    turretsR.add(5,turretR6)
    val ancientR = Ancient(false)

    val turretD1 = Turret(false)
    val turretD2 = Turret(false)
    val turretD3 = Turret(false)
    val turretD4 = Turret(false)
    val turretD5 = Turret(false)
    val turretD6 = Turret(false)
    val turretsD = ArrayList<Turret>()
    turretsD.add(0,turretD1)
    turretsD.add(1,turretD2)
    turretsD.add(2,turretD3)
    turretsD.add(3,turretD4)
    turretsD.add(4,turretD5)
    turretsD.add(5,turretD6)
    val ancientD = Ancient(false)
    //Inicializar los equipos
    val radiant = Team(teammatesR, turretsR, ancientR)
    val dire = Team(teammatesD, turretsD, ancientD)

    //Inicializar el juego
    val myGame = Game<Unit>()

    //Funcion para anunciar los eventos de torres
    fun killsT(){
        println("Fue Radiant(Si/No):")
        val option = readLine()
        if (option=="Si"||option=="si"||option=="SI"){
            dire.turrets[0].Dead=true
            dire.turrets.remove(dire.turrets[0])
            println(myGame.narrate("turretR",languageE))
        }
        else if(option=="No"||option=="no"||option=="NO"){
            radiant.turrets[0].Dead=true
            radiant.turrets.remove(dire.turrets[0])
            println(myGame.narrate("turretD",languageE))
        }
        else{
            println("Esa opcion no existe")
        }
    }

    //Funcion para anunciar los eventos de muertes y llevar la cantidad de muertes
    fun killsE(){
        println("Fue Radiant(Si/No):")
        val option = readLine()
        if (option=="Si"||option=="si"||option=="SI"){
            println("Cuantas muertes ocurrieron:")
            val killNo = readLine().toString().toInt()
            if(killNo==1){
                println(myGame.narrate("killR",languageE))
                killR=killR+killNo
                println("Radiant tiene "+killR+" kills y Dire tiene "+killD+" kills.")
            }else if(1<killNo && killNo<5){
                println(myGame.narrate("killsR",languageE))
                killR=killR+killNo
                println("Radiant tiene "+killR+" kills y Dire tiene "+killD+" kills.")
            }else if(killNo==5){
                println(myGame.narrate("killR5",languageE))
                killR=killR+killNo
                println("Radiant tiene "+killR+" kills y Dire tiene "+killD+" kills.")
            }else{
                println("No existen esa cantidad de enemigos")
            }
        }else if(option=="No"||option=="no"||option=="NO"){
            println("Cuantas muertes ocurrieron:")
            val killNo = readLine().toString().toInt()
            if(killNo==1){
                println(myGame.narrate("killD",languageE))
                killD=killD+killNo
                println("Radiant tiene "+killR+" kills y Dire tiene "+killD+" kills.")
            }else if(1<killNo && killNo<5){
                println(myGame.narrate("killsD",languageE))
                killD=killD+killNo
                println("Radiant tiene "+killR+" kills y Dire tiene "+killD+" kills.")
            }else if(killNo==5){
                println(myGame.narrate("killD5",languageE))
                killD=killD+killNo
                println("Radiant tiene "+killR+" kills y Dire tiene "+killD+" kills.")
            }else{
                println("No existen esa cantidad de enemigos")
            }
        }else{
            println("Esa opcion no existe")
        }
    }

    //Seleccionar el idioma para su anunciador
    println("""
        Que idioma desea para su anunciador:
            1. Español
            2. Ingles
    """.trimIndent())

    //Configurar el idioma del juego
    val idioma = readLine().toString().toInt()
    if(idioma==1){
        languageE=true
    }else if (idioma==2){
        languageE=false
    }else{
        println("Esa opcion no existe")
    }

    //Comienzo de la narracion del juego(Eleccion de campeones)
    println("SINGLE DRAFT")
    println(myGame.narrate("welcome",languageE))

    //Elegir los 10 campeones
    while(contador!=10){
        if(!direTurn){
            println("""
                Seleccion de heroes de Radiant
                ------------------------------
            """.trimIndent())
            for(heroe in singleDraft){
                println(contador2.toString()+"."+" "+ heroe)
                contador2++
            }
            println("Seleccione su heroe: ")
            val election = readLine().toString().toInt()
            radiant.teammates.add(singleDraft[election-1])
            singleDraft.remove(singleDraft[election-1])
            direTurn=true
            contador++
            contador2=1
            println(radiant.teammates)
        }
        else{
            println("""
                Seleccion de heroes de Dire
                ------------------------------
            """.trimIndent())
            for(heroe in singleDraft){
                println(contador2.toString()+"."+" "+ heroe)
                contador2++
            }
            println("Seleccione su heroe: ")
            val election = readLine().toString().toInt()
            dire.teammates.add(singleDraft[election-1])
            singleDraft.remove(singleDraft[election-1])
            direTurn=false
            contador++
            contador2=1
            println(dire.teammates)
        }
    }

    //Anunciar el inicio del juego
    println(myGame.narrate("start",languageE))

    //Mantener el while mientras que los 2 ancient esten vivos
    while (!dire.ancient.Dead && !radiant.ancient.Dead){
        //Mantener este menu si la cantidad de torretas vivas no es 0
        if(dire.turrets.size!=0 && radiant.turrets.size!=0){
            println("""
                Menu:
                1. Ocurrierion muertes
                2. Murio una torre
            """.trimIndent())
            val evento = readLine().toString().toInt()
            //Narracion de Kills
            if (evento==1){
                killsE()
            }
            //Naraccion de torretas destruidas
            else if (evento==2){
                killsT()
            }
            else{
                println("Esa opcion no existe")
            }
        }
        //Nuevo menu si un equipo ya no tiene torretas
        else if(dire.turrets.size==0 || radiant.turrets.size==0){
            println("""
                Menu:
                1. Ocurrierion muertes
                2. Matan torre
                3. Matan ancient
            """.trimIndent())
            val evento = readLine().toString().toInt()
            //Narracion de kills
            if (evento==1){
                killsE()
            }
            //Narracion de torretas destruidas
            else if (evento==2){
                killsT()
            }
            //Narracion de fin de juego
            else if(evento==3){
                println("Fue Radiant(Si/No):")
                val option = readLine()
                if (option=="Si" && dire.turrets.size==0){
                    dire.ancient.Dead=true
                    println(myGame.narrate("winR",languageE))
                    println("El marcador final de kills fue:")
                    println("Radiant: "+killR+" Dire: "+killD)
                }
                else if(option=="No" && radiant.turrets.size==0){
                    radiant.ancient.Dead=true
                    println(myGame.narrate("winD",languageE))
                    println("El marcador final de kills fue:")
                    println("Radiant: "+killR+" Dire: "+killD)
                }
                else{
                    println("Aun no se puede realizar esta opcion")
                }
            }
            else{
                println("Esa opcion no existe")
            }
        }
    }
}