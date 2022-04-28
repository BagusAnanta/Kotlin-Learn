package abstract_class

abstract class component {
    // for set data
    abstract fun setdatalistener(data : MutableMap<Int,String>)

    abstract fun getdatalistener(data : MutableMap<Int,String>)

    abstract fun deletedatalistener(data : MutableMap<Int,String>)

    abstract fun setlistlistener(datalist : List<Any>)

    abstract fun getdatalistlistener(datalist: List<Any>)

    abstract fun deletedatalistlistener(datalist : List<Any>)

}