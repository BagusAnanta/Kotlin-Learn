package GenericClassLearn

fun main(){
    // TODO: Langsung tanpa mendeklarasikan Type nya
    val CallGeneric = Longclass() // -> Jadi langsung ngak perlu lagi kita mendeklarasikan typenya karena manual sudah Long
    // println(CallGeneric.get(0))

    // TODO: Dengan mendeklarasikan Type nya
    val ArrayClassGeneric = Arrayclass<Long>() // -> Jadi kita mengharuskan mendeklarasikkan Type nya yaitu long
    // println(ArrayClassGeneric.get(0))

    val arrayfunction = Arrayfunction<Int>()
    val listdata = List<Int>(5){it + 1}
    println(arrayfunction.Arraylistcollection(listdata))

}

/** Struktur generic class*/
//TODO: class nameclass : Extend<T>

//TODO: Or

//TODO: class <T> nameclass : Extend<T>




//TODO : -> Jadi kita bisa lakukan kayak gini jadi secara langsung kita deklarasikan langsung didalam class nya
class Longclass : List<Long> {
    override fun get(index: Int): Long { // -> Jadi nanti user tidak perlu memasukan tipenya, karena sudah diimplement didalam class nya
      try{
          return this[index]
      } catch (E : StackOverflowError){
          println("Error at Stackoverflow")
      }
        return 0
    }
}

//TODO: -> Atau bahkan kita bisa menentukan tipenya nanti
class Arrayclass<Type> : List<Type>{
    override fun get(index: Int): Type { // -> Jadi nanti user memasukkan tipenya di luar class
        return this[index]
    }

}

class Arrayfunction<Type>{
    fun Arraylistcollection(list : kotlin.collections.List<Type>) : kotlin.collections.List<Type>{
        return list
    }
}

interface List<T>{
    // TODO: Kita buat sebuah fungsi yang akan mengembalikan nilai T
    operator fun get(index : Int) : T
}