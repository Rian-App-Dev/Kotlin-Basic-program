package extensionFunction

fun main(){
    val str = "Hello Bangladesh"
    println(str.allCaps())
}

fun String.allCaps():String{
    return "${this.uppercase()}\n${this.lowercase()}"
}