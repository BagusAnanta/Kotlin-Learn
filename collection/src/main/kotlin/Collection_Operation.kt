fun main(){
    val numberlist = listOf(1,2,3,4,5,6,7,8,9,10)
    val kotlinchar = listOf('k','o','t','l','i','n')

    // TODO: Catatan, it/iterator itu bisa dibilang isi komponen/object list atau presentasikan masing masing item pada item di list


    // TODO: filter() and filterNot()

    // TODO : filter() -> akan menghasilkan list baru dari kondisi yang diberikan
    val evenList = numberlist.filter { it % 2 == 0 } // TODO: Disini kita bakal check kondisi dan bakal buat listBaru
    println(evenList)

    // TODO : filterNot() -> Kita juga bisa filter list yang tidak sesuai dengan kondisinya dengan menggunakan filterNot(), filterNot() ini kebalikannya dari filter()
    val notEvenList = numberlist.filterNot { it % 2 == 0}
    println(notEvenList)

    // TODO: map() -> akan membuat collection list baru sesuai dengan perubahan yang kita buat
    // TODO: Contoh, kita bakal buat list baru dengan map dengan isi yang dikali 5
    val multipliedwith5 = numberlist.map { it * 5 }
    println(multipliedwith5)

    // TODO: count() -> fungsi yang akan digunakan untuk menghitung semua komponen yang ada di dalam list, (ini sama kayak .length)
    println(numberlist.count()) // outputnya == 10
    // TODO: Di list kita ngak bisa .length dan sebagai gantinya menggunakan .count()

    // TODO: dan kita juga bisa nambahin parameter berupa lambda yang berisi kondisi
    println(numberlist.count { it % 3 == 0 }) // jadi outputnya 3 karen jumlah itemnya ada 3 yaitu 3,6,9

    // TODO: find(),firstOrNull(),lastOrNull() -> berfungsi untuk mencari item pada collection yang sesuai dengan kondisi yang kita

    // TODO: find() akan mengembalikan nilainya yang pertama dan fungsi ini tidak menghasilkan list baru/ tidak mengiterasi seluruh item, find(),findOrNull() dan lastOrNull() akan mengembalikan langsung nilainya kalo sudah sesuai kondisi
    // TODO: Contoh, kita bakal cari angka pertama ganjil
    val findfirstoddnum = numberlist.find { it % 2 == 1} // TODO -> Akan menghasilkan 1 karena dari hasil pencariaanya == 1
    println(findfirstoddnum)

    // TODO: firstOrNull() sama kayak find akan tetapi kalo hasil yang dicari tidak ada, maka akan mengembalikan null dan dia dimulai dari nilai awal (1-10)
    val firstOrNullnum = numberlist.firstOrNull { it % 2 == 3 } // akan mengembalikan null karena tidak ada yang hasilnya 3 dari hasil modulus
    println(firstOrNullnum)

    // TODO: lastOrNull() sama kayak first, tapi dimulai dari nilai akhir (10-1)
    val lastorNullnum = numberlist.lastOrNull { it % 2 == 3 }
    println(lastorNullnum)

    // TODO: first() & last() sama kayak sebelumnya (lastorNull() & firstOrNull()) akan tetapi dia akan mengembalikan nilai awal dan akhir dari deretan number list
    val firstnum = numberlist.first()
    val lastnum = numberlist.last()
    println("""
        firstNum = $firstnum
        lastNum = $lastnum
    """.trimIndent())

    // TODO: Kita juga bisa nambahin kondisi, akan tetapi perlu diperhatikan jangan sampai kurang atau lebih dari isi list, karena akan menimbulkan exception
    val checkfirstnum = numberlist.first { it == 1 }

    // TODO: Don't this
    // TODO: val checkfirstnum2 = numberlist.first{it < 1} // Exception!!!

    // TODO: Do this
    val checkfirstnum3 = numberlist.first { it < 2  }

    println(checkfirstnum)
    println(checkfirstnum3)

    // TODO : Last juga sama bisa kita buat kondisi
    val checklastnum = numberlist.last { it > 9 } // Do this
    println(checklastnum)

    // TODO: Sum() -> ini berguna untuk menghitung seluruh isi list
    val sumnumberlist = numberlist.sum()
    println(sumnumberlist)

    // TODO: sorted() -> berguna untuk mengurutkan data secara berurutan secara ascending/naik sesuai dengan urutannya
    val sortchardataascending = kotlinchar.sorted()
    println(sortchardataascending)

    // TODO: Sementara kita bisa mengurutkan data sort secara descending dengan menggunakan fungsi sortedDescending()
    val sortchardatadescending = kotlinchar.sortedDescending()
    println(sortchardatadescending)






}