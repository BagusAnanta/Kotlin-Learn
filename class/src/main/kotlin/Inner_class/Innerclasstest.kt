package Inner_class

fun main(){
    // ini inner class
    // cara access inner class adalah dengan menginstansiasi object utamanya (Boss) dan masukkan konstruktornya, lalu nanti baru instansiasi objek inner class
    val boss_name = Boss("Bagus") // instansiasi object konstructor boss

    val employye_name1 = boss_name.Employee("Tono") // instansiasi object constructor employee
    val employee_name2 = boss_name.Employee("Ridwan")

    println("""
         ${employye_name1.siHi()}
         ${employee_name2.siHi()}
    """.trimIndent())


    // ini nested class
    val boss_name_nested = Boss_nested("Joko").sihelloboss()
    val employee_name_nested = Boss_nested.Employee_Name("Bagus").SiHi() // bakal panggil nama employee



}