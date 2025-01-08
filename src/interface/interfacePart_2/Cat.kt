package `interface`.interfacePart_2

class Cat:Animal,AnimalOwner{
    override val name: String
        get() = "Cat"

    override fun sound(): String {
        return "Meow"
    }

    override val ownerName: String
        get() = "Riazul"

    override fun getOwnerInfo() {
        println("The owner of this cat is: $ownerName")
    }
}