package singleton

open class Inputdatauser  {

    open fun Inputdatauser(Id : Int,Name : String,Status : Boolean){
        // for connect data to db
        // call singleton for connect to db
        Connectdatahelper.createdata()
    }
}