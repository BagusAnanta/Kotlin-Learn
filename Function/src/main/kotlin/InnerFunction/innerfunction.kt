package InnerFunction

fun main(){
    val data = checknullintegerinner(2,3,4)
    println(data)
}

// TODO: Fungsi didalam fungsi -> Jadi kita bisa membuat fungsi didalam fungsi

// TODO: Contoh Innerfunction
fun externalfunction(Message : String){
    fun innerfunction(Word : String){
        println(Word)
    }

    // didalam fungsi externalfunction kita panggil si innerfunction
    innerfunction(Message)
}

// TODO: Innerfunction juga bisa menggambil parameter yang ada di externalfunction nya, jadi lebih rapi
fun externalfunctionwithoutparamininner(Message : String){
    fun innerfunction(){
        println(Message)
    }

    // didalam fungsi externalfunction kita panggil si innerfunction
    innerfunction()
}

// TODO: Perlu diketahui inner function harus di buat terlebih dahulu baru bisa dipanggil karena kalo kita memanggil innerfunction duluan maka akan terjadi error

fun externalfunctionwitherror(Message : String){
    // innerfunction() -> can't place in here
    fun innerfunction(){
        println(Message)
    }

    // didalam fungsi externalfunction kita panggil si innerfunction
    innerfunction() // -> Place here correct
}


// TODO: Contoh dalam kasus -> Misal, kita punya kode dengan if kondisi

// TODO: Kode kayak gini dah bener tapi kurang rapi dan kita bisa ringkas kodenya kayak gini (Ex2)

fun checknullinteger(valueA : Int?,valueB : Int?,valueC : Int?) : Int {

    if(valueA == null){
        println("This value is null")
    }

    if(valueB == null){
        println("This value is null")
    }

    if(valueC == null){
        println("This value is null")
    }

    return valueA!! + valueB!! + valueC!!
}

// TODO: Ex2 checknullinteger inner function
fun checknullintegerinner(valueA : Int?,valueB : Int?,valueC : Int?) : Int{
    // TODO: Nah disini kita bisa buat fungsi yang digunakan hanya satu untuk check datanya
    fun checkdatanull(value : Int?){
        if(value == null){
            println("This value is null")
        }
    }

    // TODO: Disini kita bisa panggil fungsi checkdatanull
    checkdatanull(valueA)
    checkdatanull(valueB)
    checkdatanull(valueC)

    return valueA!! + valueB!! + valueC!!
}

// TODO: Dan kita juga bisa menggunakan extension function didalam innerfunction

fun checknullintegerinnerextension(valueA : Int?,valueB : Int?,valueC : Int?) : Int{
    // TODO: Nah disini kita bisa buat fungsi yang digunakan hanya satu untuk check datanya
    fun Int.checkdatanull(){
        if(this == null){
            println("This value is null")
        }
    }

    // TODO: Disini kita bisa panggil fungsi checkdatanull dengan cara extension
   valueA?.checkdatanull()
   valueB?.checkdatanull()
   valueC?.checkdatanull()


    return valueA!! + valueB!! + valueC!!
}
