
// Data class -> class yang harus ada konstruktor dan gunanya untuk mendeklarasi data variable dan menyimpan data
/**
 * data class punya syarat
 * 1. harus ada konstruktor
 * 2. harus ada val/var
 * 3. Data class ngak bisa di abstract,open,sealed atau inner class
 */

data class Data_class(val Nama : String, val Umur : Int)

data class database_data(val Nama : String,val Umur : Int, val region : String)




