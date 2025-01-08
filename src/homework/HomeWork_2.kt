package homework

fun main(){
    println("Printing two person details by using function with parameter")
    person1("Rian", 5.8, 68.5)
    println("============================================")
    person2("Arman", 5.9, 60.4)
}
fun person1(name: String, height: Double, weight: Double){
    println("1st person's name is: $name\n" +
            "1st person's height is: $height\n" +
            "1st person's weight is: $weight")
}

fun person2(name: String, height: Double, weight: Double){
    println("2nd person's name is: $name\n" +
            "2nd person's height is: $height\n" +
            "2nd person's weight is: $weight")
}