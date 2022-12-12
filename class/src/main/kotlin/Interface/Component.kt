package Interface

interface Button {
    var option : Boolean

    fun setoption(optionclick : Boolean) : Boolean
}

interface clicklistbutton : Button { // interface inheritance

    override fun setoption(optionclick: Boolean): Boolean {
        return optionclick
    }

}

interface togglebutton : Button { // interface inheritance

    override fun setoption(optionclick: Boolean): Boolean {
        return optionclick
    }

}

interface imagebutton{
    fun getimage(Imagecode : Int)= Imagecode
}

interface iconimagebutton{
    fun getimage(Imagecode : Int)= Imagecode
}

