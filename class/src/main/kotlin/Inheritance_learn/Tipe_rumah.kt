package Inheritance_learn

// Anggapanlah ini super dari construktor Rumah
class Tipe_rumah(Luas_tanah : Int,Jumlah_kamar_tidur : Int,Jumlah_kamar_mandi:Int,Jumlah_garasi:Int) : Rumah(Luas_tanah, Jumlah_kamar_tidur, Jumlah_kamar_mandi, Jumlah_garasi) {

    // Ingat!!! Overide itu fungsi yang diturunkan dengan nama yang sama, dan parameter yang sama
    // Overloading nama fungsi sama, parameter harus berbeda
    // Overriding propertie/ overriding variabel

    override var No_rumah: Int = 12
    override var Tipe_rumah_no: Int = super.Tipe_rumah_no // ini akan mengakses isi propeties/variabel dari class Rumah


    override fun nama_rumah(Nama: String) {
        println("""
            1. Nama Rumah : $Nama
            2. Luas Rumah : ${this.Luas_tanah}
            3. Jumlah kamar tidur : ${this.Jumlah_kamar_tidur}
            4. Jumlah kamar mandi : ${this.Jumlah_kamar_mandi}
            5. Jumlah Garasi      : ${this.Jumlah_garasi}
        """.trimIndent())
    }

    override fun jenis_material(Jenis_batu: String, Jenis_kerangka: String, Jenis_lantai: String) {
        println("""
            1. Jenis batu : $Jenis_batu
            2. Jenis Kerangka : $Jenis_kerangka
            3. Jenis Lantai   : $Jenis_lantai
        """.trimIndent())
    }
}