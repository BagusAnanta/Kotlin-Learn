package Inheritance_learn

// class type default == final
// untuk supaya class dan function bisa di inherit maka pakai keyword "open" di class dan functionnya dan properties/variabelnya
open class Rumah (var Luas_tanah : Int, var Jumlah_kamar_tidur : Int, var Jumlah_kamar_mandi : Int, var Jumlah_garasi : Int) {

    open var No_rumah : Int = 0; // properti/variabel ini bisa di ubah di class lain dengan cara overide
    open var Tipe_rumah_no : Int = 36

   open fun nama_rumah(Nama : String){
        println("""
            1. Nama Rumah : $Nama
            2. Luas tanah : ${this.Luas_tanah}
            3. Jumlah kamar tidur : ${this.Jumlah_kamar_tidur}
            4. Jumlah kamar mandi : ${this.Jumlah_kamar_mandi}
            5. Jumlah Garasi      : ${this.Jumlah_garasi}
        """.trimIndent())
    }

    open fun jenis_material(Jenis_batu : String,Jenis_kerangka : String,Jenis_lantai :String){
        println("""
            1. Jenis batu : $Jenis_batu
            2. Jenis Kerangka : $Jenis_kerangka
            3. Jenis Lantai   : $Jenis_lantai
        """.trimIndent())

    }

}