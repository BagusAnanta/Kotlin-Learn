fun main(){
    // map
    // sama seperti sebelumnya, akan tetapi map menggunakan key:value

    val nama_siswa = mapOf<Double,String?>(12.5 to "Bagus",12.4 to "Fawwaz",12.6 to "Shella",12.6 to "Radit",12.5 to "Rakha",12.5 to "Nabila")
    // Format = Key(Double) to Value(String?)
    //print jumlah keys
    println("Jumlah Kelas/key kelas : ${nama_siswa.keys}")// jadi kalo key nya double dia bakal dihitung 1 (Kayak set tadi)
    println("Nama : ${nama_siswa.values}") // bakal print nama (Menariknya, yang di print hanya sekali jika terjadi duplikasi (duplikasi key nya)

    // TODO: Map bisa kita jadikan Mutable (toMutableMap()) dan menggunakan fungsi put() atau Immutable, namun perlu disarankan gunakan Map dalam keadaan immutable sebisa mungkin

}