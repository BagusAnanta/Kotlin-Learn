import kotlinx.coroutines.*

fun main(){

}

// TODO: kita bisa gunakan CorountineDispatcher untuk menentukan thread yang berfungsi untuk menjalakna coroutine

// TODO : Dispatcher.Default -> ini dasar dan standar digunakan kayak gika gunakan tadu launch,async,dll. Dispacher.Default ini menggunakan kumpulan thread yang ada pada jvm
// EX: Cara pakai

fun DispacherDefault() = runBlocking {
    // TODO : Bisa gini atau dibuat lauch(Dispatcher.Default){}
    launch {
        // all algoritm
    }
}

// TODO: Dispatcher.IO -> ini dipake untuk membokar pemblokiran operasi I/O
fun DispacherIO() = runBlocking {
    launch(Dispatchers.IO) {
        // Implement algortm in here
    }
}

// TODO: Dispatcher.Uniconfined -> Dispatcher ini akan menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titik penangguhan. Setelah penangguhan, coroutines akan dilanjutkan pada thread dimana komputasi penangguhan yang dipanggil.
// TODO: Sebagai contoh, ketika fungsi a memanggil fungsi b, yang dijalankan dengan dispatcher dalam thread tertentu, fungsi a akan dilanjutkan dalam thread yang sama dengan fungsi b dijalankan. Perhatikan kode berikut:

fun DispacherUniconfined() = runBlocking {

    launch(Dispatchers.Unconfined){
        println("Starting in ${Thread.currentThread().name}")
        delay(1000L)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

// TODO: Ada beberapa builder yang digunakan untuk menentukan thread yang mau dibutuhkan
// Kita bisa menentukan thread, jadi thread akan jalan di thread yang sama atau single thread context atau thread pool/ bisa pindah ke thread lain

// TODO: Single Thread Context
// setiap coroutine yang dijalankan akan dijalankan pada thread yang sudah kita tentukan

fun SingleThreadContext() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("MyThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

// TODO: Jadi pada saat setelah menjalankan fungsi delay, tetap coroutine akan berjalan di MyThread

// TODO : Thread Pool
// jadi dispacher yang memiliki kumpulan thread dan pada saat mau mulai atau melanjutkan coroutine ia akan melanjutkan di salah satu thread yang ada pada kumpulan
// TODO: Jadi maksudnya dia akan menjalankan thread yang berbeda jika terjadi delay


// TODO: Jadi kita bakal sediain berapa banyak thread yang ada di pool nanti pada saat jalan program akan berpindah ke thread selanjutnya sesuai yang telah dituliskan didalam pool

fun ThreadPool() = runBlocking<Unit> {
    val dispathcher = newFixedThreadPoolContext(3,"myPool")

    launch(dispathcher){
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}



