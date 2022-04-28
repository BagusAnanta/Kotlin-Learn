open class BukuPelajaran(open var Nama : String, open var Judul : String) {

    open fun namabuku(Tahun_terbit : Int){
        println("""
            1. Nama penulis = ${this.Nama}
            2. Judul Buku = ${this.Judul}
            3. Tahun Terbit = $Tahun_terbit
        """.trimIndent())
    }
}