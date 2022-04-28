package properties

class Rumah (bata : String,lantai : String) {
    // properties yang terhubung dengan konstruktor
    var Jenis_bata : String = bata
    var Jenis_lantai : String = lantai

    var No_Rumah : String = ""
        // getter, otomatic return get if you call it
        get() = field // ==  return No_Rumah

        // setter, otomatic set if you input value
        set(value) {
            field = value // this.No_rumah = value
        }
}