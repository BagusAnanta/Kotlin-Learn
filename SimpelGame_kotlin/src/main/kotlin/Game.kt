fun main(){
    nama_pemain()
}

private fun nama_pemain(){
    val name_data = mutableMapOf<Int,String>(1 to "Layla", 2 to "Esmeralda",3 to "Clint",4 to "Baxia",5 to "Lancelot")

    println("=== Hero Fighter ===")
    println("Select Character")
    println(name_data)
    print("Option :")
    val option = Integer.parseInt(readLine())


}

private fun pemain_review(data_nama : MutableMap<Int,String>){

}