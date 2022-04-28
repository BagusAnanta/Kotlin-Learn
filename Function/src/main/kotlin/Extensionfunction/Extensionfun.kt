package Extensionfunction

// Extension fun adalah fungsi yang ditambahkan didalam suatu tipe data yang bukan milik kita kayak (String,Int,Boolean,etc) karena itu bukan kita yang buat dan bisa kita tambahkan function
// simpelnya, Extension berfungsi untuk menambahkan fungsi didalam tipedata/class
fun String.hello() : String = "Halo, saya $this" // outputnya pakai kata kunci this

// kita juga harusnya bisa buat fun baru didalam class/ library orang lain (Nanti hasilnya kita bisa menambahkan fungsi didalam library atau class orang lain
fun Mathclass.derivative(n : Int) : Unit{
    val minus_n = n-1
    val notation : String = "X"
    println("$n $notation ^ $minus_n")
}

fun Mathclass.factorial(n : Int) : Int{ // perlu diingat pula bahwa class yang di private tidak bisa ditambahkan fungsi (ex : Math class, karena private dia tidak bisa sembarangan ditambah
    var result = 1
    for(Element in n downTo 1){
        result = Element * result
    }
    return result
}



fun main(){
    val nama = "Bagus"
    println(nama.hello())


    val declare = Mathclass()
    val result1 = declare.pow(2.0,2.0)
    println(result1)
    val result2 = declare.derivative(4) // ini fungsi yang kita buat dari luar class Mathclass
    println(result2)
    val result3 = declare.factorial(3)  // ini fungsi yang kita buat dari luar class Mathclass
    println(result3)

}