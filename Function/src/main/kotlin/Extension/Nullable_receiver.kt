package Extension



fun main(){

    // cara memanggil nullable receiver extension
    val value : Int? = null
    println(value?.slice) // Harusnya outputnya == 0 akan tetapi nilainya null dan selalu null
}

open class Nullable_receiver {
    // TODO: Kita bisa mendeklarasikan extension dengan nullable receiver
    val Int?.slice : Int
        get() = this?.div(2) ?: 0 // if val not null, out 2, if val null out 0



}

