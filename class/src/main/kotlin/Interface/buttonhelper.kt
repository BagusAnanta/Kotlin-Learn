package Interface

class buttonhelper(override var option: Boolean) : Button,clicklistbutton {
    override fun setoption(optionclick: Boolean): Boolean {
        if (optionclick){
            println("Button on click")
            return option
        } else {
            println("Button not click")
            return option
        }
    }


    class buttonhelperlistener(override var option: Boolean) : Button,togglebutton {
        override fun setoption(optionclick: Boolean): Boolean {
            if (optionclick){
                println("Button on click")
                return option
            } else {
                println("Button not click")
                return option
            }
        }
    }

    class imagelistener : imagebutton,iconimagebutton{

        fun imageiconpick(Imagecode : Int){ // ini cara ngakalin supaya dalam satu class iconimage dan imagebutton bisa dipanggil
            super<iconimagebutton>.getimage(Imagecode)
            if (Imagecode.equals(123)){
                println("Image pick complete")
            } else {
                println("Image pick not complete")
            }
        }

        override fun getimage(Imagecode: Int): Int {
            if (Imagecode.equals(123)){
                println("Image pick complete")
            } else {
                println("Image pick not complete")
            }
            return Imagecode
        }
    }

}