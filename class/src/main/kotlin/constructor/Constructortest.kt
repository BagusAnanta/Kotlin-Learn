package constructor

fun main(){
    var makanan = Makanan("Pempek")
    var makanan2 = Makanan("Sayur Lodeh","Sayur")
    var makanan3 = Makanan("Pecel Lele","mudah","gurih")

    // Minuman
    var minum = Minuman(Bahan = "Jeruk sankis")
    var minuman2 = Minuman("Jus Apel")

    var minumankaleng1 = Minuman_kaleng("Coca-cola","Soda")
    var minumankaleng2 = Minuman_kaleng("Gogo")

}