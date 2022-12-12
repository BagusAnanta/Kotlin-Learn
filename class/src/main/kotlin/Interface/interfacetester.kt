package Interface

fun main(){
    val button = buttonhelper(true)
    button.setoption(true) // setoption untuk clicklistbutton dan Button

    val button2 = buttonhelper.buttonhelperlistener(true)
    button2.setoption(false) // setoption untuk togglebutton dan Button

    val imagebutt = buttonhelper.imagelistener()
    imagebutt.imageiconpick(123)
    imagebutt.getimage(123)
}