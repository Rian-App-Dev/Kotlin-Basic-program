package `interface`

interface Animal {

    val name: String

    fun sound(): String

    fun description() {
        println("This is a $name, and it makes a '${sound()}' sound.")
    }
}
class Dog : Animal {
    override val name: String = "Dog"
    override fun sound(): String {
        return "Woof"
    }
}
class Cat : Animal {
    override val name: String = "Cat"
    override fun sound(): String {
        return "Meow"
    }
}

fun main() {
    val dog: Animal = Dog()
    val cat: Animal = Cat()

    dog.description()
    cat.description()
}
