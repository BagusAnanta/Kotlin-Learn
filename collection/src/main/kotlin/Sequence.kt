fun main(){
    // TODO: sequent dipakai kalau kita tidak mau mengevaluasi seluruh isi collecton/ lazy evaluation (Diproses/mengevaluasi item yang benar-benar diperlukan)

    // TODO: Perbedaan Eager evaluation dan Layz evaluation
    // TODO: Eager evaluation -> mengevaluasi seluruh nilai yang ada di list/collection
    // Ex :
    val Eagerlist = listOf(1,2,3,4,5,6,7,8,9)
    val evallist = Eagerlist.filter { it % 2 == 0 }
    println(evallist) // dia akan check seluruh isi list dalam Eagerlist

    // TODO: Layz evaluation -> mengevaluasi nilai yang penting aja didalam list/collection

    // TODO : Tanpa Sequence (Eager evaluation)
    val Eagerlistnonseq = (1..1000000).toList()
    Eagerlistnonseq.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
    // TODO : Tanpa sequence, list bakal selesain filter sampe 1 juta, baru mapping data dan baru di print


    // TODO: Dengan Sequence (Layz evaluation)
    // Ex: Misal, kita punya data 1000000 dan perlu di filter dan di map
    val Lazylist = (1..1000000).toList()
    Lazylist.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
    // TODO : Dengen sequence, list bakal dilakukan vertikal atau per item, jadi misal item list 1 karena ngak sesuai kondisi maka langsung di skip sampe sesuai dengan kondisi filter, kalo sudah sesuai dengan kondisi filter lanjut melakukan mapping dan langsung ditampilkan ke konsolnya


    // TODO: Kita bisa buat object sequence pakai generateSequence()
    val seqnum = generateSequence(1) { it + 1 } // ada dua parameter, parameter pertama yang  isinya 1 itu istilanya kayak item pertama didalam list, disini kita mulai dari 1 dan kedua itu lambda expression yang berisi counting + 1 terhadap item pertama yang dah kita tentuin tadi
    // TODO : Peringatan, perlu diketahui juga generateSequence memerlukan fungsi take() untuk menentukkan akhir dari sequence, jika kita tidak menggunakan fungsi take() maka generateSequence() akan dilakukan terus dan mengalami infinite loop
    // Ex: Kita batesin seqnum di sequence sampe 5 kali
    seqnum.take(5).forEach { print(it) }

}