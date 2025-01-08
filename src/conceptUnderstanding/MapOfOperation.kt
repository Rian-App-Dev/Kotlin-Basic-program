package conceptUnderstanding

fun main(){
    val name = mutableMapOf(1 to "Rian", 21 to "Rohan", 3 to "Arman", 4 to "Arko", 5 to "Ahnaf")
    name[6] = "Riaz"
    name[7] = "Ramon"

    println(name[21])
    println(name[5])
}