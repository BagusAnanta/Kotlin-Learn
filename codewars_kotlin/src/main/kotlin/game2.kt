
fun main(){
    // input bil bula positif dan menampilkan hasil bagi dan sisa hasil bagi dengan angka 1-10 dengan menggunakan whileloop

    println("Cek hasil sisa bagi")
    print("Masukkan Angka : ")
    val angka = readLine()?.toInt()
    var count = 0

    while (count != 10){
        count++
        println("$angka : $count = ${angka?.div(count)} Sisa ${angka?.rem(count)} ")
    }
}