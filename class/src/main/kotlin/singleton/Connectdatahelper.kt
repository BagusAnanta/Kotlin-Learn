package singleton

object Connectdatahelper { // singleton object have keyword "object"

    init {
        println("Singleton object has created!")
    }

    var connect = ConnectionDatabase()

    fun createdata(){
        connect.execdatabase("Https//dijhfys.jj","Bagus",123456)
    }
}