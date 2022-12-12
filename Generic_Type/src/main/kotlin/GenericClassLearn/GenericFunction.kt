package GenericClassLearn
import kotlin.collections.List

fun main(){

}

// TODO: Generic function di rumuskan kayak gini
// TODO: -> fun <Type> Argumentname(){}

// TODO: Generic function itu berfungsi untuk membuat fungsi yang nanti tipe datanya yang diharuskan berbeda beda

/** TODO:  Misal kalo kita punya fungsi extension Slice() */
fun <T> List<T>.Slice(indicate: Iterable<Int>) : List<T>{
    // Contohnya kayak gini lah yak
    val listfunction = listOf<T>()
    val slicefunction = listfunction.slice(indicate)
    return slicefunction
}

/** Atau kayak gini misal */
fun <Type> Listtokenizer(ListToken : List<Type>){
    val listtoken = ListToken.forEach { println("Tokenlist : $it") }
}