package homework

fun main (){
    val arr = arrayOf("Hello world", 123, 5.123, false)
    print(arr.joinToString())
    println()
    for (i in arr){
        print("$i ")
    }
}