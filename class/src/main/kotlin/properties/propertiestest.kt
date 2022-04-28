package properties

fun main(){
    val rumah = Rumah("Ringan","Keramik")
    println(rumah.Jenis_bata)
    println(rumah.Jenis_lantai)

    rumah.No_Rumah = "H.6" // ini cara set setternya
    println(rumah.No_Rumah) // ini cara get datanya

}
