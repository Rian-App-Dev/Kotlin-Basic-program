package conceptUnderstanding

fun main(){
    val a:Int ? = readln().toIntOrNull()
    val y = a ?: "Hello"
    println(y)

}