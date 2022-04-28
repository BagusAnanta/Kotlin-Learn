package constructor

// default properties in constructor
open class Minuman(var Nama_minuman : String = "Es jeruk", var Bahan : String = "Jeruk") {


    init {
        println("""
            1. Nama Minuman = $Nama_minuman
            2. Bahan pembuatan = $Bahan
        """.trimIndent())
    }

    constructor(Nama_minuman: String) : this(Nama_minuman, Bahan = ""){
        println("""
            1. Nama Minuman = $Nama_minuman
            2. Bahan = ${this.Bahan}
        """.trimIndent())
    }
}

class Minuman_kaleng : Minuman{

    constructor(Nama_minuman: String) : super(Nama_minuman){
        println("1. Nama Minuman = $Nama_minuman ")
    }

    constructor(Nama_minuman: String,Bahan: String) : super(Nama_minuman,Bahan){
        println("""
            1. Nama Minuman = $Nama_minuman
            2. Bahan = $Bahan
        """.trimIndent())
    }
}
