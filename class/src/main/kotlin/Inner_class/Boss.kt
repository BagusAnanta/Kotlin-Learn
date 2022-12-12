package Inner_class

class Boss(var Name : String) { // outer class

    fun callbos(){
        println("Hallo Employee, i'm you boss")
    }

    // class ini aku anggap sebagai class pembantu, karena dia bisa akses outerclass jadi kita bisa komunikasi antara innerclass dan outerclass maupun sebaliknya
    inner class Employee(var Name_employe : String){ // inner class
        // kita bisa Access outer class dengan kata kunci inner
        fun siHi(){
            println("Hi my name is $Name_employe, my boss name is ${this@Boss.Name}")
            callbos() // jadi kita juga bisa panggil function dari outer class ke inner class
        }
    }
}