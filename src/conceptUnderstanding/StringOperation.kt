package conceptUnderstanding

fun main(){
    val str = "ABCDEFGHIJKLMNOPQRSTuvwxyz"
    println(str.lowercase())
    println(str.uppercase())
    println(str.length)
    println(str[4])
    println(str[25].uppercase())

    val fName = "Syed"
    var lName = "RIan"
    lName = lName.uppercase()
    var fullName = fName.plus(lName)
    fullName = fullName.uppercase()
    println(fullName)

    
    println(str.compareTo("X"))
}