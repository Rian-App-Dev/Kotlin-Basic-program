package dataClass

fun main(){
    val info = MyInfo("rian",21,5.8,68)
    val info2 = MyInfo("Arman",21,5.9,60)
    val x = listOf(
        MyInfo("Rian",21,5.8,68),
        MyInfo("Rian",21,5.8,68),
        MyInfo("Rian",21,5.8,68),
        MyInfo("Rian",21,5.8,68),
        MyInfo("Rian",21,5.8,68))

    println(x[2].name)
}