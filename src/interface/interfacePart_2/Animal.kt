package `interface`.interfacePart_2

interface Animal {
    val name:String
    fun sound():String

    fun description(){
        println("This is a $name and it sounds ${sound()}")
    }
}