package abstract_class

open class Actiondefault : component() {

    override fun setdatalistener(data: MutableMap<Int, String>) {
        println("data is set : $data")
    }

    override fun getdatalistener(data: MutableMap<Int, String>) {
        for(E in data){  // E -> Element
            println(E)
        }
    }

    override fun deletedatalistener(data: MutableMap<Int, String>) {
        if(data.isEmpty()){
            setdatalistener(data)
        } else {
            data.clear()
            println("Data completely deleted")
        }
    }

    override fun setlistlistener(datalist: List<Any>) {
        println(datalist)
    }

    override fun getdatalistlistener(datalist: List<Any>) {
        for(E in datalist){ // Element
            println(E)
        }
    }

    override fun deletedatalistlistener(datalist: List<Any>) {
        if(datalist.isEmpty()){
            setlistlistener(datalist)
        } else {
          val dataclear = datalist.toMutableList()
            dataclear.clear()
        }
    }
}