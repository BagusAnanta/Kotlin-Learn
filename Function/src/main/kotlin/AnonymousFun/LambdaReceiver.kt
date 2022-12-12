package AnonymousFun

import Extension.Mathclass
import Extension.combination

fun main(){
    // TODO: Lambda with Receiver -> Sama kayak Extension function, akan tetapi menggunakan Lambda expression
    // TODO: Lambda with Receiver berguna apabila kita ingin menggunakan fungsi didalam lambda expression tanpa perlu mengulang-ulang
    // TODO: Lambda with Receiver menggunakan konsep DSL (Domain Specific Language) -> DSL adalah bahasa komputer yang dikhususkan untuk domain aplikasi tertentu
    //  memanggil fungsinya
    builderstring {
        append("Hallo ")
        append("From ")
        append("Lambda ")
    }

    Mathoperation {
        combination(4,5)
    }

}

fun builderstring(Action : StringBuilder.() -> Unit) : String{
    val stringbuild = StringBuilder() // kita panggil class StringBuilder
    stringbuild.Action() // Hasil deklarasi kita masukkan kedalam Aaction
    return stringbuild.toString() // Return String
}

fun Mathoperation(Operation : Mathclass.() -> Unit) : Mathclass {
    // Kita panggil konstruktor class Mathclass
    val mathclass = Mathclass()
    mathclass.Operation()
    return mathclass
}