package conceptUnderstanding

fun main(){
    val ages = listOf(10,12,15,17,21,22,20,"Rian")
    println(ages)
    println(ages[3])

    val name = mutableListOf("Rian","Arman","Rohan","Arko","Ahnaf")
    name.add(0,"Riazul")
    println(name)

    val mlist = AnotherMutableListOfOperation()
    mlist.main1()
}
class AnotherMutableListOfOperation{

    fun main1(){

        val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
        numbers.add(4,10)
        val evenNumbers = numbers.filter { it % 2 == 0 }
        val notMultiplesOf3 = numbers.filterNot { number -> number % 3 == 0 }

        println(evenNumbers) // [2, 4, 6]
        println(notMultiplesOf3) // [1, 2, 4, 5, 7]

    }
}