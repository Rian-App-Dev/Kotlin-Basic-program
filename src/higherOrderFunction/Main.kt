package higherOrderFunction

fun main(){
    show ({ hello() },"Hello world..")
}


fun hello(){
    println("Hello Bangladesh..")
}

fun show(x: () -> Unit,y:String){
    x()
    println(y)
}