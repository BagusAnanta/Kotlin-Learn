import java.util.*

fun main(){
    // VarArgs
    println(hitung(1,2,3,4,5,6,7,8,9,10))
    nama_siswa("Bagus","Nabila","Amel","Laras","Syafiya","Rakha","Kholik","Veroli","Dimas")

    // Named Argument
    data(Nama = "Bagus", Umur = 18) // sama kayak deklarasi parameter dibawah, bedanya cuma pake nama
    data("Rakha",18) // sama aja

    // Option Parameter/ option Argument (Setiap mendeklarasikan Optional Parameter harus pake Named Argument supaya ngak ambigu)

    // kalo cuma data siswa aja
    data_siswa()

    // kalo cuma manggil nama,tanggal masuk,kelas (Default nilai Tanggal_keluar = 30)
    data_siswa("Windah Basudara",12, Kelas = "12.5")

    // Kalo cuma nama,tanggal keluar,Kelas
    data_siswa("Bocil Nakal", Tanggal_keluar = 20, Kelas = "10.6")


}

// single expression kotlin
fun calculate(x : Int,y : Int) : Int = x * y // kalo fungsinya pendek, pake single expression

fun sum(a : Int, b : Int) : Int {return a + b} // sama aja kayak gini


// Vararg (Variabel Argument) jadi fungsinya buat merubah parameter Int didalam fungsi menjadi Array (Membuat parameter menjadi Array)

fun hitung(vararg x : Int) : Int{ // misalnya kita mau buat parameternya Array, langsung aja kita pake VarArgs jadi kita ndak payah buat Array lagi
    // perlu diingat Varargs hanya bisa taro di ujung akhir ngak boleu di awal

    var jumlah = 1

    for(count in x){
        jumlah+= count
    }
    return jumlah
}

// Varargs
fun nama_siswa (vararg Nama : String){
    for(Namaorang in Nama){
       print(Namaorang + ",")
    }
}


// Named Argument (Dia ini manggil parameter pake nama parameternya)
fun data (Nama : String?,Umur : Int?){
    println("Nama Saya : $Nama")
    println("Umur Saya : $Umur")
}


// Optional Argument (Memangil hanya beberapa parameter/ tidak memangil seluruh parameter)
// optional Argument dapat digunakan apabila parameternya mempunyai nilai default (Default Value)
// untuk pakai optional Argument parameter fungsinya harus ada nilainya dulu
// untuk pakai optional Argument juga harus pakai Named Argument supaya kotlinnya ngak bingung (Liat di fungsi mainnya / fun main()
fun data_siswa(Nama : String = "Tidak Diketahui", Tanggal_masuk : Int = 1,Tanggal_keluar : Int = 30, Kelas : String = "12"){
    println("""
        - Nama siswa : $Nama
        - Tanggal Masuk : $Tanggal_masuk
        - Tanggal Keluar : $Tanggal_keluar
        - Kelas : $Kelas
    """.trimIndent())
}

