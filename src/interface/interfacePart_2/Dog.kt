package `interface`.interfacePart_2

class Dog:Animal,AnimalOwner {
    override val name: String
        get() = "Dog"

    override fun sound(): String {
        return "Woof"
    }

    override val ownerName: String
        get() = "Rian"

    override fun getOwnerInfo() {
        println("The owner of this dog is: $ownerName")
    }
}