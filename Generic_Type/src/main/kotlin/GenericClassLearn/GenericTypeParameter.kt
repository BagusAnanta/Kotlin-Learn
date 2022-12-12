package GenericClassLearn

fun main(){

}

// TODO: Constraint Type Parameter -> Jadi ini berguna untuk membatasi generic nya supaya cuma untuk 1 eksepresi (misal : untuk angka atau cuma untuk huruf), jadi misalnya type nya lain dari yang dideklarasikan dia bakal error
// TODO: Ekspersi -> <NameType : TypeParam>

// TODO: Contoh dalam function, jadi kita batasin T nya cuma untuk number
fun <T : Number> getdatalist(Listdata : List<T>){}

// TODO: Ini juga berlaku didalam class juga, jadi T nya dibatasin untuk string aja
class listdataperson<Name : String>(var Namalist : List<Name>){}