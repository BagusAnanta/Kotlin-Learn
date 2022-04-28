
// TODO: Class ini diextend dari class buku
class Databuku : Buku() {

    override fun namabuku(nama: String?, Judul: String?, Tahun_terbit: Int) {
        println("""
            1. Nama penulis = $nama
            2. Judul Buku = $Judul
            3. Tahun terbit = $Tahun_terbit
        """.trimIndent())
    }
}
