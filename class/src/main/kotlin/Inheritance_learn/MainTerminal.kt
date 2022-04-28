package Inheritance_learn

fun main(){

    // contoh Inheritance
    val tiperumah = Tipe_rumah(12,3,2,1)
    tiperumah.nama_rumah("Cecilion")
    tiperumah.jenis_material("Batu bata","Baja Ringan","Keramik porselin")
    println("Nomor Rumah : ${tiperumah.No_rumah}")
    println("Tipe Rumah  : ${tiperumah.Tipe_rumah_no}\n") // hasilnya 36 (karena diambil dari class Rumah)

    val rumah = Rumah(14,4,3,2)
    rumah.nama_rumah("Lylia")
    rumah.jenis_material("Batu ringan","Baja ringan","Porselin granit")
}