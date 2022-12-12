package KotlinStandardLibrary

fun main(){
    // TODO: Standard function library -> Extension function dari sebuah objek yang menggunakan lambda expression sebagai argument atau Higher order function
    // TODO: Scope function -> Kemampuan fungsi untuk mengambil sebuah objek baik itu dari dalam objek itu sendiri atau dari luar
    // TODO: Scope function terdiri dari -> let,run,with,apply,also

    // TODO: Terdapat beberapa cara untuk akses konteks pada sebuah objek -> lambda receiver (this) atau lambda argument (it)

    // TODO: Contoh dengan lambda receiver (this) -> menggunakan fungsi run,with,dan apply
    // TODO: Kalau pakai ini, kita cuma bisa akses objek di satu kelas itu aja ngak bisa dari luar objek lain jadi kalo kita pakai string builder sebagai objek cuma isi/function string builder itu aja yang dipanggil

    val appendtext = StringBuilder().apply {
        // Disini kita bisa pakai fungsi apa saja yang sudah ada didalam objek kelas StringBuilder
        append("Hello ")
        append("Kotlin")
    }

    val appendtextrun = StringBuilder().run {
        // sama aj kayak apply
        append("Hello ")
        append("World ")
    }

    // TODO: Contoh dengan lambda argument (it) -> menggunakan fungsi let dan also
    // TODO: Kalau ini berbeda dengan lambda receiver, kita bisa inisialisasi variabel lain dari luar lambda
    val text = "Hallo"
    val x = 1
    text.let {
        val message = "$it kotlin"
        println(message)
    }

    // Atau bisa kita tambah parameter, ingat hanya 1 parameter karena lambdanya sudah dideklarasikan dengan 1 parameter
    text.let { value ->
        val message = "$value kotlin"
        println(message)
    }

    x.let { y ->
        val operation = x + y
        println(operation)
    }

    // TODO: Kalau ini also, sama halnya seperti let

    text.also { value ->
        val message = "$value kotlin"
        println(message)
    }





}