package ProjectConcurrency

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
* jadi kita coba buat project sycronous dengan coroutines yaitu alat membuat roti*/

fun main(){
 mainmenu()

}

fun mainmenu(){
    for(e in 1..30) print("=")
    println("\nBread Maker Machine Menu")
    println("""
        1. Normal Bread
        2. Fermented
        3. Mix dough
        4. Baked
    """.trimIndent())
    print("Select Option :")
    val input = readLine()

    when(input){
        "1" -> MakeBread(true)
        "2" -> FermentDough(false)
        "3" -> MixDought(false)
        "4" -> BakeDought(false)
        else -> println("No have menu please repeate you menu")
    }
}

fun MakeBread(NextStep : Boolean) : String? {
    for (e in 1..30) print("=")
    println("\nBread Weigh")
    print("""
         300gr
         500gr
         900gr
    """.trimIndent())
    print("\nSelect Option :")
    val inputweight  = readLine()

    for (e in 1..30) print("=")
    println("\nBread Skin Color")
    println("""
         Light
         Brown
         Extra Brown
    """.trimIndent())
    print("\nSelect Option :")
    val inputcolor = readLine()

    // input data in here for save option weight and color bread
    // Key -> inputweight, value -> inputcolor
    val mutabledatabread = mutableMapOf<String?,String?>().put(inputweight,inputcolor)

    // start in here
    MixDought(NextStep)

    return mutabledatabread
}

// make Mix dought function
fun MixDought(NextStep : Boolean) = runBlocking {
    launch {
        val Timemixing = 1000L
        print("Mixing Now Please wait")
        LoadingProcess(Timemixing,10)
        // we must next next coroutine function ferment
        if(!NextStep) println("Mixing complete,now please take out you dough") else FermentDough(NextStep)
    }

    // Main thread
    println("Please wait in few second")
    if(NextStep) println("Step 1. Mixing a dough") else ("Mixing a dough")
}

fun FermentDough(NextStep: Boolean) = runBlocking {

    launch {
        // Ferment process in here
        val TimeFerment = 2000L
        print("Ferment Now Please Wait")
        LoadingProcess(TimeFerment,10)
        if(!NextStep) println("Ferment is complete, now please take out you dough") else BakeDought(NextStep)
    }

    println("Please wait in few second")
    if(NextStep) println("Step 2. Ferment a dough") else ("Ferment a dough")
}

fun BakeDought(NextStep: Boolean) = runBlocking {
    launch {
        // Bake process in here
        val TimeBake = 3000L
        print("Bake Now Please Wait")
        LoadingProcess(TimeBake,10)
        println("Enjoy you Bread :)")
    }
    println("Please wait in few second")
    if(NextStep) println("Step 3. Bake a dought") else ("Bake a dough")
}

fun LoadingProcess(Times : Long,Count : Int) = runBlocking {
    // i gonna make some wait dot processing use loop and coroutine
    for(i in 1..Count){
        if(i <= Count){
            delay(Times)
            print(".")
        }
    }
}

