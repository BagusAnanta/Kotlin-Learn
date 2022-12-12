fun main(){
    // List
    // Sama kayak Array

    //TODO: List iu dibagi menjadi dua ada yang bisa dirubah (Mutable) ada juga juga yang tidak bisa dirubah (Immutable)

    // TODO: Contoh List yang bisa dirubah
    val data_angka = mutableListOf(1,2,3,4,5,6) //TODO -> List ini bersifat muttable (Dapat dirubah)
    val data_nama = listOf("Fanny","Lydia","Ana","Julian") //TODO -> List ini bersifat immutable (Tidak dapat dirubah)


    //listof() untuk mode hanya read only
    val data = listOf<Int>(1,2,3,4,5,6,1)
    println(data)
    println("Panjang data = ${data.size}")

    // mutableListOf() -> untuk list yang bisa di read dan write
    val data_asam_amino = mutableListOf<String?>("Met","Ala","Lys","Arg","Asp","Gly")
    val silence_muttan = data_asam_amino.add(1,"Phe") // ditambah jadi, mutasi phelalanin
    println("Hasil Mutasi : $data_asam_amino")

    // bisa kita hapus
    val deletion = data_asam_amino.removeAt(2)
    println("Hasil delesi : $data_asam_amino")

}