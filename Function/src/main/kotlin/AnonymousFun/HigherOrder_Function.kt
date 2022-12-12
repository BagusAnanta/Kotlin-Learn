package AnonymousFun

fun main(){
    // TODO: Higher Order Function -> fungsi yang menggunakan fungsi lain sebagai parameter (jadi fungsi didalam parameternya kita pake fungsi sebagai parameternya)
    // (Parameter/jenis parameter) -> Tipe Kembalian = {Deklarasi parameter -> isi Kembalian }
    // TODO: Contoh untuk 1 parameter
    // TODO: Deklarasi jenis param dan jenis return untuk anonymous function
    val sum : (Int) -> Int = {a -> a + a}
    val multy : (Int,Int) -> Int = {a,b -> a - b}
    val sumanonym = {Val : Int -> Val + Val}

    val userdata : (String,String) -> (Unit) = {nama,usia -> println("Hi nama saya : $nama , dan umur saya : $usia") }

    // TODO: Jadi Anonymous function diatas dipakai untuk sebagai parameter fungsi lain
    // TODO: Alasan kenapa bisa dijadikan parameter karena variabel sum memiliki tipe deklarasi yang sudah pasti

    // TODO: Kita bisa masukkin dia kedalam function
    fun printdata(value : Int, sum: (Int) -> Int) {
        val result = sum(value)
        println(result)
    }

    fun printcount(value : Int, count: (Int) -> Int) {
        val result = count(value)
        println(result)
    }

    printdata(10,sumanonym)
    printdata(20,sum)
    printdata(30){value -> value + value}
    printcount(10,sum)


}
