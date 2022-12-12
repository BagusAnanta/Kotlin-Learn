package AnonymousFun

fun main(){

    // TODO: Lambda/Arrow function -> Fungsi yang tidak mempunyai nama,acces modifier,dan keyword fun dan bersifat Anonymous, memiliki parameter,body, dan return type

    // TODO: LambdaFun yang tidak mempunyai parameter
    val printmessagenoparam = { println("Hello, I'm Kotlin") }
    var printnum = { print(1+1) }
    // TODO: Lambda yang mempunyai parameter
    var printmessage1 = {Message : String -> println(Message) }
    var printmessage2 : (String) -> Unit = {Message -> println(Message)}
    val sumdata = {Val1 : Int, Val2 : Int -> Val1 + Val2}

    // TODO: Biasanya Lambda function bisa ditemukan di android studio untuk fungsi tombol -> SetonClickListener{View -> What ?}

    // TODO: Untuk memanggil Lambda function, kita bisa tulis kayak memanggil fungsi biasa
    val printanonym = printmessagenoparam()
    println(printanonym)
    val printsumdata = sumdata(5,5)
    println(printsumdata)

    val counting1 = fun(a: Int,b:Int) {a+b} // -> Anonymous fun
    val counting2 = {a : Int,b:Int -> a+b} // -> ArrowFun/LambdaFun
    println(counting1(2,2))
    println(counting2(2,2))
}