import kotlinx.coroutines.*

fun main() = runBlocking {

    // EX 2
    val Data1 = async { getData1() }
    val Data2 = async { getData2() }
    println("result : ${Data1.await() - Data2.await()}")
}

// TODO: Deferred itu niali tangguhan yang dihasilkan dari proses coroutines apakah berupa nilai atau exception
// TODO: Biasanya Deferred itu identik dengan asycronous yang mana async menghasilakn nilai/mereturn nilai

// EX : Contoh Deferred yang mengembalikan nilai kembalian

suspend fun getData1() : Int{
    delay(1000L)
    return 50000
}

suspend fun getData2() : Int{
    delay(1000L)
    return 75000
}

