fun main(){
    // collection
    // collection cuma bisa baca, dan tidak bisa meng update datanya
    // simpelnya collection sama seperti Array dan hanya bisa baca/Read only
    val x = listOf<Int>(1,2,3,4,5,6)
    println(x)

    val Deret_nama = setOf<String?>("Bagus","Nabila","Syapiya","Rakha","Laras","Amel","Bagus")
    println(Deret_nama)
    println(Deret_nama.size)

    val Y = setOf<Int>(1,1,2,3,4,5,6)
    val z = mutableSetOf(1,2,1,3,4,5,6)
    println(z.size)




}
