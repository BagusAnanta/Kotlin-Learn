package GenericClassLearn

fun main(){
    // TODO: Ini contoh sederhana variance
    val pempek = Pempek("Ikan Tenggiri")
    val miecelor  = MieCelor("Mie")
    // TODO: Ini contohnya, walaupun type class nya beda tapi kita bisa assigment/deklarasinya dari type class lain dengan catatan dia harus memiliki subtype/extend yang sama dengan abstract nya
    var makanan : Makanan = pempek
    makanan = miecelor

    // TODO: Coba kita masukkin kedalam list yang merupakan generic list
    val pempeklist = listOf(Pempek("Ikan tenggiri"),Pempek("Ikan Gabus"),MieCelor("Mie adon"))
    val miecelorlist = listOf(MieCelor("Mie kuning"),MieCelor("Mie adon"))
    var makananpalembanglist = pempeklist
    makananpalembanglist = miecelorlist
    var miepalembang = miecelorlist
}

// TODO: Variance -> subtipe nya sama tapi tipe argument / nama argument nya beda akan tetapi tetap berkaitan satu sama kain
// TODO: Contoh

abstract class Makanan(NamaDaerah : String){}
class Pempek(var Bahan_pembuatan : String) : Makanan("Palembang")
class MieCelor(var Bahan_pembuatan: String) : Makanan("Palembang")

// TODO: Variance dibagi jadi covariant dan contravariance

// TODO: Contoh covariant
// TODO: Kalo kita pakai kata kunci out maka kita cuma bisa produksi fungsi ini sebagai fungsi return type(Cuma bisa get data)
interface ArrayList<out E> : Collection<E>{
    operator fun get(index : Int) : E
}

// TODO: Contoh contravariant
// TODO: Kalo ini kita bisa mengonsumsi nilai dari tipe parameternya menjadi tipe argument didalam parameter fungsi
interface Comparable<in T>{
    operator fun compareTo(other : T) : Int
}
