fun main(){

    scan_barcode()

}

fun scan_barcode() : Boolean{
    var check : Boolean = true

    while (check) {
        println("=== SCAN PRICE ===")
        print("Insert Price : ")
        val price = Integer.parseInt(readLine())
        println("Masih ada ?")
        println("""
            1. Ya
            2. tidak
        """.trimIndent())
        print("Masukkan : ")
        val input = readLine()

        when(input){
            "1" -> check = true
            "2" -> println("Total Belanja : ${hitung_belanja(price)}")
        }
    }
    return check
}

fun hitung_belanja(vararg harga : Int) : Int {

    var total = 0

    for(item in harga){
        total += item
    }

    return total
}