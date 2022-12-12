package Inner_class

class Boss_nested(var Name : String) { // outerclass

    fun sihelloboss(){
        println("Hello boss $Name")
    }

    class Employee_Name(var Name : String){ //innerclass

        fun SiHi(){
           // println("Hi my name is $Name, my boss name is ${this@Boss.Name}") fungsi ini akan error di ${this@Boss.Name} karena class ini bersifat nested dan tidak bisa berinteraksi dengan outer class nya
            println("Hello Employee $Name")
        }
    }
}