fun main(){
    val timeType : Array<String> = arrayOf("Microsecond","Millisecond","Second","Minute","Hour","Day","Week","Year")
    val valueTime : Array<Long> = arrayOf(1000000,1000,1,60,60,24,7,12)

    println(calculateTime(timeType,4,3,1.0,60))


}

fun calculateTime(timeData : Array<String>,timePos1 : Int,timePos2 : Int,input : Double,timeInput : Long) : Double{

        if (timePos1 < timePos2){
            val result = input * timeInput
            return result
        } else if(timePos1 > timePos2){
            val result = input / timeInput
             return result
        }


    return input
}
