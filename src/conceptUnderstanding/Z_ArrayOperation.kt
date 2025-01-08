package conceptUnderstanding

fun main(){

    //main1()
    //main2()
    //main3()
    //main4()
    //main5()
}
fun main1(){
    val arr = arrayOf("Rian", 111, true, 5.8)
    println(arr.joinToString())
    println(arr.size)
    println(arr[3])
}

fun main2(){
    print("Enter your name: ")
    val name = readln().toString()
    println(name.length)
}
fun main3(){
    var ar = arrayOf("Hi", "hello", 1,2,3,5.6,3275263525457457450,0.00, true,false)
    ar += "Welcome to the program"
    for (i in ar){
        println(i)
    }
    println("the size of this array is: ${ar.size}")
}
fun main4(){
    val arr = arrayOf(12,2,3,4,5,6,7,9)
    var sum = 0
    for (i in arr){
        print("$i ")
        sum += i
    }
    println("\n$sum")
}
fun main5(){
    val arr = arrayOf("shdgs bdihk sdvkds","dsgfbdsdkfkdkdbc","shdgsbsdbhcbhs")
    val a = arr[2]
    println(a)
    println(a.length)
}
