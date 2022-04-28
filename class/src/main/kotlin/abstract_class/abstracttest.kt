package abstract_class

fun main(){

    val datanama = mutableMapOf<Int,String>(1 to "Angela", 2 to "Josh", 3 to "Pairingson")
    val actiondefault = Actiondefault()
    actiondefault.setdatalistener(datanama)
    actiondefault.getdatalistener(datanama)
    actiondefault.deletedatalistener(datanama)
}
