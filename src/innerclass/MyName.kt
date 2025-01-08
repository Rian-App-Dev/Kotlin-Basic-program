package innerclass

class MyName{
    val name = "Rian"
    inner class MyNameInner{
        fun getName(){
            val obj = MyName()
            println("My name is: ${obj.name}")
        }
    }
}