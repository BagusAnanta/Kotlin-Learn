
// TODO: Enum berguna untuk menyimpan nilai yang sudah fix/ menyimpan nilai yang bersifat sudah konstan dan enum juga berguna untuk menimalisir terjadinya kesalahan pengetikan
// TODO: Pada prinsipnya Enum itu sama kayak Array yang bisa menyimpan nilai, akan tetapi nilai tersebut berbentuk konstan/ nilai yang sudah fix
/*
* TODO :
*  Contoh : Nilai Pi/Natural (e), kode warna,dan lain lain
*  contoh diatas kita akan membuat enum kode warna
* */

// TODO : Peringatan, Enum secara default bernilai static dan final jadi setelah dideklarasikan kita ngak bisa mengubah isinya
// TODO : Enum class bisa kita deklarasikan didalamnya dengan anonymous class untuk setiap object enum
fun main(){
    // cara panggil enum class
    val ColorRed = ColourCode.RED
    val ColorGreen = ColourCode.GREEN
    val ColorBlue = ColourCode.BLUE
}


// TODO: Contoh kasus
enum class ColourCode(val value : Int) { // Ini konstruktor primer
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class MathCode(val value : Double){ // harus ada primary konstruktor supaya object yang didalam enum bisa diisi/ diinisialisasi
    // disini kita bisa buat anonymous function, akan tetapi kita buat fungsinya dulu dengan abstract/abstrak didalam class enumnya
    e(2.17){ // nilai 2.17 itu ngak bisa diisi kalo belum ada primary konstruktornya
        override fun Printvalue() {
            println("e : $value")
        }
    },

    Pi(3.14){
        override fun Printvalue() {
            println("Pi : $value")
        }
    };

    // TODO: Abstract function untuk print
    abstract fun Printvalue()
}