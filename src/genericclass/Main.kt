package genericclass

fun main(){
    val carString = Car("2010")
    val carInt = Car(2012)

    println(carString.getYear())
    println(carInt.getYear())
}


class Car<T>(private val year: T){
    fun getYear(): T {
        return year
    }
}