package MemberReferences

fun main(){
    // TODO: Member Reference ini membuat fungsi menjadi instansiasi yang berupa fungsi
    // TODO: Biasanya kita buat kayak gini
    val sum : (Int,Int) -> Int = {Value1,Value2 -> Value1+Value2}

    // TODO : Jadi kita bisa buat kayak gini
    fun count(ValueA : Int,ValueB : Int) : Int = ValueA + ValueB
    val countdata = count(4,3)
    val countsum : (Int,Int) -> Int = ::count
    println(countdata)
    println(countsum)
    /*
    * TODO:
    *  Perlu diketahui ada beberapa hal yang perlu diperhatikan untuk member reference
    *  1. Jika berupa fungsi harus ada nilai kembalian dan nilai kembaliannya harus terhubung dengan parameter ! (Ex3)
    *  2. Harus match dengan tipe fungsinya baik paramenter dan nilai returnnya */

    // TODO: Reference ditandai dengan titik dua (::) dan dibagi jadi dua ada function reference dan property reference

    // TODO: Jadi kita bisa menulis kode dengan mekanisme reflection

    val number = 1..10
    val evennumber = number.filter(::isEvenNum)
    // same like :
    val evenmumdata = number.filter { it % 2 == 0 }
    println(evennumber)

    // TODO: Untuk memanggil extension function dilakukan dengan cara memanggil nama class :: dan fungsinya
    val evenmunextension = number.filter(Int::isEvenNumber)
    println(evenmunextension)

    // TODO: Property Reference
    println(::message.set("Hello Kotlin"))
    println(::message.get()) // TODO: "Kotlin" word if we call get()


}

var message = "Kotlin"

// TODO: Misal kita punya fungsi
// TODO: Ex3
fun isEvenNum(Numbers : Int) = Numbers % 2 == 0

// TODO: Atau bisa menggunakan Extension function sebagai member reference dengan menambahkna class didepan titik duannya
fun Int.isEvenNumber() = this % 2 == 0

