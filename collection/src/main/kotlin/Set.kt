fun main(){
    // set
    // set berbeda dengan list tadi, dimana jika didalam satu deret ada yang sama, maka dihitung satu, contoh :
    val data_kodon = setOf<String>("ATG","GTA","GAT","ACT","TTT","ATG","GCT","CCT","GGC") // Ada dua ATG
    println(data_kodon) // Akan di print 1x
    println("Jumlah kodon triplet : ${data_kodon.size}") // akan print 8

    // set juga bisa di write dengan mutablesetOf()
    val kodon = data_kodon.toMutableSet() // jadi dia ini bisa diubah dari setof (Cuma bisa baca menjadi MutableSet jadi bisa baca/tulis)
    println(kodon) // dia bakal menduplikasi data_kodon, jadi ada dua nilai set yang sama

    val data_DNA = mutableSetOf<String?>("TAC","ACT","GGG","CTG","CTT","GGG")
    val mutan = data_DNA.add("GAG")
    println(data_DNA)

    // bisa di remove juga
    val deletion = data_DNA.remove("CTT") // bakal remove kodon CTT
    println(data_DNA)

}