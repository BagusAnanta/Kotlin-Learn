fun main(){
    var jam_Masuk : Double = 00.0
    val jam_Kerja_Masuk = 8.00
    var upah : Double
    var telat : Int
    var potongan : Double
    var golongan : Int
    val gaji_Golongan = arrayOf(1.000000,1.500000,2.000000)
    var gaji : Double

    while (jam_Masuk < jam_Kerja_Masuk){
       print("Masukkan jam :")
        jam_Masuk = readLine()!!.toDouble()

        if(jam_Masuk > jam_Kerja_Masuk){
            // We input Gol In here and calculate this
            println("Masukkan golongan gaji")
            golongan = readLine()!!.toInt()
            gaji = gaji_Golongan[golongan]

            // we get golongan value in here

            telat = jam_Masuk.toInt()-jam_Kerja_Masuk.toInt()/5
            println(telat)
            potongan = telat * 0.01
            println(potongan)
            upah = gaji-(potongan * gaji)
            println(upah)
        } else if(jam_Masuk == jam_Kerja_Masuk){
            println("yey gaji anda tidak kami potong")
        }
    }
}