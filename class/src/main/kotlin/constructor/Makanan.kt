package constructor

// primary constructor
class Makanan(var nama_makanan : String, var bahan_utama : String, var tingkat_kesulitan : String, var rasa : String, var daerah_asal : String){

    // init berfunsi untuk mengeksekusi kode didalam class
    init {
        println("Makanan khas $nama_makanan, berasal dari")
    }

   constructor(nama_makanan: String) : this(nama_makanan, bahan_utama = "" , tingkat_kesulitan = "", rasa = "", daerah_asal = ""){ // kalo mau buat this, parameternya harus ada isi semua
       println("Nama makanan : $nama_makanan")
       println("Bahan : $bahan_utama")
   }

   constructor(nama_makanan: String,bahan_utama: String) : this(nama_makanan, bahan_utama, tingkat_kesulitan = "", rasa = "", daerah_asal = ""){ // konstruktor dengan jumlah paramenter yang sama, tidak diperbolehkan walaupun berbeda parameter akan terjadi konflik.
       println("Nama makanan : $nama_makanan")
       println("Bahan : $bahan_utama")
   }

   constructor(nama_makanan: String,tingkat_kesulitan: String,rasa: String) : this(nama_makanan, bahan_utama = "", tingkat_kesulitan, rasa, daerah_asal = ""){
       println("Nama makanan : $nama_makanan")
       println("Bahan : $bahan_utama")
       println("Tingkat kesulitan : $tingkat_kesulitan")
       println("Rasa : $rasa")
   }

}

