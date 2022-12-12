package KotlinStandardLibrary

import Extension.Mathclass
import Extension.combination

fun main() {
    // TODO: jadi terdapat beberapa fungsi yang kita pakai untuk scope functionnya dengan lambda receiver
    // TODO: Contoh function nya -> run,with,apply


    // TODO: run -> mereturn nilai berdasarkan expression yang berada di dalam blok lambda
    // TODO: Dia menggunakan this sebagai receiver untuk mengakses konteks dari objek
    // TODO: run ini termasuk extension function
    val text = "Hello"
    val result = text.run {
        val from = this
        // this.replace() fungsi ini diambil dari class string, makannya run termasuk lambda receiver karena bisa ngambil function dari objek yang dipanggil dan menggunakan keyword this
        val to = this.replace("Hello","Kotlin")
        // this return
        "replace text from $from to $to "
    }

    // TODO: Kita juga kayaknya bisa get dari class
    val mathclass = Mathclass()
    val operation = mathclass.run {
        val Val1 = 5
        val Val2 = 5
        val combinationoperation = this.combination(Val1,Val2)
        "Combination result is $combinationoperation"
    }

    // TODO: with -> fungsi with ini bukan extension akan tetapi hanya fungsi biasa
    // TODO: fungsi with disarankan untuk mengakses apa yang menjadi anggotanya tanpa harus menyediakan nilai kembalian

    val message = "Halo Bang :D"
    val resultdata = with(message){
        println("value is $this")
        println("With length ${this.length}")
    }

    // TODO: With juga kayaknya bisa untuk class
    val mathoperation = with(mathclass){
        // jadi kita bisa pake class juga
        println("combination result is ${this.combination(4,8)}")
    }

    // TODO: apply -> fungsi ini berguna buat get apa aja fungsi yang ada didalam suatu class
    val messagedata = StringBuilder().apply {
        // TODO: Jadi kita menggunakan konstruktor StringBuilder dan menggambil apa apa saja yang ada didalam class itu
        append("Hello")
        append("Kotlin")
    }
}