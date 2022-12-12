package FunctionType

// TODO: Function type -> tipe data, tetapi dalam bentuk fungsi lambda
// TODO: Function type membuat fungsi menjadi tipe data,ini ada hubungannya dengan lambda dan High-order function
// TODO: Dunction type ini dapat dipakai beberapa kali sama halnya kayak tipe data, dan dengan prilaku yang berbeda
// EX: (Int,Int) -> String (Lambda dengan 2 param dan return string)

// kita bisa menggunakan function type dengan menggunakan typealias
// Todo: Jadi istilahnya kita buat sebuah wadah yang berisi fungsi (wadahnya) dan beserta hasilnya (Kuenya)
typealias Arithmetic = (Int,Int) -> Int // (Tipe data) -> Kembaliannya

// TODO: Kita juga bisa buat function type ini menjadi nullable dengan menambahkan tanda kurung dan tanda tanya
typealias Arithmetic1 = ((Int,Int) -> Int)? // jadi ini sudah bersifat nullable


fun main(){
    // kita pun bisa membuat perhitungan aritmatika lain dengan typealias yang dah dibuat
    val sum : Arithmetic = {valueA,valueB -> valueA + valueB}
    val multyply : Arithmetic = {valueA,valueB -> valueA * valueB}
    val sumnullable :Arithmetic1 = {valueA,valueB -> valueA + valueB}

    // dan untuk instansiasi value sum dan multiply diatas kita pakai fungdi invoke()
    val sumresult = sum.invoke(10,10)
    val multiresult = multyply.invoke(20,20)

    // atau boleh lansung tulis tanpa perlu lagi menulis invoke()
    val sumresult1 = sum(10,20)
    val multiplyresult2 = multyply(20,20)

    // cara untuk memanggil function type dengan nullable
    val sumresult2 = sumnullable?.invoke(1,2)
}