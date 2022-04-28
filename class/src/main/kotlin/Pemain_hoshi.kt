
// class
class Pemain_hoshi (var Nama : String,var Nama_pemain : String,var Umur : Int,var Bagian : String){

    fun output_nama(){
        println("""
            1. Nama game = $Nama
            2. Nama pemain = $Nama_pemain
            3. Umur = $Umur
            4. Bagian = $Bagian
        """.trimIndent())
    }
}