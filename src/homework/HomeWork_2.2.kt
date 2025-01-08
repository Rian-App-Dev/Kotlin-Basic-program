package homework

fun main(){
    val name = "Kotlin"
    val age = 22
    val job = true

    if(age <= 0){
        println("Invalid age")
    }
    else if(age>0 && age <= 10){
        println("$name is a child and he can't marry")
    }
    else if (age > 10 && age <= 20){
        println("$name is too young")
    }
    else if(age >= 21 && age <= 35){
        if(job == true){
            println("$name is able to marry")
        }
        else{
            println("$name's age is perfect for marry. But he is unable to marry.")
        }
    }
    else{
        println("$name is over age to marry. So he can't be married")
    }
}