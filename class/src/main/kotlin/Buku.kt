
// contoh Open class
// class tanpa "open" mempunyai default final dan fungsinya tidak bisa di overidding
// Keyword open dibuat supaya class kotlin dapat di extend ke kelas lain
// perbedaan java dan kotlin dari segi extend dan class
/*
TODO: di java, class nya bersifat public/tidak final, maka bisa diextend bebas ke kelas lain, beda halnya kotlin karena default class nya final, makannya harus di open biar bisa di override fungsinya
* */

open class Buku {
    // functionnya jika mau diovveride harus tambah keyword open, karena defaulnya pula final
    open fun namabuku(nama : String?,Judul : String?,Tahun_terbit : Int){
        println("""
            1. Nama penulis = $nama
            2. Judul Buku = $Judul
            3. Tahun terbit = $Tahun_terbit
        """.trimIndent())
    }
}

open class DataBukuMapel(override var Nama: String, override var Judul: String) : BukuPelajaran("Ucup","Cara belajar Matematika"){
    override fun namabuku(Tahun_terbit: Int) {
        println("""
            1. Nama penulis = ${this.Nama}
            2. Judul Buku = ${this.Judul}
            3. Tahun Terbit = $Tahun_terbit
        """.trimIndent())
    }
}