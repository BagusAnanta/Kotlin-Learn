package nested_class

fun main(){
    // cara panggil class jus
    val makanan_minuman = Makanan.Jus("Jeruk") // contoh cara panggil nested class, kita perlu akses outerclass,lalu akses inner classnya
    println(makanan_minuman.pembuatan()) // ini jika mau akses function pada class jus

    // kalo mau akses class makanannya aja, cukup panggil class Makanan
    val makanan = Makanan("Rendang","Padang")
    println(makanan.show_makanan()) // ini jika mau akses function pada class makanan
}