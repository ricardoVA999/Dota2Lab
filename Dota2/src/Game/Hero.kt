package Game
//Clase heroe
data class Hero(val Name: String, val Type: String){
    override fun toString(): String {
        return """
            $Name
        """.trimIndent()
    }}