package nested_class

// nested class sama kayak inner class, tapi bedanya nested class tidak bisa mengakses outer class nya baik itu functionya dan object dalam parameter konstruktornya

class Makanan(var Jenis_makanan : String,var daerah_asal : String) {

    fun show_makanan(){
        println("""
            1. Jenis Makanan: $Jenis_makanan
            2. Daerah Asal  : $daerah_asal
        """.trimIndent())
    }

    // kalo aku bisa bilang, ini class numpang dari outer class karena class ini ngak bisa ngapa ngapain dari outerclass nya/class nya sendiri-sendiri
    class Jus(var Jenis_buah : String){ // anggap ini class, karena minuman bukan termasuk makanan, jadi kita ngak bisa connect ke outerclass yang jenisnya makanan
        fun pembuatan() {
            println("Jus dibuat dari buah $Jenis_buah ")
        }
    }
}