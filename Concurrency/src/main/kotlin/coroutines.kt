
import kotlinx.coroutines.*

fun main() = runBlocking {
    // TODO: Jadi dia akan menjalankan Main thread dulu baru menjalankan Second thread setelah Main thread telah selesai

    launch {
        // Second thread / Second Coroutine
        delay(1000L) // -> Suspending function
        println("Coroutines")
    }

    // Main thread / Main Coroutine
    println("Hello,")
    println("World")

    // EX 2
    val capital = async { getCapitan() }
    val income = async { getIncome() }
    println("result : ${capital.await() - income.await()}")
}

// TODO: Penerapan async - await
// Jadi, misal kita punya dua fungsi suspending, dan mau hasilnya dikeluarkan bebarengan maka async dibutuhkan supaya fungsi ini dikeluarkan secara bebarengan
// contoh kehidupan untuk async -> barista kopi yang membuat kopi secara sekaligus dan mengantarkannya secara sekaligus

suspend fun getCapitan() : Int{
    delay(1000L)
    return 50000
}

suspend fun getIncome() : Int{
    delay(1000L)
    return 75000
}
