import kotlinx.coroutines.*

// Job -> job memiliki 3 kondisi (isActive,isComplete,isCancelled)
/*
-- Job Condition
* isActive -> Ketika job sedang aktif
* isCompleted -> Ketika job sudah selesai
* isCancelled -> Ketika job telah diberhentikan*/

// TODO: Job juga memiliki state
/*
* New -> Job telah diinisialisasikan tapi belum pernah dikerjakan
* Active -> Job memiliki status aktif walaupun dia dalam keadaan suspended dianggap jobnya aktif
* Completed -> Ketika job sudah tidak berjalan lagi baik itu telah selesai task,dibatalkan ataupun yang lainnya
* Cancelling -> Kondisi fungsi cancel() dipanggil pd job yang sedang aktif
* Cancelled -> Dimana job sudah selesai dibatalkan dan dapat juga dianggap sebagai Complete job */

fun main(){
    /*runningjobstart()
    runningjobjoin()*/

    canceljob()
}


// TODO: Create Job
fun examplecreatejob1() = runBlocking {
    // TODO: Cara membuat job baru bisa pakai fungsi launch{} atau job()
    val job = launch{
        // Do something in here
    }
}

// TODO: Atau bisa pakai job()
fun examplecreatejob2() = runBlocking {
    val job = Job()
}

// TODO: Kalo kita mau buat job tanpa mau langsung menjalankannya kita pakai enum CoroutineStart.LAZY
fun createjob() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY){
     TODO("Not Implemented yet")
    }
}

// TODO: Running a Job / Menjalankan job
// TODO: -> Kita bisa pakai fungsi start() atau join()

fun runningjobstart() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY){
        delay(1000L)
        println("Start new job")
    }

    job.start()
    println("Other task")
}

fun runningjobjoin() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY){
        delay(1000L)
        println("Start new job")
    }

    job.join()
    println("Other task")
}

// TODO: Cancelling a job
@OptIn(InternalCoroutinesApi::class)
fun canceljob() = runBlocking {
    val job = launch {
        delay(5000L)
        println("Start new job")
    }

    delay(2000L)
    job.cancel(cause = CancellationException("Time is Up"))
    println("Cancelling job...")
    if(job.isCancelled){
        println("A job is Cancelled because ${job.getCancellationException().message}")
    }

}