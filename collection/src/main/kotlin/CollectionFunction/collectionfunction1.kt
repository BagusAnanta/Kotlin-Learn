package CollectionFunction

fun main() {

    // TODO: Lanjutan function untuk collection
    val number = listOf(1, 2, 3)

    // TODO: fold() -> kita mudah melakukan perhitungan setiap nilai tanpa melakukan iterasi item yang ada di dalam list
    // TODO: Fold ini menghitung nilai current dari initial atau nilai awal dan ditambah dengan item yang mengarah ke listof nya
    val folddata = number.fold(10) { current, item ->
        println("Current $current")
        println("Item $item")
        current + item
    }

    println("fold result : $folddata")

    // TODO: Jika kita mau mulai hitung dari belakang, maka kita bisa pakai foldRight() dan argument lambda nya beda karena item harus diposisi akhir
    val foldrightdata = number.foldRight(10) { item, current ->
        println("Current $current")
        println("Item $item")
        item + current
    }

    println(foldrightdata)


    // TODO: drop() -> berfungsi untuk memotong atau menghilangkan item yang ada di list berdasarkan length yang ditujuk
    val numberdata = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val dropdata = numberdata.drop(3) // [4,5,6,7,8]
    println(dropdata)

    // TODO: Kalo kita ingin pangkas dari belakang, kita bisa gunakan fungsi dropLast()
    val dropdatalast = numberdata.dropLast(3) // [1,2,3,4,5]
    println(dropdatalast)

    // TODO: take() -> Kebalikan dari drop() fungsi ini akan menyaring item yang berada didalam list yang sesuai berdasarkan index length
    val takedata = numberdata.take(4) // [1,2,3,4]
    println(takedata)

    // TODO: Kalo kita mau take dari index terakhir kita bisa menggunakan takeLast()
    val takelastdata = numberdata.takeLast(4) // [5,6,7,8]
    println(takelastdata)

    // TODO: Slice() -> berfungsi untuk menyaring item pada index tertentu
    // TODO: Catatan -> Hati hati, jika cakupan datanya diluar dari list nya maka akan menimbulkan ArrayIndexOutOfBoundException

    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // -> Contoh list

    val slicedata = total.slice(3..6) // -> dia akan ambil data dari start index ke 3 sampai index ke 6
    println(slicedata)

    // TODO: Dan juga kita bisa menggunakan step karena dia menggunakan range
    val slicedatastep = total.slice(3..6 step 2) // -> dia bakal step 2 angka
    println(slicedatastep)

    // TODO: Misal, kita mau cari posisi yang lebih spesifik kita bisa bikin list lagi untuk menyimpan index nya
    val indexdata = listOf(2, 3, 5, 8) // -> Ini adalah list untuk index
    val slicedatalistofindex = total.slice(indexdata) // -> Kita bakal slice berdasarkan indexdata
    println(slicedatalistofindex)

    // TODO: distinct() -> berfungsi untuk menyaring data yang sama sama kayak set jika ada item yang sama maka akan diambil 1x
    // TODO: Catatan -> fungsi ini ngak bisa kita pakai untuk collection yang bertipe Map dan jika ingin membuat yang mirip maka kita bisa memakai data class (Seperti contoh dibawah)
    val totaldata = listOf(1, 1, 2, 3, 4, 4, 2, 5, 6, 5)
    val distinctdata = totaldata.distinct()
    println(distinctdata) // -> [1,2,3,4,5,6]

    // TODO: Kita juga bisa menggunakan data class karena fungsi distinct() juga bisa juga menggunakan tipe parameter data class
    data class Item(val key: String, val value: Any)

    val item = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "awesome"),
        Item("3", "programming"),
        Item("3", "languange")
    )

    val distincitem = item.distinctBy { it.key } // -> Jadi dia akan memeriksa keynya kalo ada yang sama maka dataclass item akan diskip
    distincitem.forEach {
        println("${it.key} with value ${it.value}") // -> [Kotlin is awesome]
    }

    // TODO: Kita juga bisa ngefilter item dengan panjang yang sama
    val text = listOf("A","B","CC","DD","EEE","F","GGGG")
    val distincchart = text.distinctBy { it.length }
    println(distincchart) // -> [A,CC,EEE,GGGG]

    // TODO: Chunked() -> sama seperti split fungsi ini akan memecah string menjadi bagian kecil dalam berbentuk Array
    // Catatan : Penggunaan chunked() membutuhkan index tidak seperti split yang membutuhkan RegEx
    val word = "TeamRRQ"
    val chunked = word.chunked(4)
    println(chunked) // -> [Team,RRQ]

    // TODO: Kita juga bisa memodifikasi setiap nilai yang telah dipecah, contohnya kita bisa buat dia jadi huruf kecil semua
    val chunkedtranform = word.chunked(4){it.toString().toLowerCase()}
    println(chunkedtranform) // -> [team,rrq]
}


